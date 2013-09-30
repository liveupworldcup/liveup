package services;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.liveup.ejb.Journalist;


@Local
public interface JournalistServicesLocal {

	public void createJournalist(Journalist journalist);
	public void updateJournalist(Journalist journalist);
	public void deleteJournalist (Journalist journalist);
	public Journalist findJournalistById(int idJournalist);
	public List<Journalist> findAllJournalist();
	
	
}
