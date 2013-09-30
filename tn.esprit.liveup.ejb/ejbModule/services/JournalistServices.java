package services;


import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import tn.esprit.liveup.ejb.Journalist;


@Stateless
@LocalBean
public class JournalistServices implements JournalistServicesRemote, JournalistServicesLocal {

   EntityManager entityManager;
    public JournalistServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void createJournalist(Journalist journalist) {
		entityManager.persist(journalist);
		
	}

	@Override
	public void updateJournalist(Journalist journalist) {
		entityManager.merge(journalist);
		
	}

	@Override
	public void deleteJournalist(Journalist journalist) {
		entityManager.remove(entityManager.merge(journalist));
		
	}

	@Override
	public Journalist findJournalistById(int idjournalist) {
		Journalist journalist= entityManager.find(Journalist.class, idjournalist);
		return journalist;
	}

	@Override
	public List<Journalist> findAllJournalist() {
		Query query = entityManager.createQuery("select j from Journalist j");
		return query.getResultList();
	}

}
