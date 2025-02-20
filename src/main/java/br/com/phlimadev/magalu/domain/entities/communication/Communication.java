package br.com.phlimadev.magalu.domain.entities.communication;

import br.com.phlimadev.magalu.domain.enums.StatusEnum;
import br.com.phlimadev.magalu.dtos.SchedulingDTO;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_communication")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Communication {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateTimeScheduling;
    private LocalDateTime dateTimeShipping;
    private String recipientEmail;
    private String recipientPhone;
    private String message;
    private LocalDateTime modifyScheduleStatus;
    private StatusEnum status;

    public Communication(SchedulingDTO scheduling) {
        this.dateTimeShipping = scheduling.dateTimeShipping();
        this.recipientEmail = scheduling.recipientEmail();
        this.recipientPhone = scheduling.recipientPhone();
        this.message = scheduling.message();
        this.dateTimeScheduling = LocalDateTime.now();
        this.status = StatusEnum.SCHEDULED;
    }
}
