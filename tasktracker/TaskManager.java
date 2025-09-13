package tasktracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskManager {
	// LinkedList used to store all task
	List<Task> task = new LinkedList<>();
	// ArrayList used to store all list of progress of all tasks
	List<Task> progress = new ArrayList<>();

	// Method to print the message after any operation
	public void showMessage(String message) {
		System.out.println(message);
		try {
			Thread.sleep(1000); // wait for 3 seconds (3000 ms)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// Clear the console message (optional, works differently per OS)
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	// Method to add a task in List of task
	public void addTask(String description) {
		task.add(new Task(description, "todo", LocalDateTime.now(), LocalDateTime.now()));
//		TaskStorage.saveTask(task);
		showMessage("Task Added Sucessfully" + " (Id: " + (Task.id - 1) + ")");
		
	}

	// Method to display all task
	public List<Task> list() {
//		return TaskStorage.loadTask();
		return task;
	}

	// Method to update an task based on taskId
	public void updateTask(int taskId, String description) {
		for (Task t : task) {
			if (t.getTaskId() == taskId) {
				t.setDescription(description);
//				TaskStorage.saveTask(task);
				showMessage("Task Updated Succesfullyy");
				return;
			}
		}
	}

	// Method to delete a task based on taskId
	public boolean deleteTask(int taskId) {
		for (Task t : task) {
			if (t.getTaskId() == taskId) {
				task.remove(t);
//				TaskStorage.saveTask(task);
				showMessage("Task Removed Succesfully!!");
				return true;
			}

		}
		showMessage("Task ID not present");
		return false;
	}

	// Method to display task --> done
	public List<Task> listDone() {
		for (Task t : task) {
			if (t.getStatus() == "done") {
				progress.add(t);
			}
		}
		return progress;
	}

	// Method to display task --> in-progress
	public List<Task> listInProgress() {
		for (Task t : task) {
			if (t.getStatus() == "in-progress") {
				progress.add(t);
			}
		}
		return progress;
	}

	// Method to display task --> todo
	public List<Task> listTodo() {
		for (Task t : task) {
			if (t.getStatus() == "todo") {
				progress.add(t);
			}
		}
		return progress;
	}

	// Method to mark status --> in-progress
	public void markInProgress(int taskId) {
		for (Task t : task) {
			if (t.getTaskId() == taskId) {
				t.setStatus("in-progress");
				showMessage("Status updated");
				return;
			} else
				showMessage("taskid not available");
		}
		return;
	}

	// Method to mark status --> done
	public void markDone(int taskId) {
		for (Task t : task) {
			if (t.getTaskId() == taskId) {
				t.setStatus("done");
				showMessage("Status updated");
				return;
			} else
				showMessage("taskid not available");
		}
		return;
	}

}
