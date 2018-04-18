package com.moustacheminer.sshcraft;

public class Configuration {
  public static final String MODID = "sshcraft";
  public static final String NAME = "SSHcraft";
  public static final String VERSION = "1.0";

  public static final String CLIENT_PROXY_CLASS = "com.moustacheminer.sshcraft.proxy.ClientProxy";
  public static final String SERVER_PROXY_CLASS = "com.moustacheminer.sshcraft.proxy.ServerProxy";

  public static enum sshItems {
    CHEESE("cheese", "ItemCheese"),
    CONSOLE("console", "BlockConsole");

    private String unlocalizedName;
    private String registryName;

    sshItems(String unlocalizedName, String registryName) {
      this.unlocalizedName = Configuration.MODID + "." + unlocalizedName;
      this.registryName = registryName;
    }

    public String getRegistryName() {
      return registryName;
    }

    public String getUnlocalizedName() {
      return unlocalizedName;
    }
  }
  
  
}
