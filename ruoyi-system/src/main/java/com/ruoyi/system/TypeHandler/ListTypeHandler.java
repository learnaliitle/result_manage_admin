package com.ruoyi.system.TypeHandler;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ListTypeHandler<T> extends BaseTypeHandler<List<T>> {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final TypeReference<List<T>> typeReference;

    public ListTypeHandler(Class<T> clazz) {
        this.typeReference = new TypeReference<List<T>>() {};
    }

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, List<T> parameter, JdbcType jdbcType) throws SQLException {
        try {
            ps.setString(i, objectMapper.writeValueAsString(parameter));
        } catch (Exception e) {
            throw new SQLException("Error setting parameter", e);
        }
    }

    @Override
    public List<T> getNullableResult(ResultSet rs, String columnName) throws SQLException {
        try {
            String json = rs.getString(columnName);
            return json == null ? null : objectMapper.readValue(json, typeReference);
        } catch (Exception e) {
            throw new SQLException("Error reading result", e);
        }
    }

    @Override
    public List<T> getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        try {
            String json = rs.getString(columnIndex);
            return json == null ? null : objectMapper.readValue(json, typeReference);
        } catch (Exception e) {
            throw new SQLException("Error reading result", e);
        }
    }

    @Override
    public List<T> getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        try {
            String json = cs.getString(columnIndex);
            return json == null ? null : objectMapper.readValue(json, typeReference);
        } catch (Exception e) {
            throw new SQLException("Error reading result", e);
        }
    }
}
