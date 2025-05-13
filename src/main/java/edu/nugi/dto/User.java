package edu.nugi.dto;

import edu.nugi.util.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String email;
    private UserRole role;
    private String address;
    private String firstName;
    private String lastName;
    private String phoneNo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
