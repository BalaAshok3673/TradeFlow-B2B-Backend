package com.bala.TradeFlow.security;
import com.bala.TradeFlow.service.*;
import com.bala.TradeFlow.repository.UserRepository;
import com.bala.TradeFlow.entity.UserEntity;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleService roleService;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, RoleService roleService) {
        this.userRepository = userRepository;
        this.roleService = roleService;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    @Override
    public UserEntity registerUser(String name, String email, String password, String roleName) {
        if (userRepository.existsByUserEmail(email)) {
            throw new RuntimeException("Email already in use");
        }

        String hashed = passwordEncoder.encode(password);
        UserEntity user = new UserEntity(name, email, hashed);
        RoleEntity role = roleService.getByName(roleName != null ? roleName : "BUYER");
        user.getRoles().add(role);

        return userRepository.save(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(u -> new UserDto(
                        u.getId(),
                        u.getUserName(),
                        u.getUserEmail(),
                        u.getRoles().stream().map(RoleEntity::getName).collect(Collectors.toSet())
                ))
                .collect(Collectors.toList());
    }

    @Override
    public UserEntity findByEmail(String email) {
        return userRepository.findByUserEmail(email).orElse(null);
    }
}
