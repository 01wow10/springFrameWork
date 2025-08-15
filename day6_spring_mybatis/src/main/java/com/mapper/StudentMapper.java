package com.mapper;
import com.model.Student;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface StudentMapper {
    void save(Student student);
    List<Student> selectList();
}
