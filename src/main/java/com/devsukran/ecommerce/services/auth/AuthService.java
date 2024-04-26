package com.devsukran.ecommerce.services.auth;

import com.devsukran.ecommerce.dto.SignupRequest;
import com.devsukran.ecommerce.dto.UserDto;

public interface AuthService {
     UserDto createUser(SignupRequest signupRequest);
     Boolean hasUserWithEmail(String email);
}
