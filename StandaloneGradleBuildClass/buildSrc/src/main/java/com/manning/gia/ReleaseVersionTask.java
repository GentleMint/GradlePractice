package com.manning.gia;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import com.fasterxml.jackson.databind.ObjectMapper;

class ReleaseVersionTask extends DefaultTask {
	public ReleaseVersionTask() {
	}

	@TaskAction
	void start() {
		ObjectMapper om = null;
		System.out.println("hello!");
	}
}