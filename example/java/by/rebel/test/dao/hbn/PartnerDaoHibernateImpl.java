package by.rebel.test.dao.hbn;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import by.rebel.test.dao.PartnerDao;
import by.rebel.test.dao.hbn.SessionFactoryManager;
import by.rebel.test.domain.Partner;


public class PartnerDaoHibernateImpl implements PartnerDao {

	@Override
	public Partner read(int partnerId) {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		session.getTransaction().begin();
		Partner partner = (Partner) session.get(Partner.class, partnerId);
		session.getTransaction().commit();
		session.close();
		return partner;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Partner> readAll() {
		Session session = SessionFactoryManager.getSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Partner.class);
		List<Partner> partners = criteria.list();
		session.close();
		return partners;
	}
}
