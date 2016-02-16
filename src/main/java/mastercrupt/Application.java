package mastercrupt;

public class Application implements ApplicationInterface {
    public void leet(String string, UI ui) {
        ui.setLeeted(Leeter.leet(string));
    }
    public static void main(String[] args) {
        UI ui = new UI(new Application());
        System.out.println(ui.leetMessage(args[0]));
    }
}