package org.kickmyb.transfer;

import java.util.Date;

public class TaskProgressRequest {
    public Long id;
    public Long idParent;
    public String name;
    public String description;
    public int progress;

    //Dates à utiliser pour l'affichage
    public Date deadline;
}
