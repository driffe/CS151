package CS151Hw03;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Class that initializes BarView, Model, Controller, and BlockingQueue
 */
public class App {
    public static void main(String[] args) {
        BlockingQueue<Message> queue = new LinkedBlockingQueue<>();

        Model model = new Model();
        BarView view = new BarView(queue);
        Controller controller = new Controller(queue, model, view);
        controller.mainLoop();

        System.out.println(queue);
    }
}
