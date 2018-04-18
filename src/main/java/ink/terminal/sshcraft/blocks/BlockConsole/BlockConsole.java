package ink.terminal.sshcraft.blocks.BlockConsole;

import ink.terminal.sshcraft.SSHcraft;
import ink.terminal.sshcraft.util.SSHblockFront;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockConsole extends SSHblockFront implements ITileEntityProvider {
  public BlockConsole() {
    super("console", Material.ROCK);
  }
  
  @Override
  public TileEntity createNewTileEntity(World worldIn, int meta) {
    return new ConsoleTileEntity();
  }
  
  @Override
  public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing side, float hitX, float hitY, float hitZ) {
    // Only execute on the server
    if (world.isRemote) {
      return true;
    }
    TileEntity te = world.getTileEntity(pos);
    if (!(te instanceof ConsoleTileEntity)) {
      return false;
    }
    player.openGui(SSHcraft.instance, ProgrammerGui.GUI_ID, world, pos.getX(), pos.getY(), pos.getZ());
    return true;
  }
}
