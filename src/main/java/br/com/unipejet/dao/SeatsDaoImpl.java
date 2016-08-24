package br.com.unipejet.dao;

import br.com.unipejet.entity.Seats;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Repository("seatsDao")
public class SeatsDaoImpl extends AbstractDao<Integer, Seats> implements SeatsDao {

    static final Logger logger = LoggerFactory.getLogger(SeatsDaoImpl.class);

    @Override
    public Seats findById(int id) {
        logger.info("Busanco assento: {}", id);
        Seats seats = getByKey(id);
        return seats;
    }

    @Override
    public void save(Seats seats) {
        logger.info("Salvando assento... ");
        persist(seats);
    }

    @Override
    public void delete(int id) {
        logger.info("Deletando assento: {}", id);
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("id", id));
        Seats seats = (Seats) criteria.uniqueResult();
        delete(seats);
    }

    @Override
    public List<Seats> findAllSeats() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List<Seats> seats = (List<Seats>) criteria.list();
        return seats;
    }
}
