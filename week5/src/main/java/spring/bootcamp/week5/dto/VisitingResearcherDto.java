package spring.bootcamp.week5.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VisitingResearcherDto extends InstructorDto {
    private double hourlySalary;
}
