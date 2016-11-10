package co.mcsp.solaris.weather;

import co.mcsp.solaris.Manager;
import co.mcsp.solaris.Solaris;
import io.vevox.vx.lib.logging.vxLogger;

/**
 * @author Matthew Struble
 */
public class WeatherManager extends Manager {


  public WeatherManager(Solaris plugin, Solaris.Managers managers, vxLogger logger) {
    super(plugin, managers, logger);

    worlds.forEach(w -> w.setGameRuleValue("doWeatherCycle", "false"));

    plugin.getServer().getScheduler().runTaskTimer(plugin, new Storms(worlds), 1L, 0L);
  }

  @Override
  public String getName() {
    return "weather";
  }

}
