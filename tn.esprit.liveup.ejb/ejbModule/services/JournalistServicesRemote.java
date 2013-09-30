package services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.liveup.ejb.Journalist;

@Remote
public interface JournalistServicesRemote {

	
	public void createJournalist(Journalist journalist);
	public void updateJournalist(Journalist journalist);
	public void deleteJournalist (Journalist journalist);
	public Journalist findJournalistById(int idJournalist);
	public List<Journalist> findAllJournalist();
}
