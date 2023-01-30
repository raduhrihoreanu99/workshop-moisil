package kronsoft.moisil.medication.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import kronsoft.moisil.medication.persistence.entities.Medication;

@Repository
public interface MedicationRepository extends CrudRepository<Medication, Long> {
	
	@Override
	List<Medication> findAll();
	
}
