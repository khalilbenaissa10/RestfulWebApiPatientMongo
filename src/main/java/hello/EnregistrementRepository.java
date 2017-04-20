package hello;



import org.springframework.data.mongodb.repository.MongoRepository;



public interface EnregistrementRepository extends MongoRepository<Enregistrement, String> {

	
}