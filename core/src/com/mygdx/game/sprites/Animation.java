package com.mygdx.game.sprites;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import java.lang.reflect.Array;

/**
 * Created by Ofir on 11/01/2016.
 */
public class Animation {
    private com.badlogic.gdx.utils.Array<TextureRegion> frames;
    private float maxFrameTime;
    private float currentFrameTime;
    private int frameCount;
    private int frame;

    public Animation(TextureRegion region,int frameCount, float cycleTime){
        frames = new com.badlogic.gdx.utils.Array<TextureRegion>();
        int frameWidht = region.getRegionWidth() / frameCount;
        for(int i = 0;i < frameCount ; i++){
            frames.add(new TextureRegion(region, i * frameWidht, 0, frameWidht, region.getRegionHeight()));
        }
        this.frameCount = frameCount;
        maxFrameTime = cycleTime / frameCount;
        frame = 0;

    }

    public  void update(float dt){
        currentFrameTime += dt;
        if (currentFrameTime > maxFrameTime){
            frame++;
            currentFrameTime = 0;
        }
        if (frame >= frameCount)
            frame = 0;

    }

    public TextureRegion getFrame(){
        return  frames.get(frame);

    }

}
