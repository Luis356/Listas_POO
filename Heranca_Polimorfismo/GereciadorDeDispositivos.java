package Heranca_Polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class GereciadorDeDispositivos {

    public static void main(String[] args) {

        List<DispositivoTelefonico> dispositivosTelefonicos = new ArrayList<>();

        dispositivosTelefonicos.add(new TelefoneFixo("NUM-TELEFONE", "MOD-TELEFONE"));
        dispositivosTelefonicos.add(new Celular("NUM-CELULAR", "MOD-CELULAR", "OPE-CELULAR"));
        dispositivosTelefonicos
                .add(new Smartphone("NUM-MARTPHONE", "MOD-SMARTPHONE", "OPE-SMARTPHONE", "SO-SMARTPHONE"));

        for (DispositivoTelefonico dispositivo : dispositivosTelefonicos) {
            dispositivo.Ligar();
            dispositivo.MostraDetalhes();

            if (dispositivo instanceof Smartphone) {
                Smartphone smartphone = (Smartphone) dispositivo;
                smartphone.AcessarInternet();
                smartphone.EnviarMensagem("Olá, veja este vídeo!", "Vídeo");
            }
        }
    }
}