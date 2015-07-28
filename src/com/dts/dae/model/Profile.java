/*
 * RegistrationBean.java
 *
 * 
 */

package com.dts.dae.model;

import java.sql.Date;

/**
 *
 * @author 
 */
public class Profile {

    private int secretqid;

    private String id;

    private String password;
    
    private String newpassword;

    private String firstname;

    private String lastname;

    private String logintype;

    private String status;

    private String date;

    private int roleid;

    private int flogin;

    private String timezone;

    private String city;
    
    private String hno;
    
    private String street;
    
    private String phoneNo;
    
    private String email;

    private String bdate;
    
    private Date birthDate1;

    private String state;

    private String country;
    
    private String pincode;

    private String locale;

    private String secretqans;

    private String ownsecretq;

    private String passwordmoddate;

    private String profilemoddate;
    
    
    private String specilization;
    
    private String qualification;
    
    private String availiabledate;
    
    private String hospitalname;
    
    public int getSecretqid() {
		return secretqid;
	}

	public void setSecretqid(int secretqid) {
		this.secretqid = secretqid;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNewpassword() {
		return newpassword;
	}

	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLogintype() {
		return logintype;
	}

	public void setLogintype(String logintype) {
		this.logintype = logintype;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public int getFlogin() {
		return flogin;
	}

	public void setFlogin(int flogin) {
		this.flogin = flogin;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

	public String getSecretqans() {
		return secretqans;
	}

	public void setSecretqans(String secretqans) {
		this.secretqans = secretqans;
	}

	public String getOwnsecretq() {
		return ownsecretq;
	}

	public void setOwnsecretq(String ownsecretq) {
		this.ownsecretq = ownsecretq;
	}

	public String getPasswordmoddate() {
		return passwordmoddate;
	}

	public void setPasswordmoddate(String passwordmoddate) {
		this.passwordmoddate = passwordmoddate;
	}

	public String getProfilemoddate() {
		return profilemoddate;
	}

	public void setProfilemoddate(String profilemoddate) {
		this.profilemoddate = profilemoddate;
	}

	public String getSpecilization() {
		return specilization;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getAvailiabledate() {
		return availiabledate;
	}

	public void setAvailiabledate(String availiabledate) {
		this.availiabledate = availiabledate;
	}

	public String getHospitalname() {
		return hospitalname;
	}

	public void setHospitalname(String hospitalname) {
		this.hospitalname = hospitalname;
	}

	/** Creates a new instance of RegistrationBean */
    public Profile() {
    }
    
    public void setLoginID(String id)
    {
        this.id=id;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public void setNewPassword(String newpassword)
    {
        this.newpassword=newpassword;
    }
    public void setFirstName(String firstname)
    {
        this.firstname=firstname;
    }
    public void setLastName(String lastname)
    {
        this.lastname=lastname;
    }
    public void setLoginType(String logintype)
    {
        this.logintype=logintype;
    }
    public void setStatus(String  status)
    {
        this.status=status;
    }
    public void setRegDate(String date)
    {
        this.date=date;
    }
    public void setSecretQuestionID(int secretqid)
    {
        this.secretqid=secretqid;
    }
    public void setOwnSecretQuestion(String ownsecretq)
    {
        this.ownsecretq=ownsecretq;
    }
    public void setSecretAnswer(String secretqans)
    {
        this.secretqans=secretqans;
    }
    public void setFirstLogin(int flogin)
    {
        this.flogin=flogin;
    }
    public void setRoleId(int roleid)
    {
        this.roleid=roleid;
    }
    public void setBirthDate(String bdate)
    {
        this.bdate=bdate;
    }
    public void setCity(String city)
    {
        this.city=city;
    }     
    public void setState(String state)
    {
        this.state=state;
    }
    public void setCountry(String country)
    {
        this.country=country;
    }
    public void setLocale(String locale)
    {
        this.locale=locale;
    }
    public void setTimeZone(String timezone)
    {
        this.timezone=timezone;
    }
    public void setPasswordModifiedDate(String passwordmoddate) 
    {
        this.passwordmoddate=passwordmoddate;
    }
    public void setProfileModifiedDate(String profilemoddate) 
    {
        this.profilemoddate=profilemoddate;
    }    
    //Getter methods used to get the values from bean
    
     public String getLoginID()
    {
        return id;
    }
    public String getPassword()
    {
        return password;
    }
    public String getNewPassword()
    {
        return newpassword;
    }
    public String getFirstName()
    {
        return firstname;
    }
    public String getLastName()
    {
        return lastname;
    }
    public String getLoginType()
    {
        return logintype;
    }
    public String getStatus()
    {
        return status;
    }
    public String getRegDate()
    {
        return date;
    }
    public int getSecretQuestionID()
    {
        return secretqid;
    }
    public String getOwnSecretQuestion()
    {
        return ownsecretq;
    }
    public String getSecretAnswer()
    {
        return secretqans;
    }
    public int getFirstLogin()
    {
        return flogin;
    }
    public int getRoleId()
    {
        return roleid;
    }
    public String getBirthDate()
    {
        return bdate;
    }
    public String getCity()
    {
        return city;
    }     
    public String getState()
    {
        return state;
    }
    public String getCountry()
    {
        return country;
    }
    public String getLocale()
    {
        return locale;
    }
    public String getTimeZone()
    {
        return timezone;
    }

    public String getPasswordModifiedDate() {
        return passwordmoddate;
    }

    public String getProfileModifiedDate() {
        return profilemoddate;
    }

	/**
	 * @return the birthDate1
	 */
	public Date getBirthDate1() {
		return birthDate1;
	}

	/**
	 * @param birthDate1 the birthDate1 to set
	 */
	public void setBirthDate1(Date birthDate1) {
		this.birthDate1 = birthDate1;
	}

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
