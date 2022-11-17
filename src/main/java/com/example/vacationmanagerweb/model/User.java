package com.example.vacationmanagerweb.model;


import javax.persistence.*;

@Entity
@Table(name="user_data")
public class User {

    @Id
    @GeneratedValue
    @Column(name="SN")
    private int sn;

    @Column(name="firstname")
    private String fname;
    @Column(name="lastname")
    private String lname;
    @Column(name="nickname")
    private String nickname;
    @Column(name="passwd")
    private String passwd;
    @Column(name="role")
    private String role;
    @Column(name="team")
    private String team;
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    public String getRole() {
        return role;
    }
    public String getNickname() { return nickname; }
    public String getTeam() { return nickname;  }

    public void setRole(String role) {
        this.role = role;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "User [fname=" + fname + ", lname=" + lname + ", nickname=" + nickname + ", passwd=" + passwd + ", role=" + role + ", team=" + team;
    }

}
