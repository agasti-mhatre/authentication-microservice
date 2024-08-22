package recommender.recommenderBackend.authentication;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "user_account_info")
public class AccountDTO {

  @Id
  private String username;
  private String firstName;
  private String lastName;
  private String email;
  private String hashedPassword;

}