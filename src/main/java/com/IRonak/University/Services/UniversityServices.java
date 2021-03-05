package com.IRonak.University.Services;

import com.IRonak.University.Main.UniversityMain;

import java.util.List;
import java.util.Optional;

public interface UniversityServices {

    public List<UniversityMain> findAll();
    public UniversityMain save(UniversityMain Univ);
    public Optional<UniversityMain> findById(int theId);

}

