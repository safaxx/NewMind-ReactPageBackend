package com.contracts.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contracts.entity.Contract;
@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {
}
