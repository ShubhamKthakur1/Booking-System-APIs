package com.busservice.model;


public class BookingDetail {

    private String username;

    private String name;

    private Long flightId;

    private Long busId;

    private Long hotelId;

    private Long seatNo;

    private Long roomNo;

    public BookingDetail(){

    }

    public BookingDetail(String username, String name, Long flightId, Long busId, Long hotelId, Long seatNo, Long roomNo) {

        this.username = username;
        this.name = name;
        this.flightId = flightId;
        this.busId = busId;
        this.hotelId = hotelId;
        this.seatNo = seatNo;
        this.roomNo = roomNo;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getFlightId() {
        return flightId;
    }

    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    public Long getBusId() {
        return busId;
    }

    public void setBusId(Long busId) {
        this.busId = busId;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public Long getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(Long seatNo) {
        this.seatNo = seatNo;
    }

    public Long getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(Long roomNo) {
        this.roomNo = roomNo;
    }
}
