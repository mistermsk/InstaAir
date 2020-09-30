package com.shanebeestudios.ia;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityAirChangeEvent;

public class PlayerListener implements Listener {

    @EventHandler
    private void onAirUp(EntityAirChangeEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof Player) {
            Player player = ((Player) entity);
            if (event.getAmount() > player.getRemainingAir() && player.hasPermission("instaair.replenish")) {
                event.setAmount(300);
            }
        }
    }

}
