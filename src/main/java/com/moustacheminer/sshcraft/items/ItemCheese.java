package com.moustacheminer.sshcraft.items;

import com.moustacheminer.sshcraft.Configuration;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemCheese extends Item {
  public ItemCheese() {
    setUnlocalizedName(Configuration.sshItems.CHEESE.getUnlocalizedName());
    setRegistryName(Configuration.sshItems.CHEESE.getRegistryName());
  }

  @SideOnly(Side.CLIENT)
  public void initModel() {
    ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
  }
}
