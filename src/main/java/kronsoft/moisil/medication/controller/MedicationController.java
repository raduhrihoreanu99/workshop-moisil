package kronsoft.moisil.medication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kronsoft.moisil.medication.persistence.entities.Medication;
import kronsoft.moisil.medication.service.MedicationService;

@RestController
@RequestMapping("/medication")
public class MedicationController {
	
	@Autowired
	private MedicationService medicationService;
	
	@GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Medication> getAllMedication() {
		return medicationService.getAllMedication();
	}
	
	@PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Medication createMedication(@RequestBody Medication medication) {
		return medicationService.saveMedication(medication);
	}
	
	@PutMapping(value = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Medication updateMedication(@RequestBody Medication medication) {
		return medicationService.saveMedication(medication);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void deleteMedication(@PathVariable Long id) {
		medicationService.deleteMedication(id);
	}

}
