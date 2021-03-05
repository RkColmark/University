package com.IRonak.University.Controller;

import com.IRonak.University.Main.UniversityMain;
//import com.IRonak.University.Services.CourseService;
import com.IRonak.University.Services.UniversityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class UniversityController {


    private UniversityServices universityServices;



    @Autowired
    public UniversityController(UniversityServices theUniversityservices)
    {
        universityServices=theUniversityservices;
    }

@GetMapping("/")
public String RegistrationPage(Model theModel )
{

    UniversityMain stu =new UniversityMain();

    theModel.addAttribute("univ", stu);
    return "registrationpage";

}

@PostMapping("/save")
public String saveEmployee (@ModelAttribute("univ") UniversityMain theUniversity , Model themodel)
{

    universityServices.save(theUniversity);
   // System.out.println(theUniversity);
    themodel.addAttribute("student",theUniversity);
 //   System.out.println("the id"+ theUniversity.getId());
   // System.out.println("the student " + student.getId());
    return "thanku";


}

@GetMapping("/updateData")
public String updateData(@RequestParam("update") int theId,Model theModel){

        Optional<UniversityMain> data= universityServices.findById(theId);

        theModel.addAttribute("univ",data);

    System.out.println(data);



        return "registrationpage";
}


}
