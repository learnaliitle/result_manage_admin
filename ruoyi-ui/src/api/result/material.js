import request from '@/utils/request'

// 查询继续教育材料列表
export function listMaterial(query) {
  return request({
    url: '/result/material/list',
    method: 'get',
    params: query
  })
}

// 查询继续教育材料详细
export function getMaterial(id) {
  return request({
    url: '/result/material/' + id,
    method: 'get'
  })
}

// 新增继续教育材料
export function addMaterial(data) {
  return request({
    url: '/result/material',
    method: 'post',
    data: data
  })
}

// 修改继续教育材料
export function updateMaterial(data) {
  return request({
    url: '/result/material',
    method: 'put',
    data: data
  })
}

// 删除继续教育材料
export function delMaterial(id) {
  return request({
    url: '/result/material/' + id,
    method: 'delete'
  })
}
