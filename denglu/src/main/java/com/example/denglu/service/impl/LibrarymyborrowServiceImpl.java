package com.example.denglu.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.denglu.pojo.Course;
import com.example.denglu.pojo.Librarymyborrow;
import com.example.denglu.mapper.LibrarymyborrowMapper;
import com.example.denglu.service.ILibrarymyborrowService;
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
public class LibrarymyborrowServiceImpl extends ServiceImpl<LibrarymyborrowMapper, Librarymyborrow> implements ILibrarymyborrowService {

    @Override
    public List<Librarymyborrow> getall(int id) {
        return this.baseMapper.selectList(new QueryWrapper<Librarymyborrow>().eq("pid",id));
    }
}
