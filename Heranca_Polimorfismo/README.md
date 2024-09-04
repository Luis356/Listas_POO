# Sistema de Gerenciamento de Dispositivos Telefônicos #

## Contexto: ##
    O objetivo é usar herança e polimorfismo para modelar esses dispositivos e suas interações

## Objetivos: ##
1. Implementar uma classe base DispositivoTelefonico;
2. Criar três classes derivadas: TelefoneFixo, Celular e Smartphone;
3. Utilizar polimorfismo para manipular diferentes tipos de dispositivos através de
referências da classe base;
4. Demonstrar o uso de herança, polimorfismo e sobrecarga de métodos.

## Especificações: ##

### 1. Classe Base: DispositivoTelefonico ###
    
    • Atributos:
        • numero (String): Representa o número do dispositivo;
        • modelo (String): Representa o modelo do dispositivo;
    
    • Métodos:
        • public DispositivoTelefonico(String numero, String modelo):
            Construtor para inicializar os atributos.
        • public void ligar(): Método para ligar para um número. Pode ser
            sobrescrito nas classes derivadas.
        • public void mostrarDetalhes(): Exibe o número e o modelo do
            dispositivo.
            
### 2. Classe Derivada: TelefoneFixo ###
    • Métodos:
        • Sobrescreva o método ligar(), exibindo a mensagem: "Ligando para o número fixo: [número] usando o modelo [modelo]".
        • Adicione o método public void verificarLinhaTelefonica(), que imprime "Verificando linha telefônica para o número fixo [número]".

### 3. Classe Derivada: Celular ###
    • Atributos:
        • operadora (String): Representa a operadora do celular.
    • Métodos:
        • Sobrescreva o método ligar(), exibindo a mensagem: "Ligando para o número de celular: [número] usando o modelo [modelo] da operadora [operadora]".
        • public void enviarMensagem(String mensagem): Envia uma mensagem de texto e exibe a mensagem "Enviando mensagem: '[mensagem]' para [número] via [operadora]".

### 4. Classe Derivada: Smartphone (herda de Celular) ###
    • Atributos: 
        • sistemaOperacional (String): Representa o sistema operacional do smartphone (ex: Android, iOS).
    • Métodos:
        • Sobrescreva o método ligar() para exibir a mensagem: "Ligando para o número do smartphone: [número] usando o modelo [modelo] com [sistemaOperacional]".
        • public void acessarInternet(): Exibe a mensagem "Acessando a internet pelo smartphone com [sistemaOperacional]". o Sobrecarga de método enviarMensagem que, além da mensagem, também aceita uma mídia (arquivo de imagem ou vídeo), e exibe "Enviando mensagem com mídia para [número] via [operadora] usando [sistemaOperacional]".

### 5. Classe Principal: GerenciadorDeDispositivos ### 
    • Dentro do método main, crie uma lista de dispositivos telefônicos, adicionando instâncias de TelefoneFixo, Celular, e Smartphone. 
    • Use polimorfismo para iterar sobre a lista e chamar os métodos ligar() e mostrarDetalhes() para cada dispositivo.
    • Para objetos do tipo Smartphone, invoque o método acessarInternet() e demonstre a sobrecarga do método enviarMensagem.
