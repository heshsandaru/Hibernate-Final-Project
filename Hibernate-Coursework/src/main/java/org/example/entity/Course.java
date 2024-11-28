package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Course {
    @Id
    private String programId;
    private String programName;
    private String duration;
    private int fee;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "related_course_id", referencedColumnName = "programId")
    private Course course;

    public Course(String programId, String programName, String duration, int fee) {
        this.programId = programId;
        this.programName = programName;
        this.duration = duration;
        this.fee = fee;
}
}