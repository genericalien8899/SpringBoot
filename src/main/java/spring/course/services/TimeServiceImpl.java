package spring.course.services;

import org.springframework.stereotype.Service;

import kong.unirest.Unirest;
import spring.course.model.TimeAPIResponse;

@Service
public class TimeServiceImpl implements TimeService {

    @Override
    public String getCurrentTime(String timezone) {
        
        TimeAPIResponse response = Unirest.get("http://worldtimeapi.org/api/timezone/Chennai/"+timezone).asObject(TimeAPIResponse.class).getBody();
       
        return response.getUtc_datetime();
    }



}
