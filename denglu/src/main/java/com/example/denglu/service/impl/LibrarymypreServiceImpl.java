package com.example.denglu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.denglu.pojo.Librarymypre;
import com.example.denglu.mapper.LibrarymypreMapper;
import com.example.denglu.service.ILibrarymypreService;
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
public class LibrarymypreServiceImpl extends ServiceImpl<LibrarymypreMapper, Librarymypre> implements ILibrarymypreService {

    @Override
    public List<Librarymypre> getall(Integer pid) {
        return this.baseMapper.selectList(new QueryWrapper<Librarymypre>().eq("pid",pid));
    }
}
