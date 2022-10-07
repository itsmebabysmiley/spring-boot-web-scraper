package com.reljicd;
import com.reljicd.model.User;
import com.reljicd.repository.RoleRepository;
import com.reljicd.repository.UserRepository;
import com.reljicd.service.impl.UserServiceImp;
import jdk.jfr.Name;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;
import static org.codehaus.groovy.runtime.DefaultGroovyMethods.any;
import static org.hamcrest.core.IsSame.sameInstance;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.mockito.junit.jupiter.MockitoExtension;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @InjectMocks
    private UserServiceImp userServiceImp;

    @Mock
    private UserRepository userRepository;
    @Mock
    private RoleRepository roleRepository;

    private PasswordEncoder passwordEncoder;


    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        userServiceImp = new UserServiceImp(userRepository, roleRepository, passwordEncoder );
    }

    @Test
    @Name("TestAddUser")
    public void testAddUser(){
        // T1
        // Given
        User testUser1 = new User();
        when(userRepository.saveAndFlush(testUser1)).thenReturn(testUser1);
        // When
        User expectUser1 = userServiceImp.saveUser(testUser1);
        // Then
        // you are expecting service to return whatever returned by repo
        assertThat(expectUser1).isEqualTo(testUser1);

        // you are expecting repo to be called once with correct param
        verify(userRepository).saveAndFlush(testUser1);
        // T1
        // Given
//        User testUser = new User();
//        // When
//        userServiceImp.saveUser(testUser);
//        // Then
//        ArgumentCaptor<User> userArgumentCaptor = ArgumentCaptor.forClass(User.class);
//        verify(userRepository).saveAndFlush(userArgumentCaptor.capture());
//        User userCaptor = userArgumentCaptor.getValue();//capture user that was passed .save()[not this save but in real service]
//        assertThat(userCaptor).isEqualTo(testUser);
        // to explain more understandable, it compares between userCaptor and testUser. (not the correct explanation but kinda help you to understand this few line of codes.:3)

        // T2 (no variable is assign, False)
        // Given
        User test2 = new User();
        test2.setUsername("john");
        when(userRepository.saveAndFlush(test2)).thenReturn(test2);
        // When
        User expectUser2 = userServiceImp.saveUser(test2);
        // Then
        // you are expecting service to return whatever returned by repo
        assertThat(expectUser2).isEqualTo(test2);

        // you are expecting repo to be called once with correct param
        verify(userRepository).saveAndFlush(test2);
    }

    @Test
    @Name("TestFindByUsername")
    public void testFindByUsername(){
        // Given
//        User testUser = new User();
//        testUser.setUsername("john-mayer");
//        // When
//        userServiceImp.saveUser(testUser);
//        // Then
//        ArgumentCaptor<User> userArgumentCaptor = ArgumentCaptor.forClass(User.class);
//        verify(userRepository).saveAndFlush(userArgumentCaptor.capture());
//        User userCaptor = userArgumentCaptor.getValue();//capture user that was passed .save()[not this save but in real service]
//        assertThat(userCaptor.getUsername()).isEqualTo(testUser.getUsername());
        // to explain more understandable, it compares between userCaptor and testUser. (not the correct explanation but kinda help you to understand this few line of codes.:3)
        // T1
        // Given
        User test1 = new User();
        test1.setUsername("john");
        when(userRepository.findByUsername("john")).thenReturn(Optional.of(test1));
        // When
        Optional<User> expectUser = userServiceImp.findByUsername("john");
        // Then
        assertThat(expectUser.get()).isEqualTo(test1);
        verify(userRepository).findByUsername("john");

        // T2
        // Given
        User test2 = new User();
        when(userRepository.save(test2)).thenReturn(test2);
        // When
        Optional<User> expectUser2 = userServiceImp.findByUsername("");
        // Then
        assertThat(expectUser2).isNull();
        verify(userRepository).findByUsername("");

        // T3
        // Given
        User test3 = new User();
        when(userRepository.save(test3)).thenReturn(test3);
        // When
        Optional<User> expectUser3 = userServiceImp.findByUsername("Payout");
        // Then
        assertThat(expectUser3).isNull();
        verify(userRepository).findByUsername("Payout");
    }
}