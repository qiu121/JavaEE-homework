package com.github.qiu121;

import com.github.qiu121.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @author <a href="mailto:qiu0089@foxmail.com">qiu121</a>
 * @version 1.0
 * @date 2023/09/16
 */
@SpringJUnitConfig(classes = ApplicationTest.class)
public class ApplicationTest {

    @Test
    void testsStudentService() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        StudentService studentService = context.getBean("studentService", StudentService.class);
        studentService.list().forEach(System.out::println);
    }

}
