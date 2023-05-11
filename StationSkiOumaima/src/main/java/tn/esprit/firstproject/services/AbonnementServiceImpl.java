package tn.esprit.firstproject.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.firstproject.entitie.Abonnement;
import tn.esprit.firstproject.entitie.Skieur;
import tn.esprit.firstproject.entitie.TypeAbonnement;
import tn.esprit.firstproject.repositories.AbonnementRepository;
import tn.esprit.firstproject.repositories.SkieurRepository;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
public class AbonnementServiceImpl implements AbonnementService{
    private AbonnementRepository abonnementRepository;
    private final SkieurRepository skieurRepository;

    @Override
    public List<Abonnement> retrieveAllAbo() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement AddAbo(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public void removeAbo(Long numAbo) {
abonnementRepository.deleteById(numAbo);
    }

    @Override
    public Abonnement retrieveAbo(Long numAbo) {
        return abonnementRepository.findById(numAbo).orElse(null);
    }
@Override
public List<Abonnement> findByTypeAbonnement(TypeAbonnement typeAbonnement){
        return abonnementRepository.findByTypeAbonnement(typeAbonnement);
}





}
