package com.contracts.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contracts.entity.Contract;
import com.contracts.repo.ContractRepository;

import java.util.List;

@Service
public class ContractService {

    @Autowired
    private ContractRepository contractRepository;

    public List<Contract> getAllContracts() {
        return contractRepository.findAll();
    }

//    public Contract getContractById(Long id) {
//        return contractRepository.findById(id)
//                .orElseThrow(() -> new NotFoundException("Contract not found with id: " + id));
//    }

    public Contract createContract(Contract contract) {
        return contractRepository.save(contract);
    }

 //   public Contract updateContract(Long id, Contract contractDetails) {
//        Contract contract = contractRepository.findById(id)
//                .orElseThrow(() -> new NotFoundException("Contract not found with id: " + id));
//
//        // Update contract details
//        contract.setName(contractDetails.getName());
//        contract.setStatus(contractDetails.getStatus());
//        contract.setType(contractDetails.getType());
//        contract.setParties(contractDetails.getParties());
//        contract.setGroup(contractDetails.getGroup());
//
//        return contractRepository.save(contract);
//    }

//    public void deleteContract(Long id) {
//        Contract contract = contractRepository.findById(id)
//                .orElseThrow(() -> new NotFoundException("Contract not found with id: " + id));
//        contractRepository.delete(contract);
//    }
}
