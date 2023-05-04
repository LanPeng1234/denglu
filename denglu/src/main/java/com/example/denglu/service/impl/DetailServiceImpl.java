package com.example.denglu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.denglu.pojo.Detail;
import com.example.denglu.mapper.DetailMapper;
import com.example.denglu.service.IDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 老李
 * @since 2023-03-22
 */
@Service
public class DetailServiceImpl extends ServiceImpl<DetailMapper, Detail> implements IDetailService {

    @Override
    public Detail getDetail(Integer id) {
        return this.baseMapper.selectOne(new QueryWrapper<Detail>().eq("pid",id));
    }
}
