package in.ac.charusat.studentmgmtsystem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "https://app-20it155studentmgmtsystem.herokuapp.com/")
@SpringBootApplication
public class StudentMgmtSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentMgmtSystemApplication.class, args);
    }

}
