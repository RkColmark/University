package com.IRonak.University.Services;

import com.IRonak.University.Main.UniversityMain;
import com.IRonak.University.Repository.UniversityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class  UniversityServicesImpl implements UniversityServices{

   private UniversityRepository UnivRepo;

   @Autowired
   public UniversityServicesImpl(UniversityRepository theUniversityRepository)
   {
       UnivRepo=theUniversityRepository;
   }

    @Override
    public List<UniversityMain> findAll() {
        return UnivRepo.findAll();
    }

    @Override
    public UniversityMain save(UniversityMain Univ) {
        return UnivRepo.save(Univ);
    }

    @Override
    public Optional<UniversityMain> findById(int theId) {
        return UnivRepo.findById(theId);
    }

}
