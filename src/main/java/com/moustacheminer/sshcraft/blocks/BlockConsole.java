package com.moustacheminer.sshcraft.blocks;

import com.moustacheminer.sshcraft.Configuration;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockConsole extends Block {
  public BlockConsole() {
    super(Material.ROCK);
    setUnlocalizedName(Configuration.sshItems.CONSOLE.getUnlocalizedName());
    setRegistryName(Configuration.sshItems.CONSOLE.getRegistryName());
  }
}
