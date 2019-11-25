package com.lti.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Schedule;
import com.lti.repository.ScheduleRepository;

@Service("scheduleService")
public class ScheduleServiceImpl implements ScheduleService {

	@Autowired
	ScheduleRepository scheduleRepository;
	
	@Transactional
	public Schedule addSchedule(Schedule schedule)
	{
		return scheduleRepository.addSchedule(schedule);
	}

	@Override
	@Transactional
	public Schedule updateSchedule(Schedule schedule)
	{
		return scheduleRepository.updateSchedule(schedule);
	}

	@Override
	@Transactional
	public void deleteSchedule(Schedule schedule) 
	{
		scheduleRepository.deleteSchedule(schedule);
		
	}

	@Override
	public Schedule findSchedule(int schedule_id) {
		// TODO Auto-generated method stub
		return scheduleRepository.findSchedule(schedule_id);
	}

	
	public Schedule findScheduleWithFlight(int flight_id)
	{
		return scheduleRepository.findScheduleWithFlight(flight_id);
	}
	
}
