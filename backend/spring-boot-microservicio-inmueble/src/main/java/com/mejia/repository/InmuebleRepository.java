package com.mejia.repository;

import com.mejia.model.Inmueble;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InmuebleRepository extends JpaRepository<Inmueble,Long> {
}
