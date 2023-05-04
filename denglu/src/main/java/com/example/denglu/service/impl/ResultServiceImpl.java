package com.example.denglu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.denglu.pojo.Course;
import com.example.denglu.pojo.Result;
import com.example.denglu.mapper.ResultMapper;
import com.example.denglu.service.IResultService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 老李
 * @since 2023-03-24
 */
@Service
public class ResultServiceImpl extends ServiceImpl<ResultMapper, Result> implements IResultService {

    @Override
    public List<Result> searchresult(int rid) {
        return this.baseMapper.selectList(new QueryWrapper<Result>().eq("rid",rid));
    }
}
