public class Oviparos extends Animal {
   

    private int oviparo;
    
    public Oviparos(int oviparo) {
        this.oviparo = oviparo;
    }
    public void Amamentar(){
        if (oviparo == 1){
        
        System.out.println("Não Amamenta");
        }else{
            System.out.println("Oviparo porem amamenta");
        }
    }
    public void Ovo(){
        System.out.println("Poe ovos");
    }
}