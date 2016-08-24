package br.com.unipejet.dao;

import br.com.unipejet.entity.Passenger;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Repository("passengerDao")
public class PassengerDaoImpl extends AbstractDao<Integer, Passenger> implements PassengerDao {

    static final Logger logger = LoggerFactory.getLogger(PassengerDaoImpl.class);

    @Override
    public Passenger findById(int id) {
        logger.info("Busanco passageiro: {}", id);
        Passenger passenger = getByKey(id);
        return passenger;
    }

    @Override
    public void save(Passenger passenger) {
        logger.info("Salvando passageiro... ");
        persist(passenger);
    }

    @Override
    public void delete(int id) {
        logger.info("Deletando passageiro: {}", id);
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("id", id));
        Passenger passenger = (Passenger) criteria.uniqueResult();
        delete(passenger);
    }

    @Override
    public List<Passenger> findAllPassenger() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("name"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List<Passenger> passengers = (List<Passenger>) criteria.list();
        return passengers;
    }
}
