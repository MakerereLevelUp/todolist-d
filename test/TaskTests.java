import models.Tasks;
import org.testng.annotations.Test;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by levelup on 3/16/14.
 */
public class TaskTests {

    @Test
    public void shouldReturnAllTodoItems(){
        List<String> allTasks = Tasks.all();
        assertTrue(allTasks.size() > 0);
    }
}
  
