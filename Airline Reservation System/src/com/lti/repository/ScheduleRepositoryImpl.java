package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.model.Schedule;

@Repository("scheduleRepository")
public class ScheduleRepositoryImpl implements ScheduleRepository
{
	@PersistenceContext
	EntityManager em;
	

	@Override
	@Transactional
	public Schedule addSchedule(Schedule schedule) 
	{
	
	schedule=em.merge(schedule);
		em.persist(schedule);
		System.out.println("Schedule Added");
		return schedule;
	
	}



	@Override
	@Transactional
	public Schedule updateSchedule(Schedule schedule)
	{
		em.persist(schedule);
		return schedule;
		
	}



	@Override
	@Transactional
	public void deleteSchedule(Schedule schedule) 
	{
		schedule=em.merge(schedule);
		em.remove(schedule);
		
	}
	
	public Schedule findSchedule(int schedule_id)
	{
		return em.find(Schedule.class, schedule_id);
	}



	@Override
	public Schedule findScheduleWithFlight(int flight_id) {

		Schedule schedule=new Schedule();
		String q="select sch from Schedule sch where flight_id=?1";
		TypedQuery<Schedule> query =em.createQuery(q,Schedule.class);
		query.setParameter(1, flight_id);
		
		
		Schedule sch=query.getSingleResult();
		return sch;
	}

}
