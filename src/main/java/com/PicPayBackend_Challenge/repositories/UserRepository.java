package com.PicPayBackend_Challenge.repositories;

import com.PicPayBackend_Challenge.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByDocument(String document);
    Optional<User> findUserById(Long Id);
    //Método definido para achar o usuario pelo documento, contudo
    //ele pode ter um retorno ou não, por isso o Optional.
    //Eu apenas declarei sem implementar pois o JPA consegue montar a query em runtime apenas com o que eu já defini.
}
