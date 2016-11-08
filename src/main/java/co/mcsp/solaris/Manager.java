package co.mcsp.solaris;

import io.vevox.vx.lib.logging.vxLogger;
import org.bukkit.configuration.ConfigurationSection;

/**
 * @author Matthew Struble
 */
public abstract class Manager {

  protected final Solaris plugin;
  protected final ConfigurationSection config;
  protected final Solaris.Managers managers;
  protected final vxLogger logger;

  private boolean active;

  public Manager(Solaris plugin, Solaris.Managers managers, vxLogger logger) {
    this.plugin = plugin;
    this.managers = managers;
    config = plugin.getConfig().getConfigurationSection(getName());

    this.logger = new vxLogger(logger.name + ":" + getName(), logger);
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
