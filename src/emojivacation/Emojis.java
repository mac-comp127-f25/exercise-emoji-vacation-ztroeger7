package emojivacation;

import edu.macalester.graphics.*;

import java.awt.Color;

@SuppressWarnings("WeakerAccess")  // This stops Java from giving you warnings about your code that are not helpful here
public class Emojis {
    private static final Color
        HEAD_COLOR = new Color(0xFFDE30),
        HEAD_OUTLINE_COLOR = new Color(0xAC9620),
        MOUTH_COLOR = new Color(0xE45B5B),
        EYE_COLOR = new Color(0x000000),
        EYE_OUTLINE_COLOR = new Color(0x0AFF05);

    /**
     * Creates a smiley face emoji.
     *
     * @param size The overall width and height of the emoji.
     * @return A graphic that you can add to a window, or place inside some other graphics group.
     */
    public static GraphicsGroup createSmileyFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        Ellipse eye1 = createEye(size * 0.125);
        eye1.setCenter(size * 0.35, size * 0.4);
        group.add(eye1);

         Ellipse eye2 = createEye(size * 0.125);
        eye2.setCenter(size * 0.65, size * 0.4);
        group.add(eye2);

        Arc mouth = createSmile(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        return group;
    }

    public static GraphicsGroup createFrownyFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        Ellipse eye1 = createEye(size * 0.125);
        eye1.setCenter(size * 0.35, size * 0.4);
        group.add(eye1);

        Ellipse eye2 = createEye(size * 0.125);
        eye2.setCenter(size * 0.65, size * 0.4);
        group.add(eye2);

        Arc mouth = createFrown(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        return group;
    }

    public static GraphicsGroup createWinkingFace(double size) {
        GraphicsGroup group = new GraphicsGroup();

        group.add(createHead(size, size));

        Ellipse eye1 = createEye(size * 0.125);
        eye1.setCenter(size * 0.35, size * 0.4);
        group.add(eye1);

        Rectangle wink = createWink(size * 0.05, size * 0.2);
        wink.setCenter(size * 0.65, size * 0.4);
        group.add(wink);


        Arc mouth = createSmile(size * 0.6, size * 0.5);
        mouth.setCenter(size * 0.5, size * 0.75);
        group.add(mouth);

        return group;

    }

    /**
     * Creates an empty emoji head. The head fits inside the box from (0,0)
     * to (width,height).
     */
    private static Ellipse createHead(double height, double width) {
        Ellipse head = new Ellipse(0, 0, width, height);
        head.setFillColor(HEAD_COLOR);
        head.setStrokeColor(HEAD_OUTLINE_COLOR);
        head.setStrokeWidth(2);
        return head;
    }

    /**
     * Creates a smile-shaped arc. The arc is measured relative to its “implied ellipse,” which is
     * the shape that would be formed if the arc were extend all the way around. The size of the
     * resulting arc will be smaller than the implied ellipse’s size.
     *
     * @param ellipseWidth  The width of the implied ellipse from which the smile’s arc is cut.
     * @param ellipseHeight The width of the implied ellipse from which the smile’s arc is cut.
     */
    private static Arc createSmile(double ellipseWidth, double ellipseHeight) {
        Arc mouth = new Arc(0, 0, ellipseWidth, ellipseHeight, 200, 140);
        mouth.setStrokeColor(MOUTH_COLOR);
        mouth.setStrokeWidth(4);
        return mouth;
    }

    private static Arc createFrown(double ellipseWidth, double ellipseHeight) {
        Arc mouth = new Arc(0, 0, ellipseWidth, ellipseHeight, -200, -140);
        mouth.setStrokeColor(MOUTH_COLOR);
        mouth.setStrokeWidth(4);
        return mouth;
    }

    private static Ellipse createEye(double size) {
        Ellipse eye = new Ellipse(0, 0, size, size);
        eye.setFillColor(EYE_COLOR);
        eye.setStrokeColor(EYE_OUTLINE_COLOR);
        eye.setStrokeWidth(size/6);
        return eye;
    }

    private static Rectangle createWink(double RectHeight, double RectWidth) {
        Rectangle wink = new Rectangle(0,0,RectWidth,RectHeight);
        wink.setFillColor(EYE_COLOR);
        return wink;
    }

}
