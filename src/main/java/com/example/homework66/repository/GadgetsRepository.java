package com.example.homework66.repository;

import com.example.homework66.entity.Gadget;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GadgetsRepository extends JpaRepository<Gadget, Integer> {
    Page<Gadget> findAllByPlaceId(int placeId, Pageable pageable);
}
