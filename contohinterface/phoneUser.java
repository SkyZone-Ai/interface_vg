
package contohinterface;


public class phoneUser {
    
    private Phone phone;
    
    public phoneUser(Phone phone){
        this.phone = phone;
    }
    
    void turnOnThePhone (){
        this.phone.powerOn();
    }
    void turnOffThePhone (){
        this.phone.powerOff();
    }
    void makePhoneLouder (){
        this.phone.volumeUp();
    }
    void makePhoneSilence (){
        this.phone.volumeDown();
    }
    
}
