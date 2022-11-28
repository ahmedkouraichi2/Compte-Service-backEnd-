package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.enotes.entity.Compte;
import com.enotes.repository.CompteRepository;

@Service
@Transactional 

public class CompteServiceImp implements CompteService {
    @Autowired 
    CompteRepository compteRepository;

	@Override
	public double  virement(Long codeSource, Long codeDestination, double montant) {
		// TODO Auto-generated method stub
		
		
	     Compte c1=compteRepository.getById(codeSource);
	        Compte c2=compteRepository.getById(codeDestination);
	        c1.setSolde(c1.getSolde()-montant);

	        c2.setSolde(c2.getSolde()+montant);
	        compteRepository.save(c1);
	        compteRepository.save(c2);
	        
			return montant;
		
	}
    


}