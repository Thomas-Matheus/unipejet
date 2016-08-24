package br.com.unipejet.dao;

import br.com.unipejet.entity.Travel;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Repository("travelDao")
public class TravelDaoImpl extends AbstractDao<Integer, Travel> implements TravelDao {

    static final Logger logger = LoggerFactory.getLogger(TravelDaoImpl.class);

    @Override
    public Travel findById(int id) {
        logger.info("Busanco viagem: {}", id);
        Travel travel = getByKey(id);
        return travel;
    }

    @Override
    public void save(Travel travel) {
        logger.info("Salvando viagem... ");
        persist(travel);
    }

    @Override
    public void delete(int id) {
        logger.info("Deletando viagem: {}", id);
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("id", id));
        Travel travel = (Travel) criteria.uniqueResult();
        delete(travel);
    }

    @Override
    public List<Travel> findAllTravel() {
        Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List<Travel> travel = (List<Travel>) criteria.list();
        return travel;
    }

}