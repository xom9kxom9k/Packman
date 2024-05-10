import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TAdapter extends KeyAdapter {
    @Override
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (Model.inGame) {
            if (key == KeyEvent.VK_LEFT) {
                Model.req_dx = -1;
                Model.req_dy = 0;
            } else if (key == KeyEvent.VK_RIGHT) {
                Model.req_dx = 1;
                Model.req_dy = 0;
            } else if (key == KeyEvent.VK_UP) {
                Model.req_dx = 0;
                Model.req_dy = -1;
            } else if (key == KeyEvent.VK_DOWN) {
                Model.req_dx = 0;
                Model.req_dy = 1;
            } else if (key == KeyEvent.VK_ESCAPE && Model.timer.isRunning()) {
                Model.inGame = false;
            }
        } else {
            if (key == KeyEvent.VK_SPACE) {
                Model.inGame = true;
                Model.initGame();
            }
        }
    }
}
