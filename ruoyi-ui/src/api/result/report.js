import request from '@/utils/request'

// 查询新闻报道上传列表
export function listReport(query) {
  return request({
    url: '/result/report/list',
    method: 'get',
    params: query
  })
}

// 查询新闻报道上传详细
export function getReport(id) {
  return request({
    url: '/result/report/' + id,
    method: 'get'
  })
}

// 新增新闻报道上传
export function addReport(data) {
  return request({
    url: '/result/report',
    method: 'post',
    data: data
  })
}

// 修改新闻报道上传
export function updateReport(data) {
  return request({
    url: '/result/report',
    method: 'put',
    data: data
  })
}

// 删除新闻报道上传
export function delReport(id) {
  return request({
    url: '/result/report/' + id,
    method: 'delete'
  })
}
