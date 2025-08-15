package com.mapper;
import com.entity.Student;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface StudentMapper {
    @Insert("insert into student values(null,#{name},#{age},#{gender})")
    void insert(Student student);

    @Select("select * from student where id=1")
    List<Student> select(Integer id);
    @Select("select * from student")
    List<Student> selectList();

    @Delete("delete from student where id=#{id}")
    void delete(Integer id);
    @Update("update student set name=#{name},age=#{age},gender=#{gender} where name=#{name}")
    void update(Student student);
}