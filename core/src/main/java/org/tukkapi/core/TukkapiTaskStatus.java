package org.tukkapi.core;

public interface TukkapiTaskStatus {

	public int getTotalNumberOfTasks();
	
	public int getTotalNumberOfSerielTasks();
	
	public int getTotalNumberOfTasksCompleted();
	
	public int getCurrentRunningTask();
}
