package com.example.denglu.service;

import com.example.denglu.pojo.Librarymycollect;
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
public interface ILibrarymycollectService extends IService<Librarymycollect> {

    List<Librarymycollect> getall(Integer id);
}
