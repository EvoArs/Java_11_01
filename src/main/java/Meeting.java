/**
 * Meeting — задача, описывающая назначенную встречу.
 * Про неё известны:
 * id — число
 * topic — тема обсуждения
 * project — название проекта, который будут обсуждать
 * start — дата и время старта текстом.
 */
public class Meeting extends Task {
    protected String topic;
    protected String project;
    protected String start;

    public Meeting(int id, String topic, String project, String start) {
        super(id);
        this.topic = topic;
        this.project = project;
        this.start = start;
    }
// Добавил геттеры полям
    public String getTopic() {
        return topic;
    }

    public String getProject() {
        return project;
    }

    public String getStart() {
        return start;
    }
}