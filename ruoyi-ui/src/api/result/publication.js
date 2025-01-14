import request from '@/utils/request'

// 查询著作信息列表
export function listPublication(query) {
  return request({
    url: '/result/publication/list',
    method: 'get',
    params: query
  })
}

// 查询著作信息详细
export function getPublication(id) {
  return request({
    url: '/result/publication/' + id,
    method: 'get'
  })
}

// 新增著作信息
export function addPublication(data) {
  return request({
    url: '/result/publication',
    method: 'post',
    data: data
  })
}

// 修改著作信息
export function updatePublication(data) {
  return request({
    url: '/result/publication',
    method: 'put',
    data: data
  })
}

// 删除著作信息
export function delPublication(id) {
  return request({
    url: '/result/publication/' + id,
    method: 'delete'
  })
}
