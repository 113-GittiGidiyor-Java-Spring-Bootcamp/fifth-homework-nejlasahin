package spring.bootcamp.week5.service;

import spring.bootcamp.week5.dto.InstructorDto;

import java.util.List;

public interface InstructorService {
    InstructorDto save(InstructorDto instructorDto);
    void update(InstructorDto instructorDto);
    void delete(long id);
    List<InstructorDto> findAll();
}
