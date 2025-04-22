package org.aa.flightmanagment;


import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;




public class Passenger {
    private String passengerId;
    private String passengerName;
    private Group group;
 


    public static void main(String[] args) {

        List<Passenger> passengers = Arrays.asList(new Passenger("1", "aman",
                        new Group("a")), new Passenger("3",
                        "aman", new Group("m"))
                , new Passenger("2", "aman", new Group("w"))
                , new Passenger("4", "aman", new Group("m")),
                new Passenger("5", "aman", new Group("A")),
                new Passenger("6", "aman", new Group("A")),
                new Passenger("7", "aman", new Group("m")),
                new Passenger("8", "aman", new Group("m")),
                new Passenger("9", "aman", new Group("A")),
                new Passenger("10", "aman", new Group("A")),
                new Passenger("11", "aman", new Group("m")),
                new Passenger("12", "aman", new Group("A")));



        List<Passenger> ListOfPassengersByGivenId = passengers.stream().filter(p
                -> p.getPassengerId().equals("1")).collect(Collectors.toList());
        System.out.println(ListOfPassengersByGivenId);


    }

    public Passenger(String passengerId, String passengerName, Group group) {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.group = group;
    }

    public String getPassengerId() {
        return passengerId;
    }


    public Group getGroup() {
        return group;
    }
}

class Group {
    public Group(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    private String groupId;//

}


