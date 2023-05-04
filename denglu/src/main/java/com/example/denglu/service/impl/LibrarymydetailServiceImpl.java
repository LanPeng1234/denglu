package com.example.denglu.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.denglu.pojo.Librarymydetail;
import com.example.denglu.mapper.LibrarymydetailMapper;
import com.example.denglu.service.ILibrarymydetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 老李
 * @since 2023-03-24
 */
@Service
public class LibrarymydetailServiceImpl extends ServiceImpl<LibrarymydetailMapper, Librarymydetail> implements ILibrarymydetailService {

    @Override
    public Librarymydetail getall(int id) {
        return this.baseMapper.selectOne(new QueryWrapper<Librarymydetail>().eq("id", id));
    }
}
