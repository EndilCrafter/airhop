package fuzs.airhop.api.event.v1;

import fuzs.puzzleslib.api.event.v1.core.EventInvoker;
import net.minecraft.world.entity.player.Player;

public final class PlayerTickEvents {
    public static final EventInvoker<Start> START = EventInvoker.lookup(Start.class);
    public static final EventInvoker<End> END = EventInvoker.lookup(End.class);

    private PlayerTickEvents() {

    }

    @FunctionalInterface
    public interface Start {

        /**
         * Fires at the beginning of {@link Player#tick()}.
         *
         * @param player the ticking player
         */
        void onStartTick(Player player);
    }

    @FunctionalInterface
    public interface End {

        /**
         * Fires at the end of {@link Player#tick()}.
         *
         * @param player the ticking player
         */
        void onEndTick(Player player);
    }
}
