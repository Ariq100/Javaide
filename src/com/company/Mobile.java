package com.company;

public class Mobile {
    private String mobileOwnerName;
    private String mobileNumber;
    private float mobileBalance;
    private String mobileOsName;
    private boolean lock;

    public Mobile (String mobileOwnerName, String mobileNumber, float mobileBalance, String mobileOsName, boolean lock)
    {
        this.mobileOwnerName = mobileOwnerName;
        this.mobileNumber = mobileNumber;
        this.mobileBalance = mobileBalance;
        this.mobileOsName = mobileOsName;
        this.lock = lock;
    }

    public String getMobileOwnerName() {
        return mobileOwnerName;
    }

    public void setMobileOwnerName(String mobileOwnerName) {
        this.mobileOwnerName = mobileOwnerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public float getMobileBalance() {
        return mobileBalance;
    }

    public void setMobileBalance(float mobileBalance) {
        this.mobileBalance = mobileBalance;
    }

    public String getMobileOsName() {
        return mobileOsName;
    }

    public void setMobileOsName(String mobileOsName) {
        this.mobileOsName = mobileOsName;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public void showInfo() {
        System.out.println(mobileOwnerName);
        System.out.println(mobileNumber);
        System.out.println(mobileBalance);
        System.out.println(mobileOwnerName);
        System.out.println(lock);
    }
}
