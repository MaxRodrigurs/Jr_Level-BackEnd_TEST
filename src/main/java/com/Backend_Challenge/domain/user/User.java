package com.Backend_Challenge.domain.user;

import com.Backend_Challenge.dtos.UserDTO;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity(name="users")
@Table(name="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String documents;
    @Column(unique = true)
    private String email;
    private String password;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    private UserType userType;
    public User(UserDTO data){
        this.firstName = data.firstName();
        this.lastName = data.LastName();
        this.password = data.password();
        this.userType = data.userType();
        this.email = data.email();
        this.balance = data.balance();
        this.documents = data.document();
    }
}
