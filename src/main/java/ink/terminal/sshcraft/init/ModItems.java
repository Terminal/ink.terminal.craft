package ink.terminal.sshcraft.init;

import ink.terminal.sshcraft.Configuration;
import ink.terminal.sshcraft.items.ItemCheese;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
  @GameRegistry.ObjectHolder(Configuration.MODID + ":cheese")
  public static ItemCheese itemCheese;
  
  @SideOnly(Side.CLIENT)
  public static void initModels() {
    itemCheese.initModel();
  }
  
  public static final CreativeTabs tab = new CreativeTabs(Configuration.MODID) {
    @Override
    public ItemStack getTabIconItem() {
      return new ItemStack(ModItems.itemCheese, 1, 0);
    }
  };
}
