package ink.terminal.sshcraft.init;

import ink.terminal.sshcraft.Configuration;
import ink.terminal.sshcraft.blocks.BlockConsole.BlockConsole;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
  @GameRegistry.ObjectHolder(Configuration.MODID + ":console")
  public static BlockConsole blockConsole;
  
  @SideOnly(Side.CLIENT)
  public static void initModels() {
    blockConsole.initModel();
  }
}
