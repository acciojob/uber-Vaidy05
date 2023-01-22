package com.driver.model;

import javax.persistence.*;
import java.util.List;

@Table
@Entity
public class Customer {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;

     private String password;

     private String mobile;

     @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
     private List<TripBooking> tripBookingList;

     public int getCustomerId() {
          return id;
     }

     public void setCustomerId(int id) {
          this.id = id;
     }

     public String getPassword() {
          return password;
     }

     public void setPassword(String password) {
          this.password = password;
     }

     public String getMobile() {
          return mobile;
     }

     public void setMobile(String mobile) {
          this.mobile = mobile;
     }

     public Customer() {
     }

     public List<TripBooking> getTripBookingList() {
          return tripBookingList;
     }

     public void setTripBookingList(List<TripBooking> tripBookingList) {
          this.tripBookingList = tripBookingList;
     }

     public Customer(String password, String mobile) {
          this.password = password;
          this.mobile = mobile;
     }
}