package app.web.pavelk;

import app.web.pavelk.ui.Player;
import app.web.pavelk.ui.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
