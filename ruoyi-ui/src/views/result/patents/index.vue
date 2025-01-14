<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="专利名称" prop="patentTitle">
        <el-input
          v-model="queryParams.patentTitle"
          placeholder="请输入专利名称"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="专利编号" prop="patentNumber">
        <el-input
          v-model="queryParams.patentNumber"
          placeholder="请输入专利编号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="专利权人" prop="patentOwner">
        <el-input
          v-model="queryParams.patentOwner"
          placeholder="请输入专利权人"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="授权公告日" prop="authorizationDate">
        <el-date-picker clearable size="small"
          v-model="queryParams.authorizationDate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="选择授权公告日">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="申请编号" prop="applicationNumber">
        <el-input
          v-model="queryParams.applicationNumber"
          placeholder="请输入申请编号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="专利申请日" prop="applicationDate">
        <el-date-picker clearable size="small"
          v-model="queryParams.applicationDate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="选择专利申请日">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="本人排名" prop="authorRank">
        <el-input
          v-model="queryParams.authorRank"
          placeholder="请输入本人排名"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="关联课题" prop="projectId">
        <el-input
          v-model="queryParams.projectId"
          placeholder="请输入关联课题"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="createdAt">
        <el-date-picker clearable size="small"
          v-model="queryParams.createdAt"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="选择${comment}">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="${comment}" prop="updatedAt">
        <el-date-picker clearable size="small"
          v-model="queryParams.updatedAt"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="选择${comment}">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="${comment}" prop="pdfUrl">
        <el-input
          v-model="queryParams.pdfUrl"
          placeholder="请输入${comment}"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="userId">
        <el-input
          v-model="queryParams.userId"
          placeholder="请输入${comment}"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="primary" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          plain
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['result:patents:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          plain
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['result:patents:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          plain
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['result:patents:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['result:patents:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="patentsList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="主键，自动递增的专利ID" align="center" prop="id" />
      <el-table-column label="专利名称" align="center" prop="patentTitle" />
      <el-table-column label="专利类型" align="center" prop="patentType" />
      <el-table-column label="专利状态" align="center" prop="patentStatus" />
      <el-table-column label="专利编号" align="center" prop="patentNumber" />
      <el-table-column label="专利权人" align="center" prop="patentOwner" />
      <el-table-column label="授权公告日" align="center" prop="authorizationDate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.authorizationDate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="申请编号" align="center" prop="applicationNumber" />
      <el-table-column label="专利申请日" align="center" prop="applicationDate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.applicationDate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="本人排名" align="center" prop="authorRank" />
      <el-table-column label="备注信息" align="center" prop="remarks" />
      <el-table-column label="关联课题" align="center" prop="projectId" />
      <el-table-column label="作者信息" align="center" prop="authorInfo" />
      <el-table-column label="成果同步" align="center" prop="syncStatus" />
      <el-table-column label="${comment}" align="center" prop="createdAt" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.createdAt, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="${comment}" align="center" prop="updatedAt" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.updatedAt, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="${comment}" align="center" prop="pdfUrl" />
      <el-table-column label="${comment}" align="center" prop="userId" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['result:patents:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['result:patents:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改专利信息对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="专利名称" prop="patentTitle">
          <el-input v-model="form.patentTitle" placeholder="请输入专利名称" />
        </el-form-item>
        <el-form-item label="专利编号" prop="patentNumber">
          <el-input v-model="form.patentNumber" placeholder="请输入专利编号" />
        </el-form-item>
        <el-form-item label="专利权人" prop="patentOwner">
          <el-input v-model="form.patentOwner" placeholder="请输入专利权人" />
        </el-form-item>
        <el-form-item label="授权公告日" prop="authorizationDate">
          <el-date-picker clearable size="small"
            v-model="form.authorizationDate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="选择授权公告日">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="申请编号" prop="applicationNumber">
          <el-input v-model="form.applicationNumber" placeholder="请输入申请编号" />
        </el-form-item>
        <el-form-item label="专利申请日" prop="applicationDate">
          <el-date-picker clearable size="small"
            v-model="form.applicationDate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="选择专利申请日">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="本人排名" prop="authorRank">
          <el-input v-model="form.authorRank" placeholder="请输入本人排名" />
        </el-form-item>
        <el-form-item label="备注信息" prop="remarks">
          <el-input v-model="form.remarks" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="关联课题" prop="projectId">
          <el-input v-model="form.projectId" placeholder="请输入关联课题" />
        </el-form-item>
        <el-form-item label="作者信息" prop="authorInfo">
          <el-input v-model="form.authorInfo" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="${comment}" prop="createdAt">
          <el-date-picker clearable size="small"
            v-model="form.createdAt"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="选择${comment}">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="${comment}" prop="updatedAt">
          <el-date-picker clearable size="small"
            v-model="form.updatedAt"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="选择${comment}">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="${comment}" prop="pdfUrl">
          <el-input v-model="form.pdfUrl" placeholder="请输入${comment}" />
        </el-form-item>
        <el-form-item label="${comment}" prop="userId">
          <el-input v-model="form.userId" placeholder="请输入${comment}" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listPatents, getPatents, delPatents, addPatents, updatePatents } from "@/api/result/patents";

export default {
  name: "Patents",
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 专利信息表格数据
      patentsList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        patentTitle: null,
        patentType: null,
        patentStatus: null,
        patentNumber: null,
        patentOwner: null,
        authorizationDate: null,
        applicationNumber: null,
        applicationDate: null,
        authorRank: null,
        remarks: null,
        projectId: null,
        authorInfo: null,
        syncStatus: null,
        createdAt: null,
        updatedAt: null,
        pdfUrl: null,
        userId: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        patentTitle: [
          { required: true, message: "专利名称不能为空", trigger: "blur" }
        ],
        patentType: [
          { required: true, message: "专利类型不能为空", trigger: "change" }
        ],
        patentStatus: [
          { required: true, message: "专利状态不能为空", trigger: "blur" }
        ],
        authorRank: [
          { required: true, message: "本人排名不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询专利信息列表 */
    getList() {
      this.loading = true;
      listPatents(this.queryParams).then(response => {
        this.patentsList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        id: null,
        patentTitle: null,
        patentType: null,
        patentStatus: "0",
        patentNumber: null,
        patentOwner: null,
        authorizationDate: null,
        applicationNumber: null,
        applicationDate: null,
        authorRank: null,
        remarks: null,
        projectId: null,
        authorInfo: null,
        syncStatus: "0",
        createdAt: null,
        updatedAt: null,
        pdfUrl: null,
        userId: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.id)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加专利信息";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getPatents(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改专利信息";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updatePatents(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addPatents(this.form).then(response => {
              this.$modal.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const ids = row.id || this.ids;
      this.$modal.confirm('是否确认删除专利信息编号为"' + ids + '"的数据项？').then(function() {
        return delPatents(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('result/patents/export', {
        ...this.queryParams
      }, `patents_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
