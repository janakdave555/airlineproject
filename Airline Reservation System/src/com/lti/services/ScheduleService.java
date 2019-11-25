package com.lti.services;

import com.lti.model.Schedule;

public interface ScheduleService {
	
	public Schedule addSchedule(Schedule schedule);
	public Schedule updateSchedule(Schedule schedule);
	public void deleteSchedule(Schedule schedule);
	public Schedule findSchedule(int schedule_id);
	public Schedule findScheduleWithFlight(int flight_id);
}
