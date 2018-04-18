package com.moustacheminer.sshcraft.init;

import com.moustacheminer.sshcraft.Configuration;
import com.moustacheminer.sshcraft.blocks.BlockConsole;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
  @GameRegistry.ObjectHolder(Configuration.MODID + ":console")
  public static BlockConsole blockConsole;
  
  @SideOnly(Side.CLIENT)
  public static void initModels() {
    // TODO: Add blocks
  }
}
