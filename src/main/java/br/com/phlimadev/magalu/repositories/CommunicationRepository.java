package br.com.phlimadev.magalu.repositories;

import br.com.phlimadev.magalu.domain.entities.communication.Communication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommunicationRepository extends JpaRepository<Communication, Long> {
}
