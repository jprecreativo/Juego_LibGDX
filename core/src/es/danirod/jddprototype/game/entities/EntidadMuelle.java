package es.danirod.jddprototype.game.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Fixture;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by jose_ on 28/03/2017.
 */

public class EntidadMuelle extends Actor {

    // textura del muelle
    private Texture texture;

    // el mundo
    private World world;

    // el cuerpo asignado al muelle
    private Body body;

    // caracteristicas asignadas al muello
    private Fixture fixture;


    public EntidadMuelle(World world, Texture texture, float x, float y) {
        this.world = world;
        this.texture = texture;

        // creamos el cuerpo
        BodyDef def = new BodyDef();
        def.position.set(x, y + 0.1f);
        body = world.createBody(def);

        // le damos un contorno
        // me estoy fijando en el playerentity y spikeentity
    }
}
