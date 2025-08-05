package app.controllers;

import app.viewmodels.ScheduleCalendarDayViewModel;
import app.views.ScheduleCalendarDayView;

public class ScheduleCalendarDayController {
    private final ScheduleCalendarDayViewModel viewModel;
    private final ScheduleCalendarDayView view;

    public ScheduleCalendarDayController() {
        this.viewModel = new ScheduleCalendarDayViewModel();
        this.view = new ScheduleCalendarDayView();
        this.view.bind(viewModel);
    }

    public void initialize() {
    }

    public ScheduleCalendarDayView getView() {
        return view;
    }

    public ScheduleCalendarDayViewModel getViewModel() {
        return viewModel;
    }
}