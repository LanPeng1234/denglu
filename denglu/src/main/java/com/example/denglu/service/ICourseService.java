package com.example.denglu.service;

import com.example.denglu.pojo.Course;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @since 2023-03-13
 */
public interface ICourseService extends IService<Course> {

    List<Course> getCourse(int parseInt);
}
