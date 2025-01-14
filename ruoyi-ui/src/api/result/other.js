import request from '@/utils/request'

// 查询其他上传列表
export function listOther(query) {
  return request({
    url: '/result/other/list',
    method: 'get',
    params: query
  })
}

// 查询其他上传详细
export function getOther(id) {
  return request({
    url: '/result/other/' + id,
    method: 'get'
  })
}

// 新增其他上传
export function addOther(data) {
  return request({
    url: '/result/other',
    method: 'post',
    data: data
  })
}

// 修改其他上传
export function updateOther(data) {
  return request({
    url: '/result/other',
    method: 'put',
    data: data
  })
}

// 删除其他上传
export function delOther(id) {
  return request({
    url: '/result/other/' + id,
    method: 'delete'
  })
}
