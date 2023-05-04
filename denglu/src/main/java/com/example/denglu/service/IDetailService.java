package com.example.denglu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.denglu.pojo.Detail;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 老李
 * @since 2023-03-22
 */
public interface IDetailService extends IService<Detail> {

    Detail getDetail(Integer id);
}
