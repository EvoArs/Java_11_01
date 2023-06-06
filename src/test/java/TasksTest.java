import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void testMethodForTheSearchQueryTrueSimpleTask() {
        SimpleTask task = new SimpleTask(01, "тут есть то самое слово");
        String query = "то самое слово";
        boolean expected = true;
        boolean actual = task.matches(query);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMethodForTheSearchQueryFalseSimpleTask() {
        SimpleTask task = new SimpleTask(02, "прыыыыжок");
        String query = "то самое слово";
        boolean expected = false;
        boolean actual = task.matches(query);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMethodForTheSearchQueryTrueEpic() {
        String[] subtasks = {"куры", "млеко", "яйки"};
        Epic epic = new Epic(01, subtasks);
        String query = "яйки";
        boolean expected = true;
        boolean actual = epic.matches(query);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMethodForTheSearchQueryFalseEpic() {
        String[] subtasks = {"куры", "млеко", "яйки"};
        Epic epic = new Epic(02, subtasks);
        String query = "Светлане Соколовой";
        boolean expected = false;
        boolean actual = epic.matches(query);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMethodForTheSearchQueryTrueMeeting() {
        Meeting meeting = new Meeting(
                01,
                "Странная музыка 2000-х",
                "Пушной как средство от бессонницы",
                "07.06.2023"
        );
        String query = "Пушной";
        boolean expected = true;
        boolean actual = meeting.matches(query);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMethodForTheSearchQueryFalseMeeting() {
        Meeting meeting = new Meeting(
                01,
                "Странная музыка 2000-х",
                "Пушной как средство от бессонницы",
                "07.06.2023"
        );
        String query = "2024";
        boolean expected = false;
        boolean actual = meeting.matches(query);
        Assertions.assertEquals(expected, actual);
    }
}
