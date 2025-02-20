package br.com.phlimadev.magalu.services;

import br.com.phlimadev.magalu.domain.entities.communication.Communication;
import br.com.phlimadev.magalu.domain.enums.StatusEnum;
import br.com.phlimadev.magalu.dtos.SchedulingDTO;
import br.com.phlimadev.magalu.dtos.StatusDTO;
import br.com.phlimadev.magalu.infra.exceptions.IdNotFoundException;
import br.com.phlimadev.magalu.repositories.CommunicationRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CommunicationService {
    @Autowired
    private CommunicationRepository repository;

    @Transactional
    public void toSchedule(SchedulingDTO scheduling) {
        Communication newCommunication = new Communication(scheduling);
        repository.save(newCommunication);
    }

    public StatusDTO verifyStatus(Long id) {
        Communication communication = repository.findById(id).orElseThrow(() -> new IdNotFoundException("Id not found."));
        return new StatusDTO(communication.getStatus());
    }

    @Transactional
    public void cancel(Long id) {
        Communication communication = repository.findById(id).orElseThrow(() -> new IdNotFoundException("Id not found."));
        communication.setStatus(StatusEnum.CANCELED);
        communication.setModifyScheduleStatus(LocalDateTime.now());
        repository.save(communication);
    }
}
