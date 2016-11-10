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
  }

  @Override
  public String getName() {
    return "weather";
  }

}
