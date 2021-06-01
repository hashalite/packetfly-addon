package net.xolt.addons.packetfly.mixins;

import net.minecraft.client.MinecraftClient;
import net.xolt.addons.packetfly.modules.PacketFly;
import minegame159.meteorclient.systems.modules.Modules;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Entity.class)
public abstract class EntityMixin {
    @Inject(method = "pushAwayFrom", at = @At("HEAD"), cancellable = true)
    private void onApplyCollision(Entity entity, CallbackInfo info) {
        if (Modules.get().get(PacketFly.class).isActive() && entity == MinecraftClient.getInstance().player) {info.cancel();}
    }
}