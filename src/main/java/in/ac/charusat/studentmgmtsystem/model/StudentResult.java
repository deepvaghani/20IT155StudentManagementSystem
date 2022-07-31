package in.ac.charusat.studentmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentResult {
    @Id
    private Integer id;

    private String courseid;

    private String result;

    public StudentResult(Integer id, String courseid, String result) {
        this.id = id;
        this.courseid = courseid;
        this.result = result;
    }

    public StudentResult() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
