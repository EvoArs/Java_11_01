/**
 * Epic — задача, состоящая из подзадач.
 * Про неё известны:
 * id (число)
 * subtasks — массив из подзадач, каждая из которых является простым текстом (String);
 */
public class Epic extends Task {
    protected String[] subtasks;

    public Epic(int id, String[] subtasks) {
        super(id);
        this.subtasks = subtasks;
    }
    // Добавил геттеры полям
    public String[] getSubtasks() {
        return subtasks;
    }
}