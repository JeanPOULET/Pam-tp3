package pam.tp3.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pam.tp3.model.User;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {


}
