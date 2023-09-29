package com.example.springapp.model;

import javax.persistence.*;

@Entity
public class Marathon {

    @Id
    
    private int marathonId;
    private String marathonName;
    private int totalDistance;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "participant_id")
    private Participant participant;

    public Marathon() {
    }

    public Marathon(String marathonName, int totalDistance, Participant participant) {
        this.marathonName = marathonName;
        this.totalDistance = totalDistance;
        this.participant = participant;
    }

    public int getMarathonId() {
        return marathonId;
    }

    public void setMarathonId(int marathonId) {
        this.marathonId = marathonId;
    }

    public String getMarathonName() {
        return marathonName;
    }

    public void setMarathonName(String marathonName) {
        this.marathonName = marathonName;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(int totalDistance) {
        this.totalDistance = totalDistance;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }
}
