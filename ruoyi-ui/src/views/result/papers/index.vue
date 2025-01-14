<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="论文标题" prop="title">
        <el-input
          v-model="queryParams.title"
          placeholder="请输入论文标题"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="论文领域" prop="researchField">
        <el-input
          v-model="queryParams.researchField"
          placeholder="请输入论文领域"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="位序" prop="authorRank">
        <el-input
          v-model="queryParams.authorRank"
          placeholder="请输入位序"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="是否为通讯作者" prop="correspondingAuthor">
        <el-input
          v-model="queryParams.correspondingAuthor"
          placeholder="请输入是否为通讯作者"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="刊物名称" prop="journalName">
        <el-input
          v-model="queryParams.journalName"
          placeholder="请输入刊物名称"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="发表时间" prop="publishDate">
        <el-date-picker clearable size="small"
          v-model="queryParams.publishDate"
          type="date"
          value-format="yyyy-MM-dd"
          placeholder="选择发表时间">
        </el-date-picker>
      </el-form-item>
      <el-form-item label="DOI号" prop="doi">
        <el-input
          v-model="queryParams.doi"
          placeholder="请输入DOI号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="引用次数" prop="citationCount">
        <el-input
          v-model="queryParams.citationCount"
          placeholder="请输入引用次数"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="关键词" prop="keywords">
        <el-input
          v-model="queryParams.keywords"
          placeholder="请输入关键词"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="起止页码" prop="pageRange">
        <el-input
          v-model="queryParams.pageRange"
          placeholder="请输入起止页码"
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
      <el-form-item label="影响因子" prop="impactFactor">
        <el-input
          v-model="queryParams.impactFactor"
          placeholder="请输入影响因子"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="卷号" prop="volumeNumber">
        <el-input
          v-model="queryParams.volumeNumber"
          placeholder="请输入卷号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="期号" prop="issueNumber">
        <el-input
          v-model="queryParams.issueNumber"
          placeholder="请输入期号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="ISSN号" prop="issn">
        <el-input
          v-model="queryParams.issn"
          placeholder="请输入ISSN号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="CN号" prop="cnNumber">
        <el-input
          v-model="queryParams.cnNumber"
          placeholder="请输入CN号"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="${comment}" prop="pdfPath">
        <el-input
          v-model="queryParams.pdfPath"
          placeholder="请输入${comment}"
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
          v-hasPermi="['result:papers:add']"
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
          v-hasPermi="['result:papers:edit']"
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
          v-hasPermi="['result:papers:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          plain
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['result:papers:export']"
        >导出</el-button>
      </el-col>
      <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="papersList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="主键，自增" align="center" prop="id" />
      <el-table-column label="论文标题" align="center" prop="title" />
      <el-table-column label="论文类型" align="center" prop="paperType" />
      <el-table-column label="论文领域" align="center" prop="researchField" />
      <el-table-column label="位序" align="center" prop="authorRank" />
      <el-table-column label="是否为通讯作者" align="center" prop="correspondingAuthor" />
      <el-table-column label="刊物名称" align="center" prop="journalName" />
      <el-table-column label="收录检索" align="center" prop="indexing" />
      <el-table-column label="发表时间" align="center" prop="publishDate" width="180">
        <template slot-scope="scope">
          <span>{{ parseTime(scope.row.publishDate, '{y}-{m}-{d}') }}</span>
        </template>
      </el-table-column>
      <el-table-column label="DOI号" align="center" prop="doi" />
      <el-table-column label="引用次数" align="center" prop="citationCount" />
      <el-table-column label="关键词" align="center" prop="keywords" />
      <el-table-column label="起止页码" align="center" prop="pageRange" />
      <el-table-column label="关联课题" align="center" prop="projectId" />
      <el-table-column label="作者信息" align="center" prop="authorInfo" />
      <el-table-column label="影响因子" align="center" prop="impactFactor" />
      <el-table-column label="卷号" align="center" prop="volumeNumber" />
      <el-table-column label="期号" align="center" prop="issueNumber" />
      <el-table-column label="ISSN号" align="center" prop="issn" />
      <el-table-column label="CN号" align="center" prop="cnNumber" />
      <el-table-column label="摘要" align="center" prop="abstract" />
      <el-table-column label="备注信息" align="center" prop="remarks" />
      <el-table-column label="${comment}" align="center" prop="pdfPath" />
      <el-table-column label="成功同步" align="center" prop="syncStatus" />
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
      <el-table-column label="${comment}" align="center" prop="userId" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['result:papers:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['result:papers:remove']"
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

    <!-- 添加或修改论文对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="论文标题" prop="title">
          <el-input v-model="form.title" placeholder="请输入论文标题" />
        </el-form-item>
        <el-form-item label="论文领域" prop="researchField">
          <el-input v-model="form.researchField" placeholder="请输入论文领域" />
        </el-form-item>
        <el-form-item label="位序" prop="authorRank">
          <el-input v-model="form.authorRank" placeholder="请输入位序" />
        </el-form-item>
        <el-form-item label="是否为通讯作者" prop="correspondingAuthor">
          <el-input v-model="form.correspondingAuthor" placeholder="请输入是否为通讯作者" />
        </el-form-item>
        <el-form-item label="刊物名称" prop="journalName">
          <el-input v-model="form.journalName" placeholder="请输入刊物名称" />
        </el-form-item>
        <el-form-item label="收录检索" prop="indexing">
          <el-input v-model="form.indexing" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="发表时间" prop="publishDate">
          <el-date-picker clearable size="small"
            v-model="form.publishDate"
            type="date"
            value-format="yyyy-MM-dd"
            placeholder="选择发表时间">
          </el-date-picker>
        </el-form-item>
        <el-form-item label="DOI号" prop="doi">
          <el-input v-model="form.doi" placeholder="请输入DOI号" />
        </el-form-item>
        <el-form-item label="引用次数" prop="citationCount">
          <el-input v-model="form.citationCount" placeholder="请输入引用次数" />
        </el-form-item>
        <el-form-item label="关键词" prop="keywords">
          <el-input v-model="form.keywords" placeholder="请输入关键词" />
        </el-form-item>
        <el-form-item label="起止页码" prop="pageRange">
          <el-input v-model="form.pageRange" placeholder="请输入起止页码" />
        </el-form-item>
        <el-form-item label="关联课题" prop="projectId">
          <el-input v-model="form.projectId" placeholder="请输入关联课题" />
        </el-form-item>
        <el-form-item label="作者信息" prop="authorInfo">
          <el-input v-model="form.authorInfo" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="影响因子" prop="impactFactor">
          <el-input v-model="form.impactFactor" placeholder="请输入影响因子" />
        </el-form-item>
        <el-form-item label="卷号" prop="volumeNumber">
          <el-input v-model="form.volumeNumber" placeholder="请输入卷号" />
        </el-form-item>
        <el-form-item label="期号" prop="issueNumber">
          <el-input v-model="form.issueNumber" placeholder="请输入期号" />
        </el-form-item>
        <el-form-item label="ISSN号" prop="issn">
          <el-input v-model="form.issn" placeholder="请输入ISSN号" />
        </el-form-item>
        <el-form-item label="CN号" prop="cnNumber">
          <el-input v-model="form.cnNumber" placeholder="请输入CN号" />
        </el-form-item>
        <el-form-item label="摘要" prop="abstract">
          <el-input v-model="form.abstract" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="备注信息" prop="remarks">
          <el-input v-model="form.remarks" type="textarea" placeholder="请输入内容" />
        </el-form-item>
        <el-form-item label="${comment}" prop="pdfPath">
          <el-input v-model="form.pdfPath" placeholder="请输入${comment}" />
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
import { listPapers, getPapers, delPapers, addPapers, updatePapers } from "@/api/result/papers";
export default {
  name: "Papers",
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
      // 论文表格数据
      papersList: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        title: null,
        paperType: null,
        researchField: null,
        authorRank: null,
        correspondingAuthor: null,
        journalName: null,
        indexing: null,
        publishDate: null,
        doi: null,
        citationCount: null,
        keywords: null,
        pageRange: null,
        projectId: null,
        authorInfo: null,
        impactFactor: null,
        volumeNumber: null,
        issueNumber: null,
        issn: null,
        cnNumber: null,
        abstract: null,
        remarks: null,
        pdfPath: null,
        syncStatus: null,
        createdAt: null,
        updatedAt: null,
        userId: null
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        title: [
          { required: true, message: "论文标题不能为空", trigger: "blur" }
        ],
        paperType: [
          { required: true, message: "论文类型不能为空", trigger: "change" }
        ],
        authorRank: [
          { required: true, message: "位序不能为空", trigger: "blur" }
        ],
        journalName: [
          { required: true, message: "刊物名称不能为空", trigger: "blur" }
        ],
        publishDate: [
          { required: true, message: "发表时间不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.getList();
  },
  methods: {
    /** 查询论文列表 */
    getList() {
      this.loading = true;
      listPapers(this.queryParams).then(response => {
        this.papersList = response.rows;
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
        paperType: null,
        researchField: null,
        authorRank: null,
        correspondingAuthor: null,
        journalName: null,
        indexing: null,
        publishDate: null,
        doi: null,
        citationCount: null,
        keywords: null,
        pageRange: null,
        projectId: null,
        authorInfo: null,
        impactFactor: null,
        volumeNumber: null,
        issueNumber: null,
        issn: null,
        cnNumber: null,
        abstract: null,
        remarks: null,
        pdfPath: null,
        syncStatus: "0",
        createdAt: null,
        updatedAt: null,
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
      this.title = "添加论文";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const id = row.id || this.ids
      getPapers(id).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改论文";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.id != null) {
            updatePapers(this.form).then(response => {
              this.$modal.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addPapers(this.form).then(response => {
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
      this.$modal.confirm('是否确认删除论文编号为"' + ids + '"的数据项？').then(function() {
        return delPapers(ids);
      }).then(() => {
        this.getList();
        this.$modal.msgSuccess("删除成功");
      }).catch(() => {});
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('result/papers/export', {
        ...this.queryParams
      }, `papers_${new Date().getTime()}.xlsx`)
    }
  }
};
</script>
