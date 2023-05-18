package proyectojava;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    private List<Usuario> usuarios;

    public Sistema() {
        usuarios = new ArrayList<>();
    }

    public static void main(String[] args) {
        Sistema mc = new Sistema();
        
        System.out.println("Introduce el nombre de usuario de FIFA que queres: ");
        Scanner teclado = new Scanner(System.in);
        String nombb;
        nombb = teclado.nextLine();
         Usuario user = new Usuario(nombb);
        mc.darDeAlta(user);
        mc.crearEquipo(user);
        mc.imprimirEquipo(user);
    }

    public void darDeAlta(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Se ha dado de alta al usuario: " + usuario.getNombre());
    }
    
    public void crearEquipo(Usuario usuario){
    int num;
    String nombre, posicion;
    System.out.println("Introduce el número de jugadores que vas a meter: ");
    Scanner teclado = new Scanner(System.in);
    num = teclado.nextInt();
    teclado.nextLine(); // Consumir el carácter de nueva línea
    
    for(int i = 0; i < num; i++) {
        System.out.println("Nombre del jugador: ");
        nombre = teclado.nextLine();
        System.out.println("Posición del jugador: ");
        posicion = teclado.nextLine();
                   
        Jugador jugador = new Jugador(nombre, posicion);
                   
        usuario.getCuentaJuego().agregarJugador(jugador);
        System.out.println("El jugador ha sido creado correctamente");
    }
    System.out.println("La plantilla ha sido creada correctamente!");
}
    
 public void imprimirEquipo(Usuario user) {
    System.out.println("Tu plantilla está formada por: ");
    
    List<Jugador> plantilla = user.getCuentaJuego().getPlantillaJugadores();
    for (Jugador jugador : plantilla) {
        System.out.println("Nombre: " + jugador.getNombre() + ", Posición: " + jugador.getPosicion());
    }
}

}
