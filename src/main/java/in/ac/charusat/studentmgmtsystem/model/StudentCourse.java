package in.ac.charusat.studentmgmtsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentCourse {

    @Id
    private Integer id;

    private String courseid;

    private String coursename;

    public StudentCourse(Integer id, String courseid, String coursename) {
        this.id = id;
        this.courseid = courseid;
        this.coursename = coursename;
    }

    public StudentCourse() {
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

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
}
