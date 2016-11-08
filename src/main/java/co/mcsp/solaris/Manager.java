package co.mcsp.solaris;

import org.bukkit.configuration.ConfigurationSection;

/**
 * @author Matthew Struble
 */
public abstract class Manager {

  protected final Solaris plugin;
  protected final ConfigurationSection config;
  protected final Solaris.Managers managers;

  private boolean active;

  public Manager(Solaris plugin, Solaris.Managers managers) {
    this.plugin = plugin;
    this.managers = managers;
    config = plugin.getConfig().getConfigurationSection(getName());
  }

  public abstract String getName();

  public final boolean isActive() {
    return active;
  }

  protected void setActive(boolean active) {
    this.active = active;
  }

}
