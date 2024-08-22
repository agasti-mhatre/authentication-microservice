package recommender.recommenderBackend.authentication;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserAccountInfoRepository extends MongoRepository<AccountDTO, String> {}
