package ink.terminal.sshcraft.blocks.BlockConsole;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;

public class ConsoleTileEntity extends TileEntity {
  // Reject if the player is too far away from the block
  public boolean canInteractWith(EntityPlayer playerIn) {
    return !isInvalid() && playerIn.getDistanceSq(pos.add(0.5D, 0.5D, 0.5D)) <= 64D;
  }
}
