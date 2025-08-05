package app.views;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import app.viewmodels.ScheduleCalendarDayViewModel;

public class ScheduleCalendarDayView extends StackPane implements View {
    private final Label dayLabel;

    public ScheduleCalendarDayView() {
        getStyleClass().add("schedule-calendar-day");
        this.dayLabel = new Label();
    }

    public void bind(ScheduleCalendarDayViewModel viewModel) {
        dayLabel.textProperty().bind(viewModel.dayLabelProperty());
    }

    public void initialize() {
        getChildren().add(dayLabel);
    }
}