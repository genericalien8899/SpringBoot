package spring.course.services;

import org.springframework.stereotype.Service;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import spring.course.config.TImeAPIConfig;
import spring.course.model.TimeAPIResponse;

@Service
public class TimeServiceImpl implements TimeService {

    @Override
    public String getCurrentTime(String timezone) {
        
        private TimeAPIConfig timeApiConfig;

        public TimeServiceImpl(TimeAPIConfig timeApiConfig){
            this.timeApiConfig = timeApiConfig
        }

        HttpResponse<TimeAPIResponse> response = Unirest.get(timeApiConfig.getEndpoint()+timezone)
        .asObject(TimeAPIResponse.class);
       
        return response.getBody().getDateTime();
    }

}
