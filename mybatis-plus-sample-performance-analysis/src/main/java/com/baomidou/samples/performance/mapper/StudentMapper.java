package com.baomidou.samples.performance.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.samples.performance.entity.Student;
import org.springframework.stereotype.Component;

/**
 * 学生Mapper层
 * @author nieqiurong 2018/8/11 20:21.
 */
@Mapper
@Component
public interface StudentMapper extends BaseMapper<Student> {


}
