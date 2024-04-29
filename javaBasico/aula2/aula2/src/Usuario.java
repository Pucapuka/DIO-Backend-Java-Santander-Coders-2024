public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Está ligada? "+ smartTv.ligada);
        System.out.println("Canal: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status: TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);

        smartTv.mudarDeCanal(20);
        System.out.println("Canal: " + smartTv.canal);

        smartTv.aumetarCanal();
        System.out.println("Canal: " + smartTv.canal);
        
        smartTv.diminuirCanal();
        System.out.println("Canal: " + smartTv.canal);
        
    }
}
