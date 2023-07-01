package com.example.kafkatest;

public class ClickInfo {
    private String ipAddress;
    private String timestamp;

    public ClickInfo() {
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getipAddress() {
        return ipAddress;
    }

    public void setIpAdress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public ClickInfo(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public String toString() {
        return "Message{" +
                "sender='" + ipAddress + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
