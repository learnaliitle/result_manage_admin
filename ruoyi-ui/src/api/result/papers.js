import request from '@/utils/request'

// 查询论文列表
export function listPapers(query) {
  return request({
    url: '/result/papers/list',
    method: 'get',
    params: query
  })
}

// 查询论文详细
export function getPapers(id) {
  return request({
    url: '/result/papers/' + id,
    method: 'get'
  })
}

// 新增论文
export function addPapers(data) {
  return request({
    url: '/result/papers',
    method: 'post',
    data: data
  })
}

// 修改论文
export function updatePapers(data) {
  return request({
    url: '/result/papers',
    method: 'put',
    data: data
  })
}

// 删除论文
export function delPapers(id) {
  return request({
    url: '/result/papers/' + id,
    method: 'delete'
  })
}
