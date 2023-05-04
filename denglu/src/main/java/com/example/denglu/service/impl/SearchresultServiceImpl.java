package com.example.denglu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.denglu.pojo.Searchresult;
import com.example.denglu.mapper.SearchResultMapper;
import com.example.denglu.service.ISearchresultService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
public class SearchresultServiceImpl extends ServiceImpl<SearchResultMapper, Searchresult> implements ISearchresultService {

    @Autowired
    SearchResultMapper searchresultMapper;

    @Override
    public int getrid(int schoolyear, String schoolterm, Integer id) {
        return this.baseMapper.selectOne(new QueryWrapper<Searchresult>().eq("schoolyear", schoolyear).eq("schoolterm", schoolterm).eq("pid", id)).getRid();
    }

    @Override
    public List<Integer> searchyear(int id) {
        return searchresultMapper.getschoolyear(id);
    }

    @Override
    public List<String> searchterm(int id) {
        return  searchresultMapper.getschoolterm(id);
    }
}