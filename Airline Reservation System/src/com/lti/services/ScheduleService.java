package com.lti.services;

import java.sql.Date;
import java.util.List;

import com.lti.model.Schedule;

public interface ScheduleService {
	
	public Schedule addSchedule(Schedule schedule);
	public Schedule updateSchedule(Schedule schedule);
	public void deleteSchedule(Schedule schedule);
	public Schedule findSchedule(int schedule_id);
	//public List<Schedule> findScheduleWithFlight(int flight_id);
	
	public List<Schedule> findScheduleWithFlight(int sector_id, Date date);
}
