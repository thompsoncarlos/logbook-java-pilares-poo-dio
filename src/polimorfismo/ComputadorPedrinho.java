package src.polimorfismo;

import src.polimorfismo.apps.FacebookMessenger;
import src.polimorfismo.apps.MSNMessenger;
import src.polimorfismo.apps.ServicoMensagemInstantanea;
import src.polimorfismo.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        /*
		    NÃO SE SABE QUAL APP
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
        String appEscolhido = "fbm";

        if (appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
