package com.example.employer.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.employer.DTO.EmployerDTO;
import com.example.employer.DTO.EmployerSaveDTO;
import com.example.employer.DTO.EmployerUpdateDTO;
import com.example.employer.Entity.Employer;
import com.example.employer.Repo.EmployerRepo;
import com.example.employer.Service.EmployerService;

@Service
public class EmployerServiceImpl implements EmployerService {

    @Autowired
    private EmployerRepo employerRepo;

    @Override
    public List<EmployerDTO> getAllEmployers() {
        List<Employer> employerList = employerRepo.findAll();

        List<EmployerDTO> employerDTOList = new ArrayList<>();
        for(Employer employer : employerList){
            EmployerDTO employerDTO = new EmployerDTO(employer.getEmployerID(), employer.getEmployerName(), employer.getEmployerEmail(), employer.getEmployerAge());
            employerDTOList.add(employerDTO);
        }

        return employerDTOList;
    }

    @Override
    public String addEmployer(EmployerSaveDTO employerSaveDTO) {
        
        Employer employer = new Employer(employerSaveDTO.getEmployerName(), employerSaveDTO.getEmployerEmail(), employerSaveDTO.getEmployerAge());
        employerRepo.save(employer);
        return employer.getEmployerName();
    }

    @Override
    public String updateEmployer(EmployerUpdateDTO employerUpdateDTO) {
        if(employerRepo.existsById(employerUpdateDTO.getEmployerID())){
            Employer employer = employerRepo.getById(employerUpdateDTO.getEmployerID());

            employer.setEmployerName(employerUpdateDTO.getEmployerName());
            employer.setEmployerEmail(employerUpdateDTO.getEmployerEmail());
            employer.setEmployerAge(employerUpdateDTO.getEmployerAge());

            employerRepo.save(employer);
            return "Updated Employer ID: " + employerUpdateDTO.getEmployerID();
        }else{
            return "Employer ID not present";
        }
    }

    @Override
    public String deleteEmployer(int employerID) {
        if(employerRepo.existsById(employerID)){
            employerRepo.deleteById(employerID);

            return "Employer ID deleted: " + employerID;
        }else{
            return "Employer ID not present";
        }
    }
}
