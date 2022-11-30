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

    private String stageId;

    private Long idOfTitle;

    private Date startDate;

    private Date endDate;

    private String description;

    private String stageTitle;

    private String process;

    private String prompt;

    private String prompt2;

    private String prompt3;

    private String prompt4;

    private String response;

    private String response2;

    private String response3;

    private String response4;

    public CompletedStage() {
    }

    public CompletedStage(Long idOfTitle,
                          Date startDate,
                          Date endDate,
                          String description,
                          String stageTitle,
                          String process,
                          String prompt,
                          String prompt2,
                          String prompt3,
                          String prompt4,
                          String response,
                          String response2,
                          String response3,
                          String response4,
                          String stageId) {

        this.idOfTitle = idOfTitle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.stageTitle = stageTitle;
        this.process = process;
        this.prompt = prompt;
        this.prompt2 = prompt2;
        this.prompt3 = prompt3;
        this.prompt4 = prompt4;
        this.response = response;
        this.response2 = response2;
        this.response3 = response3;
        this.response4 = response4;
        this.stageId = stageId;
    }

    public Long getId() {
        return id;
    }

    public Long getIdOfTitle() {
        return idOfTitle;
    }

    public String getStageId() {
        return stageId;
    }

    public void setStageId(String stageId) {
        this.stageId = stageId;
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
        return stageTitle;
    }

    public void setStageTitle(String stageTitle) {
        this.stageTitle = stageTitle;
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

    public String getPrompt2() {
        return prompt2;
    }

    public void setPrompt2(String prompt2) {
        this.prompt2 = prompt2;
    }

    public String getPrompt3() {
        return prompt3;
    }

    public void setPrompt3(String prompt3) {
        this.prompt3 = prompt3;
    }

    public String getPrompt4() {
        return prompt4;
    }

    public void setPrompt4(String prompt4) {
        this.prompt4 = prompt4;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getResponse2() {
        return response2;
    }

    public void setResponse2(String response2) {
        this.response2 = response2;
    }

    public String getResponse3() {
        return response3;
    }

    public void setResponse3(String response3) {
        this.response3 = response3;
    }

    public String getResponse4() {
        return response4;
    }

    public void setResponse4(String response4) {
        this.response4 = response4;
    }
}
