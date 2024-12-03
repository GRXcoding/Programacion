/*
 * En este ejercicio, implementarás la lógica de las misiones para un nuevo juego de rol (RPG) que un amigo está desarrollando. La protagonista del juego es Annalyn, una valiente chica con un feroz y leal perro como mascota. Desafortunadamente, ocurre un desastre: su mejor amigo fue secuestrado mientras buscaba bayas en el bosque. Annalyn intentará encontrar y rescatar a su amigo, opcionalmente llevando a su perro en la misión.

Después de seguir el rastro por un tiempo, Annalyn descubre el campamento donde su amigo está prisionero. Resulta que hay dos secuestradores: un poderoso caballero y un astuto arquero.

Tras encontrar a los secuestradores, Annalyn considera cuáles de las siguientes acciones puede realizar:

Ataque rápido: se puede realizar un ataque rápido si el caballero está durmiendo, ya que necesita tiempo para ponerse la armadura, lo que lo deja vulnerable.

Espiar: se puede espiar al grupo si al menos uno de ellos está despierto. De lo contrario, espiar sería una pérdida de tiempo.

Señal al prisionero: se puede enviar una señal al prisionero mediante sonidos de aves si el prisionero está despierto y el arquero está dormido. Los arqueros están entrenados en señales de aves y podrían interceptar el mensaje si están despiertos.

Liberar al prisionero: Annalyn puede intentar infiltrarse en el campamento para liberar al prisionero. Esto es arriesgado y solo puede tener éxito en una de las dos situaciones siguientes:

1. Si Annalyn lleva a su perro, puede rescatar al prisionero si el arquero está dormido. El caballero le tiene miedo al perro, y el arquero no tendrá tiempo de prepararse antes de que Annalyn y el prisionero escapen.
2. Si Annalyn no lleva a su perro, tanto ella como el prisionero deberán ser muy sigilosos. Annalyn puede liberar al prisionero si este está despierto y tanto el caballero como el arquero están dormidos. Sin embargo, si el prisionero está dormido, no podrá ser rescatado, ya que se asustaría con la aparición repentina de Annalyn y despertaría al caballero y al arquero.

Tienes cuatro tareas: implementar la lógica para determinar si las acciones anteriores están disponibles según el estado de los tres personajes en el bosque y si el perro de Annalyn está presente o no.

*/

/* Hola */

import java.util.Scanner;

public class annalyn {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
    



    }


    public static void ataqueRapido(boolean caballeroDormido){

        if (caballeroDormido == true) {
            System.out.println("Annalyn ha atacado rapidamente al caballero desprotegido mientras dormía");
        } else {
            System.out.println("Annalyn intenta atacar al caballero rapidamente pero al estar atento se pudo defender, el ataque no surte efecto.");
        }
    }

    public static void espiar(boolean caballeroDormido, boolean arqueroDormido){

        if (caballeroDormido == true && arqueroDormido == true) {
            System.out.println("Annalyn intenta espiar el campamento pero no ve nada interesante");
        } else {
            System.out.println("Annalyn detecta movimiento sospechoso y empiza a espiar el campamento");
        }
    }

    public static void señal(boolean prisioneroDormido, boolean arqueroDormido) {

        if (prisioneroDormido == false && arqueroDormido == true) {
            System.out.println("Annalyn le envia al prisionero una señal mediante sonidos de aves");
        } else{
            System.out.println("Annalyn piensa en mandar una señal mediante el sonido de las aves al prisionero, pero al estar el arquero despierto seria inutil");
        }
    }

    public static void liberar(boolean perro, boolean arqueroDormido, boolean prisioneroDormido, boolean caballeroDormido){

        if (perro == true && arqueroDormido == true) {
            System.out.println("Annalyn se infiltra en el campamento y rescata al prisionero gracias a la ayuda de su perro");
        }

        if (perro == false && prisioneroDormido == false && arqueroDormido == true && caballeroDormido == true) {
            System.out.println("Annalyn aprovecha que el caballero y el arquero estan durmiendo para rescatar al prisionero y huir");
        }

        if (perro == false && prisioneroDormido == true && arqueroDormido == true && caballeroDormido == true) {
            System.err.println("Con el prisionero dormido es imposible para Annalyn salvarle, o despertará a los guardias");
        }
    }







}