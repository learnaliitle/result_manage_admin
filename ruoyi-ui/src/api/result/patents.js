import request from '@/utils/request'

// 查询专利信息列表
export function listPatents(query) {
  return request({
    url: '/result/patents/list',
    method: 'get',
    params: query
  })
}

// 查询专利信息详细
export function getPatents(id) {
  return request({
    url: '/result/patents/' + id,
    method: 'get'
  })
}

// 新增专利信息
export function addPatents(data) {
  return request({
    url: '/result/patents',
    method: 'post',
    data: data
  })
}

// 修改专利信息
export function updatePatents(data) {
  return request({
    url: '/result/patents',
    method: 'put',
    data: data
  })
}

// 删除专利信息
export function delPatents(id) {
  return request({
    url: '/result/patents/' + id,
    method: 'delete'
  })
}
