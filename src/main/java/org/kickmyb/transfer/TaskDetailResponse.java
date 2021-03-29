package org.kickmyb.transfer;

import java.util.Date;
import java.util.List;

public class TaskDetailResponse {
    public Long id;
    public Long idParent;
    public String name;
    public String description;
    public int progress;

    //Dates à utiliser pour l'affichage
    public Date deadline;
    public Date creationDate;
    public Date finishDate;
}
