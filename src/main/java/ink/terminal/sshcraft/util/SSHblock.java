package ink.terminal.sshcraft.util;

import ink.terminal.sshcraft.Configuration;
import ink.terminal.sshcraft.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SSHblock extends Block {
  public SSHblock(String szName, Material blockMaterial) {
    super(blockMaterial);
    setRegistryName(szName);
    setUnlocalizedName(Configuration.MODID + "." + szName);
    setCreativeTab(ModItems.tab);
  }
  
  @SideOnly(Side.CLIENT)
  public void initModel() {
    ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
  }
}
