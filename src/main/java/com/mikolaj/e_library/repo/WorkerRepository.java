package com.mikolaj.e_library.repo;

import com.mikolaj.e_library.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {
}