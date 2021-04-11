package org.kickmyb.transfer;

import java.time.LocalDateTime;
import java.util.Date;

// Ajoute une nouvelle tâche pour l'utilisateur courant
public class AddTaskRequest {

    // Le nom, non vide doit être unique
    public String name;
    // La description, non vide doit être unique
    public String description;
    // La date limite pour la tâche
    public String deadLine;
}
