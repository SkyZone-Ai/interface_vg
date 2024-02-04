
package contohinterface;


public class Xiaomi implements Phone{
    private int volume;
    private boolean isPowerOn;
    
    public Xiaomi(){
        //volume awal
        this.volume = 50;
    }
    
    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di Xiaomi");
        System.out.println("Android version 19.45");
    }
    
    @Override
    public void powerOff () {
        isPowerOn = false;
        System.out.println("Handphone dimatikan...");
    }
    
    

   @Override
    public void volumeUp () {
        if (isPowerOn){
            if(this.volume == MAX_VOLUME) {
                System.out.println("VOLUME FULL!!!");
                System.out.println("sudah" + this.getVolume() +"%");
        
      } else {
            this.volume += 10;
            System.out.println("volume sekarang" + this.getVolume());
            
     }
        }  
        else {
                System.out.println("hidupkan terlebih dahulu handphonenya");
                }
        }

    @Override
   public void volumeDown () {
        
       if (isPowerOn) {
           if (this.volume == MIN_VOLUME) {
               System.out.println("Volume 0%");
       } else {this.volume -= 10;
               System.out.println("volume sekarang " + this.getVolume());
           }
         } else {
           System.out.println("hidupkan terlebih dahulu handphonenya");
       }
   }
    public int getVolume() {
        return this.volume;
    
}
}   
    
    
    
