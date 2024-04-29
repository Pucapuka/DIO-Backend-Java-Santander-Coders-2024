public class SmartTv{

    
        boolean ligada = false;
        int canal = 2;
        int volume = 10;
        int canais = 100;
        int volumeMaximo = 100;
        int volumeMinimo = 0;
        int canalMaximo = 30;
        int canalMinimo = 1;
        String nome = "Samsung";

        public void ligar(){
            ligada = true;
        }

        public void desligar(){
            ligada = false;
        }

        public void aumentarVolume(){
            if(volume < volumeMaximo){
                volume++;
                System.out.println("aumentou volume");
            }
        }

        public void mudarDeCanal(int canal){
            this.canal = canal;
            System.out.println("mudou de canal");
        }

        public void aumetarCanal(){
            if(canal < canalMaximo){
                canal++;
                System.out.println("aumentou canal");
            }
        }

        public void diminuirCanal(){
            if(canal > canalMinimo){
                canal--;
                System.out.println("diminuiu canal");
            }
        }

}