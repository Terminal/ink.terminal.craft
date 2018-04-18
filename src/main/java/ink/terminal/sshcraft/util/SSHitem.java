package ink.terminal.sshcraft.util;

import ink.terminal.sshcraft.Configuration;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SSHitem extends Item {
  public SSHitem(String szName) {
    super();
    setRegistryName(szName);
    setUnlocalizedName(Configuration.MODID + "." + szName);
  }
  
  @SideOnly(Side.CLIENT)
  public void initModel() {
    ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
  }
}
