package Lab3.src;

import java.time.LocalDateTime;

public class Movie {
    private String name;
    private  LocalDateTime beginning;
    private LocalDateTime duration;
    public void Movie(String name, LocalDateTime beginning, LocalDateTime duration){
        this.name = name;
        this.beginning =  beginning;
        this.duration = duration;
    };

    public String getName(){
        return this.name;
    };
    public LocalDateTime getBeginning(){
        return this.beginning;
    };
    public LocalDateTime getDuration(){
        return this.duration;
    };


}
