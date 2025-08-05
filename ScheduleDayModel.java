package app.models;

import java.time.LocalDate;
import java.util.List;

public class ScheduleDayModel {
    private LocalDate date;
    private List<String> events; // допустим пока просто строки

    public ScheduleDayModel(LocalDate date, List<String> events) {
        this.date = date;
        this.events = events;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<String> getEvents() {
        return events;
    }
}
