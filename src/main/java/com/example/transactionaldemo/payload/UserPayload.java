package com.example.transactionaldemo.payload;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserPayload {

    private Long companyId;
    private String username;
    private String firstName;
    private String lastName;

    public Long getCompanyId() {
        return companyId;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "UserPayload{" +
            "companyId=" + companyId +
            ", username='" + username + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            '}';
    }
}
