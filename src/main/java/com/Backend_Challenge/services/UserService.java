package com.Backend_Challenge.services;

import com.Backend_Challenge.domain.user.User;
import com.Backend_Challenge.domain.user.UserType;
import com.Backend_Challenge.dtos.UserDTO;
import com.Backend_Challenge.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;
    public void validateTransaction(User sender, BigDecimal amount) throws Exception {
        if(sender.getUserType() == UserType.Merchants){
            throw new Exception("Apenas usuários do tipo Lojista não tem autorização para realizar transações.");
        }

        if(sender.getBalance().compareTo(amount) < 0){
            throw new Exception("Saldo Insuficiente.");
        }
    }

    public User findUserById(Long id) throws Exception{
        return this.repository.findUserById(id).orElseThrow(() -> new Exception("Usuário não encontrado."));
    }

    public User createUser(UserDTO data){
        User newUser = new User(data);
        this.saveUser(newUser);
        return newUser;
    }

    public List<User> getAllUsers(){
        return this.repository.findAll();
    }

    public void saveUser(User user){
        this.repository.save(user);
    }
}
