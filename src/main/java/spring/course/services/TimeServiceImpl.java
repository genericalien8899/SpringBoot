package spring.course.services;

import org.springframework.stereotype.Service;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import spring.course.config.TimeAPIConfig;
import spring.course.model.TimeAPIResponse;

@Service
public class TimeServiceImpl implements TimeService {

    private TimeAPIConfig timeApiConfig;

    public TimeServiceImpl(TimeAPIConfig timeApiConfig){
        this.timeApiConfig = timeApiConfig;
    }

    @Override
    public String getCurrentTime(String timezone) {

        HttpResponse<TimeAPIResponse> response = Unirest.get(timeApiConfig.getEndpoint()+timezone)
        .asObject(TimeAPIResponse.class);
       
        return response.getBody().getDateTime();
    }

}
