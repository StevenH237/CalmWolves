package com.gmail.nixillumbreon.CalmWolves;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wolf;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;

public class SitListener implements Listener {
  @EventHandler
  public void eventListener(PlayerInteractEntityEvent event) {
    Entity en = event.getRightClicked();
    Player pl = event.getPlayer();
    if (!(en instanceof Wolf)) return;
    Wolf wolf = (Wolf) en;
    if (wolf.isTamed() == false) return;
    if (wolf.getOwner() != pl) return;
    ItemStack item = pl.getItemInHand();
    switch (item.getType()) {
      case COOKED_BEEF:
      case COOKED_CHICKEN:
      case COOKED_FISH:
      case GRILLED_PORK:
      case INK_SACK:
      case LEASH:
      case NAME_TAG:
      case RAW_BEEF:
      case RAW_CHICKEN:
      case RAW_FISH:
      case PORK:
      case ROTTEN_FLESH:
        return;
      default: break;
    }
    wolf.setAngry(false);
  }
}
