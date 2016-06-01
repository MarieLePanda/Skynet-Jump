/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skynet.jump;

import java.util.HashMap;

/**
 *
 * @author Lucas
 */
public class Moto {
    
    public int speed;
    public int possition;
    public Road road;
    public boolean isJumped = false;

    public Moto(int speed, int possition, Road road) {
        this.speed = speed;
        this.possition = possition;
        this.road = road;
    }
    
    public String speed(){
        if(this.speed < 50)
            this.speed++;
        this.possition += this.speed;
        return "SPEED";
    }
    
    public String slow(){
        if(this.speed > 0)
            this.speed--;
        this.possition += this.speed;
        return "SLOW";
    }
    
    public String jump(){
        this.possition += this.speed;
        return "JUMP";
    }
    
    public String nothing(){
        this.possition += this.speed;
        return "WAIT";
    }
    
    public boolean canJump(){
        return this.possition + this.speed >= this.road.lengthOfRoad + this.road.lengthOfGab &&
                this.possition + this.speed < this.road.lengthOfRoad + this.road.lengthOfGab + this.road.lengthOfPlateform;
    }
    
        public String move(){
            if(this.speed > this.road.lengthOfPlateform + this.road.lengthOfGab  || isJumped){
                return this.slow();
            }else if(canJump()){
                isJumped = true;
                return jump();
            }else if(this.speed <= this.road.lengthOfGab){
                return this.speed();
            }else{
                return this.nothing();
            }
        }
}
