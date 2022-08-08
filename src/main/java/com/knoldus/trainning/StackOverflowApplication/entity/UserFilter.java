package com.knoldus.trainning.StackOverflowApplication.entity;

//import com.knoldus.trainning.StackOverflowApplication.repository.UserFilterRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
@Table(name = "users")
public class UserFilter {

//    @Autowired
//    UserFilterRepository userFilterRepository;

    @Id
    @SequenceGenerator(name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "user_sequence")
    @Column(name = "id")
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Set<GrantedAuthority> hashSet;

    public <T> UserFilter(String username, String password, Set<GrantedAuthority> unmodifiableCollection) {
        this.username = username;
        this.password = password;
        hashSet = unmodifiableCollection;
        System.out.println(username);

    }
}