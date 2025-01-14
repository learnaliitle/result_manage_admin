import request from '@/utils/request'

// 查询软件著作权列表
export function listCopyright(query) {
  return request({
    url: '/result/copyright/list',
    method: 'get',
    params: query
  })
}

// 查询软件著作权详细
export function getCopyright(id) {
  return request({
    url: '/result/copyright/' + id,
    method: 'get'
  })
}

// 新增软件著作权
export function addCopyright(data) {
  return request({
    url: '/result/copyright',
    method: 'post',
    data: data
  })
}

// 修改软件著作权
export function updateCopyright(data) {
  return request({
    url: '/result/copyright',
    method: 'put',
    data: data
  })
}

// 删除软件著作权
export function delCopyright(id) {
  return request({
    url: '/result/copyright/' + id,
    method: 'delete'
  })
}
