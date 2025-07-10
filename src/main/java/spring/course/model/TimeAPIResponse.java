package spring.course.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class TimeAPIResponse {
    
    private String dateTime;


    public TimeAPIResponse(String dateTime) {
        this.dateTime = dateTime;
    }


    public String getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }


    
}