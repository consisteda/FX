package app.views;

import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.HBox;

public class ScheduleCalendarView extends ScrollPane implements View {
    private final HBox content;

    public ScheduleCalendarView() {
        this.content = new HBox();
        getStyleClass().add("schedule-calendar");
        content.getStyleClass().add("calendar-content");
        setOnMouseEntered(event -> setCursor(Cursor.DEFAULT));
        setOnMouseExited(event -> setCursor(Cursor.DEFAULT));
        setFitToHeight(true);
    }

    public void addItem(Node dayNode) {
        content.getChildren().add(dayNode);
    }

    public void removeItem(Node dayNode) {
        content.getChildren().remove(dayNode);
    }
    
    public void initialize() {  
        setContent(content);
    }
}