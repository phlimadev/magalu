package br.com.phlimadev.magalu.domain.communication;

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
    private String recipientEmail;
    private String recipientPhone;
    private String message;
    private LocalDateTime modifyScheduleStatus;
}
