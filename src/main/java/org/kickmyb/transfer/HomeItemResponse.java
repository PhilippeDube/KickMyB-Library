package org.kickmyb.transfer;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Résumé d'une tâche. Prévu pour l'affichage dans une liste d'accueil
 */
public class HomeItemResponse {
    public Long id;
    public Long idParent;
    public String name;
    public String description;
    public int progress;

    //Dates à utiliser pour l'affichage
    public LocalDateTime deadline;
    public LocalDateTime creationDate;
    public LocalDateTime finishDate;
}
