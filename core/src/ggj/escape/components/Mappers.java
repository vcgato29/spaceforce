package ggj.escape.components;

import com.badlogic.ashley.core.ComponentMapper;
import com.badlogic.ashley.core.Family;

public class Mappers {

    public static class families {
        public static Family characters = Family.getFor(CharacterComponent.class);
        public static Family cameras = Family.getFor(CameraComponent.class);
        public static Family players = Family.getFor(PlayerComponent.class, CharacterComponent.class);
        public static Family baddies = Family.getFor(BaddieComponent.class, PhysicsComponent.class, SpriteComponent.class);
        public static Family fx = Family.getFor(ExplosionComponent.class, SpriteComponent.class);
        public static Family physics = Family.getFor(PhysicsComponent.class);
        public static Family sprites = Family.getFor(SpriteComponent.class);
        public static Family bullets = Family.getFor(BulletComponent.class);
        public static Family triggers = Family.one(TriggerComponent.class, ExitComponent.class).get();
        public static Family exits = Family.getFor(ExitComponent.class);
        public static Family doors = Family.getFor(DoorComponent.class);
        public static Family props = Family.getFor(PropComponent.class);
        public static Family boss = Family.getFor(BossComponent.class);
    }

    public static final ComponentMapper<PhysicsComponent> physics = ComponentMapper.getFor(PhysicsComponent.class);
    public static final ComponentMapper<SpriteComponent> sprite = ComponentMapper.getFor(SpriteComponent.class);
    public static final ComponentMapper<CameraComponent> camera = ComponentMapper.getFor(CameraComponent.class);
    public static final ComponentMapper<CharacterComponent> character = ComponentMapper.getFor(CharacterComponent.class);
    public static final ComponentMapper<PlayerComponent> player= ComponentMapper.getFor(PlayerComponent.class);
    public static final ComponentMapper<BulletComponent> bullet = ComponentMapper.getFor(BulletComponent.class);
    public static final ComponentMapper<SpiderComponent> spider = ComponentMapper.getFor(SpiderComponent.class);
    public static final ComponentMapper<BaddieComponent> enemy = ComponentMapper.getFor(BaddieComponent.class);
    public static final ComponentMapper<ExplosionComponent> fx = ComponentMapper.getFor(ExplosionComponent.class);
    public static final ComponentMapper<ExitComponent> exit = ComponentMapper.getFor(ExitComponent.class);
    public static final ComponentMapper<BossComponent> boss = ComponentMapper.getFor(BossComponent.class);

}
