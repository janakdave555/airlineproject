package com.lti.repository;

import java.sql.Date;
import java.util.List;

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
	public List<Schedule> findScheduleWithFlight(int sector_id , Date date) {

		Schedule schedule=new Schedule();
		String q="select sch from Schedule sch where sch.flight_date=?2 AND flight_id in (Select f from Flights f where f.sector.sector_id=?1)";
		TypedQuery<Schedule> query =em.createQuery(q,Schedule.class);
		query.setParameter(1, sector_id);
		query.setParameter(2,date);
		List<Schedule> list = query.getResultList();
		for (Schedule li :list)
		{
			System.out.println("\n\n-----"+list);
		}
		
		return list;
		
		
	//	Schedule sch=query.getSingleResult();
		//return sch;
	}

}
