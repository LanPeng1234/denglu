package com.example.denglu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.denglu.pojo.Librarymycollect;
import com.example.denglu.mapper.LibrarymycollectMapper;
import com.example.denglu.service.ILibrarymycollectService;
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
public class LibrarymycollectServiceImpl extends ServiceImpl<LibrarymycollectMapper, Librarymycollect> implements ILibrarymycollectService {

    @Override
    public List<Librarymycollect> getall(Integer pid) {
        return this.baseMapper.selectList(new QueryWrapper<Librarymycollect>().eq("pid",pid));
    }
}
