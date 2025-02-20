package br.com.phlimadev.magalu.dtos;

import java.time.LocalDateTime;

public record SchedulingDTO(LocalDateTime dateTimeShipping, String recipientEmail, String recipientPhone, String message) {
}
