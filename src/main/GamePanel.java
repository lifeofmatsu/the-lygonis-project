package main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import inputs.KeyInputs;
import inputs.MouseInputs;
import static utilz.Constants.PlayerConstants.*;
import static utilz.Constants.Directions.*;
import static utilz.Constants.ArcherConstants.*;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private float deltaX = 100, deltaY = 100;
    private Map<String, BufferedImage> images;
    private Map<String, BufferedImage[]> animations;
    private int animTick, animIndex, animSpeed = 15;
    private int playerAction = IDLE;
    private int playerDir = -1;
    private boolean moving = false;
    private String currentCharacter = "archer"; // You can change this to switch between characters

    public GamePanel() {
        mouseInputs = new MouseInputs(this);
        images = new HashMap<>();
        animations = new HashMap<>();
        importImages();
        loadAnimations();
        setPanelSize();
        addKeyListener(new KeyInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    private void importImages() {
        for (String action : ACTIONS) {
            String path = "/sprites/" + currentCharacter + "/" + action + ".png";
            try (InputStream is = getClass().getResourceAsStream(path)) {
                BufferedImage img = ImageIO.read(is);
                images.put(action, img);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void loadAnimations() {
        for (String action : ACTIONS) {
            BufferedImage img = images.get(action);
            int frames = GetSpriteAmount(currentCharacter, action);
            BufferedImage[] actionFrames = new BufferedImage[frames];
            for (int i = 0; i < frames; i++) {
                actionFrames[i] = img.getSubimage(i * 64, 0, 64, 40);
            }
            animations.put(action, actionFrames);
        }
    }

    private void setPanelSize() {
        Dimension size = new Dimension(1280, 800);
        setPreferredSize(size);
    }

    public void setDirection(int direction) {
        this.playerDir = direction;
        moving = true;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    private void updateAnimationTick() {
        animTick++;
        if (animTick >= animSpeed) {
            animTick = 0;
            animIndex++;
            if (animIndex >= animations.get(ACTIONS[playerAction]).length)
                animIndex = 0;
        }
    }

    private void setAnimation() {
        if (moving)
            playerAction = RUNNING;
        else
            playerAction = IDLE;
    }

    private void updatePos() {
        if (moving) {
            switch (playerDir) {
                case LEFT:
                    deltaX -= 5;
                    break;
                case UP:
                    deltaY -= 5;
                    break;
                case RIGHT:
                    deltaX += 5;
                    break;
                case DOWN:
                    deltaY += 5;
                    break;
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        updateAnimationTick();
        setAnimation();
        updatePos();

        g.drawImage(animations.get(ACTIONS[playerAction])[animIndex], (int) deltaX, (int) deltaY, 256, 160, null);
    }
}