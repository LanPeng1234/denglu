package com.example.denglu.service;

import com.example.denglu.pojo.Searchresult;
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
public interface ISearchresultService extends IService<Searchresult> {

    int getrid(int schoolyear, String schoolterm, Integer id);

    List<Integer> searchyear(int id);

    List<String> searchterm(int id);
}
