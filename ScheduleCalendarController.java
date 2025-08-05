package app.controllers;

import app.models.ScheduleDayModel;
import app.viewmodels.ScheduleCalendarDayViewModel;
import app.views.ScheduleCalendarDayView;
import app.views.ScheduleCalendarView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ScheduleCalendarController implements Controller<ScheduleCalendarView> {
    private final ScheduleCalendarView scheduleCalendarView;

    public ScheduleCalendarController() {
        this.scheduleCalendarView = new ScheduleCalendarView();
    }

    public void initialize() {
        scheduleCalendarView.initialize();

        List<ScheduleDayModel> models = createDummyDays(7);

        for (ScheduleDayModel model : models) {
            ScheduleCalendarDayViewModel viewModel = new ScheduleCalendarDayViewModel();
            viewModel.setModel(model);

            // Создаем плитку и биндим её
            ScheduleCalendarDayView dayView = new ScheduleCalendarDayView();
            dayView.bind(viewModel);
            dayView.initialize(); 

            scheduleCalendarView.addItem(dayView);
        }
    }

    public ScheduleCalendarView getView() {
        return scheduleCalendarView;
    }

    private List<ScheduleDayModel> createDummyDays(int count) {
        List<ScheduleDayModel> list = new ArrayList<>();
        LocalDate today = LocalDate.now();
        for (int i = 0; i < count; i++) {
            list.add(new ScheduleDayModel(today.plusDays(i), List.of("Событие " + (i + 1))));
        }
        return list;
    }
}
