package by.peshki.entity;

import by.peshki.enumes.DayOfWeek;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Lesson {
    @Id
    @Column(columnDefinition = "serial")
    private int id;
    private String Name;
    private Day day;
    @ManyToMany
    private List<Teacher> teachers;


}
