package com.example.UC1.Hello_uc1;

class UserDTO {
    private String firstName;
    private String secondName;

    public UserDTO(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;

    }

    public String getFirstName() {
        return firstName;

    }

    public String getSecondName() {
        return secondName;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;

    }
}
