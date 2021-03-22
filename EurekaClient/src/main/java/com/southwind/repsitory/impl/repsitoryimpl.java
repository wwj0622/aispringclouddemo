package com.southwind.repsitory.impl;

import com.southwind.entity.Student;
import com.southwind.repsitory.StudentRepsitory;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class repsitoryimpl implements StudentRepsitory {

    private static Map<Long,Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "张三", 22));
        studentMap.put(2L, new Student(2L, "李李四", 23));

    }

    @Override
    public Collection<Student> findAll() {

        System.out.println("这是A分支");
        return studentMap.values();
    }
}
