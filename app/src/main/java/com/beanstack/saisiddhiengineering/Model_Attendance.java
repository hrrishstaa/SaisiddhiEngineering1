package com.beanstack.saisiddhiengineering;

public class Model_Attendance {
    public String cdate;
    public String cpunchin;
    public String cpunchout;
    public String whrs;

    public String getcdate() {
        return cdate;
    }

    public void setcDate(String cName) {
        this.cdate = cName;
    }


    public String getcpunchin() {
        return cpunchin;
    }

    public void setcpunchin(String cBrand) {
        this.cpunchin = cBrand;
    }


    public String getpunchout() {
        return cpunchout;
    }

    public void setcpunchout(String cpunchout) {
        this.cpunchout = cpunchout;
    }


    public String getwhrs(){return whrs;}

    public void setwhrs(String whrs){

        this.whrs = whrs;
    }


}
