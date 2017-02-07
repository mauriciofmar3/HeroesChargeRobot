import java.util.*;
public class TaskList {
	private ArrayList<Task> list;
	public TaskList() {
		super();
		list = new ArrayList<Task>();
	}

	public void add(Task task) {
		list.add(task);
	}

	public boolean isEmpty() {
		return list.size() == 0;
	}

	public Task getNextTask() {
		Task highestPriorityTask = list.get(0);
		for (Task task : list) {
			if (task.priority > highestPriorityTask.priority && task.canStart()) {
				highestPriorityTask = task;
			}
		}
		return highestPriorityTask;
	}
}