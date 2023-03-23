public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        //Pressionar botão ligar do controle.
        smartTv.ligar ();
        System.out.println("Novo Status - TV Ligada ? " + smartTv.ligada);

        //Pressionando o botão de aumentar e diminuir volume.
        System.out.println("Volume Atual :" +smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        //Verificação de canal atual.
        System.out.println("Canal Atual :" +smartTv.canal);

        //Alteração de canal por numero do canal.
        smartTv.mudarCanal(7);
        System.out.println("Canal Atual :" +smartTv.canal);

        //Botão para desligar a smartTv.
        smartTv.desligar ();
        System.out.println("Novo Status - TV Ligada ?" + smartTv.ligada);
    }    
}
