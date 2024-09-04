# Sistema de Gerenciamento de Dispositivos Telefônicos #

## Contexto: ##
    O objetivo é usar herança e polimorfismo para modelar esses dispositivos e suas
interações

## Objetivos: ##
1. Implementar uma classe base DispositivoTelefonico;
2. Criar três classes derivadas: TelefoneFixo, Celular e Smartphone;
3. Utilizar polimorfismo para manipular diferentes tipos de dispositivos através de
referências da classe base;
4. Demonstrar o uso de herança, polimorfismo e sobrecarga de métodos.

## Especificações: ##

### 1. Classe Base: DispositivoTelefonico ###
    
    + Atributos:
        + numero (String): Representa o número do dispositivo;
        + modelo (String): Representa o modelo do dispositivo;
    
    + Métodos:
        + public DispositivoTelefonico(String numero, String modelo):
            Construtor para inicializar os atributos.
        + public void ligar(): Método para ligar para um número. Pode ser
            sobrescrito nas classes derivadas.
        + public void mostrarDetalhes(): Exibe o número e o modelo do
            dispositivo.
