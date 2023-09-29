package com.example.springapp.model;

import javax.persistence.*;

@Entity
public class Participant {

    @Id
   
    private int participantId;
    private String participantName;
    private int participantAge;
    private long mobileNumber;

    public Participant() {
    }

    public Participant(String participantName, int participantAge, long mobileNumber) {
        this.participantName = participantName;
        this.participantAge = participantAge;
        this.mobileNumber = mobileNumber;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public int getParticipantAge() {
        return participantAge;
    }

    public void setParticipantAge(int participantAge) {
        this.participantAge = participantAge;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
}
