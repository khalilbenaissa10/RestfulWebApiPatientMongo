package hello;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {
	
	@Autowired
	   private PatientRepository repository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Patient> getAllBooks(){
	  List<Patient> patients = repository.findAll();
	  return patients ;
	}
	
	



}
