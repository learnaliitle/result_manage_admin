import request from '@/utils/request'

// 查询个人获奖列表
export function listAward(query) {
  return request({
    url: '/result/awardPersonal/list',
    method: 'get',
    params: query
  })
}

// 查询个人获奖详细
export function getAward(id) {
  return request({
    url: '/result/awardPersonal/' + id,
    method: 'get'
  })
}

// 新增个人获奖
export function addAward(data) {
  return request({
    url: '/result/awardPersonal',
    method: 'post',
    data: data
  })
}

// 修改个人获奖
export function updateAward(data) {
  return request({
    url: '/result/awardPersonal',
    method: 'put',
    data: data
  })
}

// 删除个人获奖
export function delAward(id) {
  return request({
    url: '/result/awardPersonal/' + id,
    method: 'delete'
  })
}
