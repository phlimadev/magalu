package br.com.phlimadev.magalu.controllers;

import br.com.phlimadev.magalu.dtos.SchedulingDTO;
import br.com.phlimadev.magalu.dtos.StatusDTO;
import br.com.phlimadev.magalu.services.CommunicationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/communication")
public class CommunicationController {
    @Autowired
    private CommunicationService service;

    @PostMapping
    public ResponseEntity<Void> registerAppointment(@RequestBody @Valid SchedulingDTO scheduling) {
        service.toSchedule(scheduling);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StatusDTO> verifyStatus(@PathVariable("id") Long id) {
        StatusDTO status = service.verifyStatus(id);
        return new ResponseEntity<StatusDTO>(status, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> cancel(@PathVariable("id") Long id) {
        service.cancel(id);
        return ResponseEntity.ok().build();
    }
}
