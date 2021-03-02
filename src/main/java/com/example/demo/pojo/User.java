package com.example.demo.pojo;

/**
 * t_user的一个实体类。
 */
public class User {

    public User() {
    }

    public User(String uname, String ugender, String upassword, long uphone, String ubirth, String uemail, int uflag) {
        this.uname = uname;
        this.ugender = ugender;
        this.upassword = upassword;
        this.uphone = uphone;
        this.ubirth = ubirth;
        this.uemail = uemail;
        this.uflag = uflag;
    }

    public User(int uid, String uname, String ugender, String upassword, long uphone, String ubirth, String uemail, int uflag) {
        this.uid = uid;
        this.uname = uname;
        this.ugender = ugender;
        this.upassword = upassword;
        this.uphone = uphone;
        this.ubirth = ubirth;
        this.uemail = uemail;
        this.uflag = uflag;
    }

    //用户Id
    private int uid;

    //用户姓名
    private String uname;

    //用户性别
    private String ugender;

    //用户密码
    private String upassword;

    //用户手机号码
    private long uphone;

    //出生日期
    private String ubirth;

    //电子邮箱
    private String uemail;

    //用户状态
    private int uflag;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUgender() {
        return ugender;
    }

    public void setUgender(String ugender) {
        this.ugender = ugender;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    public long getUphone() {
        return uphone;
    }

    public void setUphone(long uphone) {
        this.uphone = uphone;
    }

    public String getUbirth() {
        return ubirth;
    }

    public void setUbirth(String ubirth) {
        this.ubirth = ubirth;
    }

    public int getUflag() {
        return uflag;
    }

    public void setUflag(int uflag) {
        this.uflag = uflag;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", ugender=" + ugender +
                ", upassword='" + upassword + '\'' +
                ", uphone=" + uphone +
                ", ubirth='" + ubirth + '\'' +
                ", uemail='" + uemail + '\'' +
                ", uflag=" + uflag +
                '}';
    }
}