package com.example.denglu.mapper;

import com.example.denglu.pojo.Searchresult;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 老李
 * @since 2023-03-24
 */
@Mapper
public interface SearchResultMapper extends BaseMapper<Searchresult> {

    List<Integer> getschoolyear(int pid);

    List<String> getschoolterm(int pid);
}
