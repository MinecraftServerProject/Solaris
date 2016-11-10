package co.mcsp.solaris;

import com.google.common.collect.ImmutableSet;
import io.vevox.vx.lib.logging.vxLogger;
import org.bukkit.World;
import org.bukkit.configuration.ConfigurationSection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Matthew Struble
 */
public abstract class Manager {

  protected final Solaris plugin;
  protected final ConfigurationSection config;
  protected final Solaris.Managers managers;
  protected final vxLogger logger;

  protected Set<World> worlds;

  private boolean active;

  public Manager(Solaris plugin, Solaris.Managers managers, vxLogger logger) {
    this.plugin = plugin;
    this.managers = managers;
    config = plugin.getConfig().getConfigurationSection("effects." + getName());

    this.logger = new vxLogger(logger.name + ":" + getName(), logger);

    if (config.contains("enabled")) setActive(config.getBoolean("enabled"));

    Map<String, World> worldMap = new HashMap<>();
    plugin.getConfig().getStringList("config.worlds").forEach(name -> {
      World w = plugin.getServer().getWorld(name);
      if (w != null) worldMap.put(name, w);
    });
    config.getStringList("worlds").forEach(name -> {
      if (name.startsWith("!"))
        worldMap.remove(name);
      else {
        World w = plugin.getServer().getWorld(name);
        if (w != null) worldMap.put(name, w);
      }
    });
    worlds = ImmutableSet.copyOf(worldMap.values());
  }

  public abstract String getName();

  public final boolean isActive() {
    return active;
  }

  protected void setActive(boolean active) {
    this.active = active;
  }

  public void onEnable() {
    logger.info("Loaded.");
  }

}
