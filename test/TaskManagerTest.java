import models.Task;
import models.TaskManager;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TaskManagerTest {

    @Test
    public void shouldReturnListOfTasks(){
        List<Task> tasks = TaskManager.listOfTasks();
        assertThat(tasks.size(), is(3));
    }
}
