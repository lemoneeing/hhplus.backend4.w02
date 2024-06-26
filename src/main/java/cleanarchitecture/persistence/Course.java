package cleanarchitecture.persistence;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Course {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long courseId;

    @Column(length=50)
    public String courseName;

    @Column
    public Integer capacity;

    @Column
    public Integer countOfApplicants = 0;

    @Column
    @DateTimeFormat(pattern="yy-MM-dd HH:mm")
    public LocalDateTime date;

    public Course(String courseName, Integer capacity, LocalDateTime date){
        this.courseName = courseName;
        this.capacity = capacity;
        this.date = date;
    }
}
