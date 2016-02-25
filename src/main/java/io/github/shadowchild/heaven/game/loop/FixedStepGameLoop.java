package io.github.shadowchild.heaven.game.loop;


/**
 * Created by Zach Piddock on 23/02/2016.
 */
public class FixedStepGameLoop implements GameLoop {

    private boolean paused = false;
    private int targetUPS = 60;

    @Override
    public void start() {

    }

    @Override
    public void pause() {

        paused = !paused;
    }

    @Override
    public void stop() {

    }

    public boolean isPaused() {

        return paused;
    }

    public int getTargetUPS() {

        return targetUPS;
    }

    public void setTargetUPS(int targetUPS) {

        this.targetUPS = targetUPS;
    }
}
