package com.rayzr522.dragonelytra;

import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class DragonElytra extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }
    
    @EventHandler
    public void onEntityDeath(EntityDeathEvent e) {
        if (e.getEntityType() == EntityType.ENDER_DRAGON) {
            e.getDrops().add(new ItemStack(Material.ELYTRA));
        }
    }

}
