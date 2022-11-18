package yorksolutions.net.capstonefollowerbe.services;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import yorksolutions.net.capstonefollowerbe.dto.CompletedStageRequestDTO;
import yorksolutions.net.capstonefollowerbe.entities.CompletedStage;
import yorksolutions.net.capstonefollowerbe.repositories.CompletedStageRepository;

import java.util.Optional;

@Service
public class CompletedStageService {

    CompletedStageRepository completedStageRepository;

    public CompletedStageService(CompletedStageRepository completedStageRepository) {
        this.completedStageRepository = completedStageRepository;
    }

    public CompletedStage create(CompletedStageRequestDTO requestDTO) {

        try {
            return this.completedStageRepository.save(
                    new CompletedStage(requestDTO.idOfTitle, requestDTO.startDate, requestDTO.endDate, requestDTO.description,
                            requestDTO.response, requestDTO.process, requestDTO.prompt, requestDTO.StageTitle));


        } catch (RuntimeException exception) {
            throw new ResponseStatusException(HttpStatus.CONFLICT);
        }
    }

    public Iterable<CompletedStage> getStage() {
        return completedStageRepository.findAll();
    }

    public boolean deleteById(Long id) {

        try {
            var stage = completedStageRepository.findById(id).orElseThrow();
            completedStageRepository.deleteById(id);
            return true;

        } catch (Exception exception) {
            return false;
        }
    }

    public CompletedStage updateStage(CompletedStageRequestDTO requestDTO, Long id) {

        Optional<CompletedStage> updateStage = this.completedStageRepository.findById(id);
        if(updateStage.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        CompletedStage completedStage = updateStage.get();
        completedStage.setStageTitle(requestDTO.StageTitle);
        completedStage.setStartDate(requestDTO.startDate);
        completedStage.setEndDate(requestDTO.endDate);
        completedStage.setDescription(requestDTO.description);

        return completedStageRepository.save(completedStage);
    }
}
