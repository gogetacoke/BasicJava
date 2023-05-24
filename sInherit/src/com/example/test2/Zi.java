package com.example.test2;

public class Zi extends Fu{
    private String score;

    public Zi(){}

    public Zi(String name,String age,String score){
        super(name,age);
        this.score = score;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

}
