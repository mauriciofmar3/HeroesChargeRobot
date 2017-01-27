import java.awt.*;
public class OperationQueue {
	// throttle time in millimeters
	public final int throttle = 100;
	public TaskList taskList;

	public OperationQueue() {
		taskList = new TaskList();
	}

	public void addTask(Task task) {
		taskList.add(task);
	}

	public void start() {
		try {
			for (;;Thread.sleep(throttle)) {
				if (!taskList.isEmpty()) {
					Task task = taskList.getNextTask();
					task.start();
				}
			}
		} catch(Exception e) {
			
		}
	}
}