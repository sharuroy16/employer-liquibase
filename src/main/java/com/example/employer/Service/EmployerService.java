package com.example.employer.Service;

import java.util.List;
import com.example.employer.DTO.EmployerDTO;
import com.example.employer.DTO.EmployerSaveDTO;
import com.example.employer.DTO.EmployerUpdateDTO;

public interface EmployerService {
    
    List<EmployerDTO> getAllEmployers();

    String addEmployer(EmployerSaveDTO employerSaveDTO);

    String updateEmployer(EmployerUpdateDTO employerUpdateDTO);

    String deleteEmployer(int employerID);
}
