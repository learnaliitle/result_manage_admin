import request from '@/utils/request'

// 查询学生获奖信息列表
export function listAward(query) {
  return request({
    url: '/result/awardStudent/list',
    method: 'get',
    params: query
  })
}

// 查询学生获奖信息详细
export function getAward(id) {
  return request({
    url: '/result/awardStudent/' + id,
    method: 'get'
  })
}

// 新增学生获奖信息
export function addAward(data) {
  return request({
    url: '/result/awardStudent',
    method: 'post',
    data: data
  })
}

// 修改学生获奖信息
export function updateAward(data) {
  return request({
    url: '/result/awardStudent',
    method: 'put',
    data: data
  })
}

// 删除学生获奖信息
export function delAward(id) {
  return request({
    url: '/result/awardStudent/' + id,
    method: 'delete'
  })
}
