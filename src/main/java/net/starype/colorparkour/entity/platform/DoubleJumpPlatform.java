package net.starype.colorparkour.entity.platform;

import com.jme3.app.SimpleApplication;
import com.jme3.math.ColorRGBA;
import net.starype.colorparkour.collision.CollisionManager;

public class DoubleJumpPlatform extends ColoredPlatform {

    public DoubleJumpPlatform(CollisionManager manager, SimpleApplication main, float[] size, float[] position, ColorRGBA color, String platformID) {
        super(manager, main, size, position, color, platformID);
    }
}
