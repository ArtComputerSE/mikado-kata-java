package stranger;

import ui.ApplicationInterface;
import ui.UI;

public class StrangerEonsApplication implements ApplicationInterface {

    public void leet(String string, UI ui) {
        ui.setLeeted(string.replace('S', '5'));
    }

    public static void main(String[] args) {
        UI ui = new UI(new StrangerEonsApplication());
        System.out.println(ui.leetMessage(args[0]));
    }
}
