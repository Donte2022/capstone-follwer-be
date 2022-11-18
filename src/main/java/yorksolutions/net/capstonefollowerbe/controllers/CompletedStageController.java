package yorksolutions.net.capstonefollowerbe.controllers;

import org.springframework.web.bind.annotation.*;
import yorksolutions.net.capstonefollowerbe.dto.CompletedStageRequestDTO;
import yorksolutions.net.capstonefollowerbe.entities.CompletedStage;
import yorksolutions.net.capstonefollowerbe.services.CompletedStageService;

@RestController
@CrossOrigin
@RequestMapping("/api/completedstage")
public class CompletedStageController {

    CompletedStageService completedStageService;

    public CompletedStageController(CompletedStageService completedStageService) {
        this.completedStageService = completedStageService;
    }

    @PostMapping
    public CompletedStage create(@RequestBody CompletedStageRequestDTO requestDTO) {
        return this.completedStageService.create(requestDTO);
    }

    @GetMapping("/all")
    public Iterable<CompletedStage> getStage() {
        return this.completedStageService.getStage();
    }


    static class Message {
        public String message;
        Message(String message) {
            this.message = message;
        }
    }
    @DeleteMapping("/{id}")
    Message deleteById(@PathVariable Long id) {
        return new Message(completedStageService.deleteById(id) ? "Stage successfully deleted" :
                "fail to delete stage");
    }

    @PutMapping("/{id}")
    public CompletedStage updateStage(@RequestBody CompletedStageRequestDTO requestDTO, @PathVariable Long id) {
        return completedStageService.updateStage(requestDTO, id);
    }
}
