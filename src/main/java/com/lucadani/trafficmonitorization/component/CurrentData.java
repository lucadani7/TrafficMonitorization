package com.lucadani.trafficmonitorization.component;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;

@Component
@Getter
public class CurrentData {
   private final Calendar calendar = Calendar.getInstance();

    public LocalDate toLocalDate() {
        var zoneID = ZoneId.systemDefault();
        var date = getCalendar().getTime();
        return date.toInstant().atZone(zoneID).toLocalDate();
    }

    public void advanceDay() {
        calendar.add(Calendar.DAY_OF_MONTH, 1);
    }
}
