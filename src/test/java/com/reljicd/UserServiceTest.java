package com.reljicd;

import com.reljicd.model.User;
import com.reljicd.repository.RoleRepository;
import com.reljicd.repository.UserRepository;
import com.reljicd.service.UserService;
import com.reljicd.service.impl.MyUserService;
import com.reljicd.service.impl.UserServiceImp;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.verify;

public class UserServiceTest {

    @Mock
    private UserRepository userRepository;

    private  UserService userService;

    @Before
    public void setup(){

    }

    @Test
    void testSave(){
        User u = new User();
        userService.saveUser(u);
    }
}