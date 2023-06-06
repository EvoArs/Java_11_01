import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TasksTest {

    @Test
    public void testMethodForTheSearchQueryTrue() {
        SimpleTask task = new SimpleTask(01, "task");
        String query = "task";
        boolean expected = true;
        boolean actual = task.matches(query);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMethodForTheSearchQueryFalse() {
        SimpleTask task = new SimpleTask(02, "прыыыыжок");
        String query = "task";
        boolean expected = false;
        boolean actual = task.matches(query);
        Assertions.assertEquals(expected, actual);
    }
}
