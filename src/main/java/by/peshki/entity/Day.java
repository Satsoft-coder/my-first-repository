package by.peshki.entity;

import by.peshki.enumes.DayOfWeek;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import javax.lang.model.element.Name;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Day {
    @Id
    @Column(columnDefinition = "serial")
    private Integer id;
    @Column(name="day_of_week")
    private List<DayOfWeek> dayOfWeek;
}
