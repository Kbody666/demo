package com.example.task;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class TestTask {
	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	//@Scheduled(fixedRate = 3000)
	//@Scheduled(corn = "")
	public void reportCurrentTime() {
		System.out.println("现在的时间："+format.format(new Date()));
	}

}
