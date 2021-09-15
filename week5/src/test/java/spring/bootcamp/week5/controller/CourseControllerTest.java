package spring.bootcamp.week5.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import spring.bootcamp.week5.dto.CourseDto;
import spring.bootcamp.week5.service.CourseService;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CourseControllerTest {

    @Mock
    CourseService courseService;

    @InjectMocks
    CourseController courseController;

    @Test
    void saveSuccessfully(){
        CourseDto expected = new CourseDto();
        expected.setCourseCode("JV121");
        when(courseService.save(any())).thenReturn(expected);

        CourseDto actual = this.courseController.save(course).getBody();

        assertAll(
                () -> assertNotNull(actual),
                () -> assertEquals(expected.getCourseCode(), actual.getCourseCode()),
                () -> assertEquals(expected, actual)
        );
    }

    @Test
    void deleteSuccessfully(){

    }

}
