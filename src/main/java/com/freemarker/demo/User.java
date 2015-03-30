package com.freemarker.demo;

/**
 * Created by tom on 2015-03-29.
 */
public class User
{
    private String firstname;
    private String lastname;

    public User()
    {
    }

    public User(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public String getLastname()
    {
        return lastname;
    }
}
