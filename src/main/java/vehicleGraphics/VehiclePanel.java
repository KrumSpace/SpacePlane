package vehicleGraphics;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

//
public class VehiclePanel extends JPanel {
    private static final Color
            BACKGROUND = Color.BLACK,
            BORDER_COLOR = Color.RED;
    private static final int BORDER_OFFSET = 0;

    private final VehiclePanelData panelData;
    private final PainterInterface
            borderPainter,
            vehiclePainter;

    //
    public VehiclePanel(VehiclePanelData panelData) {
        super();
        this.panelData = panelData;
        setBackground(BACKGROUND);
        borderPainter = new BorderPainter(BORDER_COLOR, BORDER_OFFSET);
        vehiclePainter = new VehiclePainter(panelData.getVehicle());
    }

    //
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        borderPainter.paint(g);
        vehiclePainter.paint(g);
    }
}