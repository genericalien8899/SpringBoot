package spring.course.services;

import org.springframework.stereotype.Service;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import spring.course.model.TimeAPIResponse;

@Service
public class TimeServiceImpl implements TimeService {

    @Override
    public String getCurrentTime(String timezone) {
        
        HttpResponse<TimeAPIResponse> response = Unirest.get("https://www.timeapi.io/api/time/current/zone?timeZone=Europe%2F"+timezone).asObject(TimeAPIResponse.class);
       
        return response.getBody().getDateTime();
    }

}
