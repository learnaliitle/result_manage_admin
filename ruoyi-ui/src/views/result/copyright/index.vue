<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="著作权名称" prop="title">
        <el-input
          v-model="queryParams.title"
          placeholder="请输入著作权名称"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="证书号" prop="certificateNo">
        <el-input
          v-model="queryParams.certificateNo"
          placeholder="请输入证书号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
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
      <el-form-item label="开发完成时间" prop="finishTime">
        <el-date-picker clearable size="small"
          v-model="queryParams.finishTime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="选择开发完成时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="获得时间" prop="puttime">
        <el-date-picker clearable size="small"
          v-model="queryParams.puttime"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="选择获得时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="登记号" prop="registerNo">
        <el-input
          v-model="queryParams.registerNo"
          placeholder="请输入登记号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="著作权人" prop="copyrightOwner">
        <el-input
          v-model="queryParams.copyrightOwner"
          placeholder="请输入著作权人"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="创建时间" prop="created">
        <el-date-picker clearable size="small"
          v-model="queryParams.created"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="选择创建时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="更新时间" prop="updated">
        <el-date-picker clearable size="small"
          v-model="queryParams.updated"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="选择更新时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="关联课题ID" prop="projectId">
        <el-input
          v-model="queryParams.projectId"
          placeholder="请输入关联课题ID"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
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
          v-hasPermi="['result:copyright:add']"
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
          v-hasPermi="['result:copyright:edit']"
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
          v-hasPermi="['result:copyright:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['result:copyright:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="copyrightList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="著作权ID" align="center" prop="id" />
      <el-table-column label="著作权名称" align="center" prop="title" />
      <el-table-column label="证书号" align="center" prop="certificateNo" />
      <el-table-column label="本人排名" align="center" prop="authorRank" />
      <el-table-column label="开发完成时间" align="center" prop="finishTime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.finishTime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="获得时间" align="center" prop="puttime" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.puttime, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="登记号" align="center" prop="registerNo" />
      <el-table-column label="著作权类型" align="center" prop="copyrightType" />
      <el-table-column label="著作权人" align="center" prop="copyrightOwner" />
      <el-table-column label="备注信息" align="center" prop="description" />
      <el-table-column label="成果同步" align="center" prop="syncStatus" />
      <el-table-column label="创建时间" align="center" prop="created" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.created, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="更新时间" align="center" prop="updated" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.updated, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="作者信息" align="center" prop="authorInfo" />
      <el-table-column label="关联课题ID" align="center" prop="projectId" />
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
            v-hasPermi="['result:copyright:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['result:copyright:remove']"
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

    <!-- 添加或修改软件著作权对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="著作权名称" prop="title">
          <el-input v-model="form.title" placeholder="请输入著作权名称" />
        </el-form-item>
        <el-form-item label="证书号" prop="certificateNo">
          <el-input v-model="form.certificateNo" placeholder="请输入证书号" />
        </el-form-item>
        <el-form-item label="本人排名" prop="authorRank">
          <el-input v-model="form.authorRank" placeholder="请输入本人排名" />
        </el-form-item>
        <el-form-item label="开发完成时间" prop="finishTime">
          <el-date-picker clearable size="small"
            v-model="form.finishTime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="选择开发完成时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="获得时间" prop="puttime">
          <el-date-picker clearable size="small"
            v-model="form.puttime"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="选择获得时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="登记号" prop="registerNo">
          <el-input v-model="form.registerNo" placeholder="请输入登记号" />
        </el-form-item>
        <el-form-item label="著作权人" prop="copyrightOwner">
          <el-input v-model="form.copyrightOwner" placeholder="请输入著作权人" />
        </el-form-item>
        <el-form-item label="备注信息" prop="description">
          <el-input v-model="form.description" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="创建时间" prop="created">
          <el-date-picker clearable size="small"
            v-model="form.created"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="选择创建时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="更新时间" prop="updated">
          <el-date-picker clearable size="small"
            v-model="form.updated"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="选择更新时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="作者信息" prop="authorInfo">
          <el-input v-model="form.authorInfo" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="关联课题ID" prop="projectId">
          <el-input v-model="form.projectId" placeholder="请输入关联课题ID" />
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
import { listCopyright, getCopyright, delCopyright, addCopyright, updateCopyright } from "@/api/result/copyright";

export default {
  name: "Copyright",
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
      // 软件著作权表格数据
      copyrightList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        title: null,
        certificateNo: null,
        authorRank: null,
        finishTime: null,
        puttime: null,
        registerNo: null,
        copyrightType: null,
        copyrightOwner: null,
        description: null,
        syncStatus: null,
        created: null,
        updated: null,
        authorInfo: null,
        projectId: null,
        updatedAt: null,
        pdfUrl: null,
        userId: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        title: [
          { required: true, message: "著作权名称不能为空", trigger: "blur" }
        ],
        certificateNo: [
          { required: true, message: "证书号不能为空", trigger: "blur" }
        ],
        authorRank: [
          { required: true, message: "本人排名不能为空", trigger: "blur" }
        ],
        puttime: [
          { required: true, message: "获得时间不能为空", trigger: "blur" }
        ],
        copyrightType: [
          { required: true, message: "著作权类型不能为空", trigger: "change" }
        ],
        copyrightOwner: [
          { required: true, message: "著作权人不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询软件著作权列表 */
    getList() {
      this.loading = true;
      listCopyright(this.queryParams).then(response => {
        this.copyrightList = response.rows;
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
        title: null,
        certificateNo: null,
        authorRank: null,
        finishTime: null,
        puttime: null,
        registerNo: null,
        copyrightType: null,
        copyrightOwner: null,
        description: null,
        syncStatus: "0",
        created: null,
        updated: null,
        authorInfo: null,
        projectId: null,
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
      this.title = "添加软件著作权";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getCopyright(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改软件著作权";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updateCopyright(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addCopyright(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除软件著作权编号为"' + ids + '"的数据项？').then(function() {
        return delCopyright(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('result/copyright/export', {
        ...this.queryParams
      }, `copyright_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
