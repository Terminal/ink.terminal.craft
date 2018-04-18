package ink.terminal.sshcraft.blocks;

import ink.terminal.sshcraft.Configuration;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockConsole extends Block {
  public BlockConsole() {
    super(Material.ROCK);
    setUnlocalizedName(Configuration.sshItems.CONSOLE.getUnlocalizedName());
    setRegistryName(Configuration.sshItems.CONSOLE.getRegistryName());
  }
}
