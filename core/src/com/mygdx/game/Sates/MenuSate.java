package com.mygdx.game.Sates;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.FlappyDemo;

/**
 * Created by Ofir on 31/12/2015.
 */
public class MenuSate extends State {
    private Texture background;
    private Texture playbtn;
    private Texture eyos;
    public MenuSate(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playbtn = new Texture("playbtn.png");
        eyos = new Texture("Eyos.png");
    }

    @Override
    public void handeInput() {
        if(Gdx.input.justTouched()) {
            gsm.set(new PlaySate(gsm));

        }
    }

    @Override
    public void update(float dt) {
        handeInput();

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
            sb.draw(background, 0, 0, FlappyDemo.WIDTH, FlappyDemo.HIEGHT);
            sb.draw(playbtn,FlappyDemo.WIDTH/2-(playbtn.getWidth())/2,FlappyDemo.HIEGHT/2);
            sb.draw(eyos,-40,660 );
        sb.end();
    }

    @Override
    public void dispose() {
        background.dispose();
        playbtn.dispose();
        eyos.dispose();

    }

}
