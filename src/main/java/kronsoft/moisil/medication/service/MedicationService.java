package kronsoft.moisil.medication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kronsoft.moisil.medication.persistence.entities.Medication;
import kronsoft.moisil.medication.persistence.repository.MedicationRepository;

@Service
public class MedicationService {
	
	@Autowired
	private MedicationRepository medicationRepository;
	
	public List<Medication> getAllMedication() {
		return medicationRepository.findAll();
	}
	
	public Medication saveMedication(Medication medication) {
		return medicationRepository.save(medication);
	}
	
	public void deleteMedication(Long id) {
		medicationRepository.deleteById(id);
	}
	
}
