package com.example.employer.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.employer.DTO.EmployerDTO;
import com.example.employer.DTO.EmployerSaveDTO;
import com.example.employer.DTO.EmployerUpdateDTO;
import com.example.employer.Service.EmployerService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/employer")
public class EmployerController {
    
    @Autowired
    private EmployerService employerService;

    @GetMapping(path = "/getAllEmployers")
    public List<EmployerDTO> getAllEmployers(){
        return employerService.getAllEmployers();
    }

    @PostMapping(path = "/add")
    public String addEmployer(@RequestBody EmployerSaveDTO employerSaveDTO){
        return employerService.addEmployer(employerSaveDTO);
    }

    @PutMapping(path = "/update")
    public String updateEmployer(@RequestBody EmployerUpdateDTO employerUpdateDTO){
        return employerService.updateEmployer(employerUpdateDTO);
    }

    @DeleteMapping(path = "/delete/{employerID}")
    public String deleteEmployer(@PathVariable(value = "employerID") int employerID){
        return employerService.deleteEmployer(employerID);
    }
}