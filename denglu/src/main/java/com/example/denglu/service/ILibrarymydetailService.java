package com.example.denglu.service;

import com.example.denglu.pojo.Librarymydetail;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 老李
 * @since 2023-03-24
 */
public interface ILibrarymydetailService extends IService<Librarymydetail> {

    Librarymydetail getall(int id);
}
