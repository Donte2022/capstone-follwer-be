package yorksolutions.net.capstonefollowerbe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import yorksolutions.net.capstonefollowerbe.entities.CompletedStage;

import java.util.Optional;

@Repository
public interface CompletedStageRepository extends CrudRepository<CompletedStage, Long> {


}
