package app.viewmodels;

import app.models.ScheduleDayModel;
import javafx.beans.property.*;

public class ScheduleCalendarDayViewModel {
    private final StringProperty dayLabel = new SimpleStringProperty();
    private ScheduleDayModel model;

    public void setModel(ScheduleDayModel model) {
        this.model = model;
        dayLabel.set(model.getDate().toString()); // или красиво форматировать
    }

    public StringProperty dayLabelProperty() {
        return dayLabel;
    }
}
