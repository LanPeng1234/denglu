package com.example.denglu.service;

import com.example.denglu.pojo.Result;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 老李
 * @since 2023-03-24
 */
public interface IResultService extends IService<Result> {

    List<Result> searchresult(int rid);
}
