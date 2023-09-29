package Exceptions;

import java.util.Date;

public class User {
    private String name;
    private Date dateOfBirth;
    private float telephoneNum;
    private Gender gender ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public float getTelephoneNum() {
        return telephoneNum;
    }

    public void setTelephoneNum(float telephoneNum) {
        this.telephoneNum = telephoneNum;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", telephoneNum=" + telephoneNum +
                ", gender=" + gender +
                '}';
    }
}
