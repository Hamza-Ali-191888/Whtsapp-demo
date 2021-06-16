package com.example.whtsapp.Model;
import android.graphics.drawable.Drawable;
import android.view.View;

import com.example.whtsapp.MainActivity;

import java.sql.Time;

public class Person1 {
    String Name,Message;
    String Time;
    Drawable image;

    public Person1() {
    }

    public Person1(String name, String message,Drawable image,String time) {
        Name = name;
        Message = message;
        this.image= image;
        Time=time;
    }

    public Person1(String name,String message,Drawable image)
    {
        Name=name;
        Message=message;
        this.image=image;

    }

    public String getName()
    {
        return Name;
    }
    public String getMessage()
    {
        return Message;
    }



    public String getTime() {
        return Time;
    }



    public Drawable getImage() {
        return image;
    }

    public void setName(String name)
    {
        Name=name;
    }
    public void setMessage(String message)
    {
        Message=message;
    }

    public void setTime(String time) {
        Time = time;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}



