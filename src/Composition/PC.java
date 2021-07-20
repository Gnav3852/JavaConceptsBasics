package Composition;

public class PC {
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Monitor monitor, Motherboard motherboard) {
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        drawLogo();
    }

    private void drawLogo(){
        //
        //getMonitor().drawPixel(20,0,"yellow");
        monitor.drawPixel(20,0,"yellow");
    }


}
