import com.fy.Dao.SchoolReponsitory;
import com.fy.Dao.StudentRepository;
import com.fy.Entity.School;
import com.fy.Entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@EnableMongoRepositories(basePackages = "com.fy.Dao")
@SpringBootTest
public class JpaMongodbApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SchoolReponsitory schoolReponsitory;


    @Test
    public void contextLoads() {
    }

    /**
     * 第一次单元测试
     * - student实体没有加home属性
     *
     * @throws Exception
     */
    @Test
    public void insertStudentWithoutHome() throws Exception {
        School school1 = schoolReponsitory.findSchoolByName("南京路中学");
        School school2 = schoolReponsitory.findSchoolByName("北京路中学");

        System.out.println(school1);
        System.out.println(school2);

        schoolReponsitory.save(new  School(1L,"南京路中学","南京路"));

        studentRepository.save(new Student(1L, "小明", 30,school1));
        studentRepository.save(new Student(2L, "小红", 40,school1));
        studentRepository.save(new Student(3L, "小王", 50,school2));
    }

    /**
     * 第二次单元测试
     * - student实体加home属性
     *
     * @throws Exception
     */
    @Test
    public void insertStudentWitHome() throws Exception {
        School school1 = schoolReponsitory.findSchoolByName("南京路中学");
        School school2 = schoolReponsitory.findSchoolByName("北京路中学");

//      studentRepository.save(new Student(4L, "tom", 30,school1,"1小区"));
//      studentRepository.save(new Student(5L, "peter", 40,school1,"2小区"));
//      studentRepository.save(new Student(6L, "joy", 50,school2,"3小区"));
    }

    /**
     * 对查询结果打印
     */
    @Test
    public void findAll() {
        List<Student> students = studentRepository.findAll();
        students.forEach(student -> {
            System.out.println(student);
        });
    }


}