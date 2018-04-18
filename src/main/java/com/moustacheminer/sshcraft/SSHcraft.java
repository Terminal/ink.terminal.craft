package com.moustacheminer.sshcraft;

import com.moustacheminer.sshcraft.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Configuration.MODID, name = Configuration.NAME, version = Configuration.VERSION)
public class SSHcraft {
  @Instance(Configuration.MODID)
  public static SSHcraft instance;

  @SidedProxy(clientSide = Configuration.CLIENT_PROXY_CLASS, serverSide = Configuration.SERVER_PROXY_CLASS)
  public static CommonProxy proxy;

  @EventHandler
  public void preInit(FMLPreInitializationEvent event) {
    System.out.println("Welcome to Moustacheminer Server Services!");
  }

  @EventHandler
  public void init(FMLInitializationEvent event) {
    System.out.println("Init");
  }

  @EventHandler
  public void postInit(FMLPostInitializationEvent event) {
    System.out.println("Post Init");
  }
}
