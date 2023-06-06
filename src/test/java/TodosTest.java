import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TodosTest {
    @Test //тест из условия
    public void shouldAddThreeTasksOfDifferentType() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    //тесты на метод поиска в классе TodosTest
    @Test
    public void testTaskMethod1() {
        Todos todos = new Todos();
        todos.add(new SimpleTask(01, "Понять как работает этот метод"));
        String[] subtasks = {"Читать 1 раз", "Читать 2 раза", "Читать 3 раза"};
        todos.add(new Epic(01, subtasks));
        Task[] expected = {};
        Task[] actual = todos.search("Схватиться за голову");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testTaskMethod2() {
        Todos todos = new Todos();
        todos.add(new SimpleTask(01, "Понять как работает этот метод"));
        String[] subtasks = {"Читать 1 раз", "Читать 2 раза", "Читать 3 раза"};
        todos.add(new Epic(01, subtasks));
        Task[] expected = {new SimpleTask(01, "Понять как работает этот метод")};
        Task[] actual = todos.search("Понять как работает этот метод");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testTaskMethod3() {
        Todos todos = new Todos();
        todos.add(new SimpleTask(01, "Понять как работает этот метод"));
        todos.add(new Epic(2, new String[]{"Читать 1 раз внимательно"}));
        Task[] expected = {new SimpleTask(01, "Понять как работает этот метод"), new Epic(2, new String[]{"Читать 1 раз внимательно"})};
        Task[] actual = todos.search("");
        Assertions.assertArrayEquals(expected, actual);
    }

}