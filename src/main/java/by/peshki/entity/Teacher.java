package by.peshki.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    @Id
    @Column(columnDefinition = "serial")
    private int id;
    @Column(name = "full_name")
    private String fullName;
    @ManyToMany
    private List<Lesson> lessons;




}
