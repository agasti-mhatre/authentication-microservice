package recommender.recommenderBackend.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountInfoService {

  @Autowired
  private UserAccountInfoRepository userAccountInfoRepository;

  public boolean hasUser(String username) {

    return userAccountInfoRepository.existsById(username);
  }

  public void createAccount(AccountDTO accountDTO) {
    userAccountInfoRepository.insert(accountDTO);
  }

}
