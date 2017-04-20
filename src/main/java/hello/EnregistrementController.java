package hello;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/enregistrements")
public class EnregistrementController {
	
	@Autowired
	   private EnregistrementRepository repository;

	@RequestMapping(method = RequestMethod.GET)
	public List<Enregistrement> getAllBooks(){
	  List<Enregistrement> books = repository.findAll();
	  return books ;
	}
	
	



}
