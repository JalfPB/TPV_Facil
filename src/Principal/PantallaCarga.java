package Principal;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.image.*;

public class PantallaCarga {

  PantallaCargando screen;

  public PantallaCarga() {
    inicioPantalla();
	screen.velocidadDeCarga();
  }

  private void inicioPantalla() {
    ImageIcon myImage = new ImageIcon("src//Principal//res//carga.gif");
    screen = new PantallaCargando(myImage);
    screen.setLocationRelativeTo(null);
    screen.setProgresoMax(100);
    screen.setVisible(true);
  }

}