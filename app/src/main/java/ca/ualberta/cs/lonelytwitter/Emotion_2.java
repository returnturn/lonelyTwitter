package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Emotion_2 extends Emotion {
    private Date date;

    void Emotion() {
        Date date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean isSad() {
        return true;
    }

    public Boolean isHappy() {
        return false;
    }

    public String giveString(){
        String mood = "none";
        if (isHappy()) {
            mood = "sad";
        }
        return mood;
    }
}
