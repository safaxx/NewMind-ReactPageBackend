package com.contracts.contro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.contracts.entity.Contract;
import com.contracts.repo.ContractRepository;

import java.util.List;

@RestController
@RequestMapping("/contracts")
@CrossOrigin(origins = "http://localhost:3000")
public class ContractController {
    @Autowired
    private ContractRepository contractRepository;

    @GetMapping("/get")
    public List<Contract> getAllContracts() {
        return contractRepository.findAll();
    }

    @PostMapping("/create")
    public Contract createContract(@RequestBody Contract contract) {
        return contractRepository.save(contract);
    }
}
