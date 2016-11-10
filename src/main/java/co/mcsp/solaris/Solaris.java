package co.mcsp.solaris;

import co.mcsp.solaris.season.SeasonManager;
import co.mcsp.solaris.time.TimeManager;
import co.mcsp.solaris.weather.WeatherManager;
import io.vevox.vx.lib.logging.vxLogger;
import io.vevox.vx.lib.vxPlugin;

/**
 * @author Matthew Struble
 */
public class Solaris extends vxPlugin {

  @SuppressWarnings("unused")
  public static class Managers {

    public final SeasonManager seasons;
    public final TimeManager time;
    public final WeatherManager weather;

    private Managers(Solaris plugin, vxLogger logger) {
      seasons = new SeasonManager(plugin, this, logger);
      time = new TimeManager(plugin, this, logger);
      weather = new WeatherManager(plugin, this, logger);
    }

  }

  private Managers managers;
  private vxLogger logger;

  {

    load(lib -> logger = logger());

    enable(lib -> {

      saveDefaultConfig();

      logger().info("Initializing managers...");
      managers = new Managers(this, logger());

      return true;

    });

  }

}
