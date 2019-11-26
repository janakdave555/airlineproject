/*
 * package com.lti.repository;
 * 
 * import java.util.List;
 * 
 * import javax.persistence.EntityManager; import
 * javax.persistence.PersistenceContext; import javax.persistence.TypedQuery;
 * import javax.transaction.Transactional;
 * 
 * import org.springframework.stereotype.Repository;
 * 
 * import com.lti.model.Schedule; import com.lti.model.Sector;
 * 
 * @Repository("sectorRepository") public class TestRepository {
 * 
 * @PersistenceContext EntityManager em;
 * 
 * public List<Schedule> findScheduleWithFlight(int flight_id) {
 * 
 * Schedule schedule=new Schedule(); String
 * q="select sch from Schedule sch where flight_id in(Select f from Flights f where f.sector.sector_id=?1) "
 * ; TypedQuery<Schedule> query =em.createQuery(q,Schedule.class);
 * query.setParameter(1, flight_id);
 * 
 * List<Schedule> list = query.getResultList(); for (Schedule li :list) {
 * System.out.println("\n\n-----"+list); }
 * 
 * return list;
 * 
 * 
 * // Schedule sch=query.getSingleResult(); //return sch; } }
 * 
 * 
 */