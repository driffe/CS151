package CS151Hw03;

import java.util.concurrent.BlockingQueue;

/**
 * Class that bridge between Model and BarView
 */
public class Controller {
    BlockingQueue<Message> queue;
    Model model;
    BarView view;

    /**
     * Constructor of Controller class
     * @param queue BlocingQueue message
     * @param model Model class
     * @param view Barview class
     */
    public Controller(BlockingQueue<Message> queue, Model model, BarView view) {
        this.queue = queue;
        this.model = model;
        this.view = view;
    }

    /**
     * Class for looping to take next message and check what event happen based on exact message type
     */
    public void mainLoop() {
        while (view.isDisplayable()) {
            Message message = null;
            try {
                message = queue.take();
            } catch (InterruptedException exception) {

            }
            if(message.getClass() == UpdateMessage.class) {
                UpdateMessage updateMessage = (UpdateMessage) message;
                model.setSize(updateMessage.getRedSize(), updateMessage.getGreenSize(), updateMessage.getBlueSize());
                view.update(model.getRedSize(), model.getGreenSize(), model.getBlueSize());
                System.out.println(queue);
            } else if (message.getClass() == ResetMessage.class) {
                model.resetSize();
                view.resetText();
                System.out.println(queue);
            }
        }
    }
}
