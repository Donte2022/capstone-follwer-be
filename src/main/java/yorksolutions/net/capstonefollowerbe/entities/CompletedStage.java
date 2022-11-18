package yorksolutions.net.capstonefollowerbe.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class CompletedStage {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private Long idOfTitle;

    private Date startDate;

    private Date endDate;

    private String description;

    private String StageTitle;

    private String process;

    private String prompt;

    private String response;

    public CompletedStage() {
    }

    public CompletedStage(Long idOfTitle, Date startDate, Date endDate, String description, String stageTitle, String process, String prompt, String response) {
        this.idOfTitle = idOfTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        StageTitle = stageTitle;
        this.process = process;
        this.prompt = prompt;
        this.response = response;
    }

    public Long getId() {
        return id;
    }

    public Long getIdOfTitle() {
        return idOfTitle;
    }

    public void setIdOfTitle(Long idOfTitle) {
        this.idOfTitle = idOfTitle;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStageTitle() {
        return StageTitle;
    }

    public void setStageTitle(String stageTitle) {
        StageTitle = stageTitle;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
