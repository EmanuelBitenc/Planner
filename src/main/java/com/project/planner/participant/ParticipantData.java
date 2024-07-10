package com.project.planner.participant;

import java.util.UUID;

public record ParticipantData(UUID id, String nome, String email, Boolean isConfirmed) {
}
