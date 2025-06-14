package spring.course.services;

import org.springframework.stereotype.Component;

@Component
public interface TimeService {

    String getCurrentTime(String timezone);

}
