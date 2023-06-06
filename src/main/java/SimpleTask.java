/**
 * SimpleTask - простая задача, про неё известны:
 * id (число)
 * title (название)
 */

public class SimpleTask extends Task {
    protected String title;

    public SimpleTask(int id, String title) {
        super(id); // вызов родительского конструктора
        this.title = title; // заполнение своих полей
    }

    public String getTitle() {
        return title;
    }

    // переопределение метода поиска задачи по поисковому запросу
    @Override
    public boolean matches(String query) {
        if (title.contains(query)) {
            return true;
        }
        return false;
    }
}