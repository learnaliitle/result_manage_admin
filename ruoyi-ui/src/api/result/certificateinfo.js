import request from '@/utils/request'

// 查询档案资料上传列表
export function listCertificateinfo(query) {
  return request({
    url: '/result/certificateinfo/list',
    method: 'get',
    params: query
  })
}

// 查询档案资料上传详细
export function getCertificateinfo(id) {
  return request({
    url: '/result/certificateinfo/' + id,
    method: 'get'
  })
}

// 新增档案资料上传
export function addCertificateinfo(data) {
  return request({
    url: '/result/certificateinfo',
    method: 'post',
    data: data
  })
}

// 修改档案资料上传
export function updateCertificateinfo(data) {
  return request({
    url: '/result/certificateinfo',
    method: 'put',
    data: data
  })
}

// 删除档案资料上传
export function delCertificateinfo(id) {
  return request({
    url: '/result/certificateinfo/' + id,
    method: 'delete'
  })
}
