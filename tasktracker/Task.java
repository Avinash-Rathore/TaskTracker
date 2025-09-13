package tasktracker;

import java.time.LocalDateTime;

public class Task {
	public static int id = 1;
	private int taskId;
	private String description;
	private String status;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	public Task( String description, String status, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.taskId = id++;;
		this.description = description;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	public Task(String description) {
		this.description=description;
	}
	public int getTaskId() {
		return taskId;
	}
	public String getDescription() {
		return description;
	}
	public String getStatus() {
		return status;
	}
	public static void setId(int id) {
		Task.id = id;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	@Override
	public String toString() {
		return taskId +" "+description+" "+status;
	}	
	
}
