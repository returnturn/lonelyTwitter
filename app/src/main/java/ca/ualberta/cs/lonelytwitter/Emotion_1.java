package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Emotion_1 extends Emotion {
    private Date date;
    void Emotion(){
        Date date = new Date();
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public Boolean isHappy() {
        return true;
    }
    public Boolean isSad() {
        return false;
    }
    public String giveString(){
        String mood = "none";
        if (isHappy()) {
            mood = "happy";
        }
        return mood;
    }
}