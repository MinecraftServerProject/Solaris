package co.mcsp.solaris;

import co.mcsp.solaris.season.SeasonManager;
import co.mcsp.solaris.time.TimeManager;
import io.vevox.vx.lib.logging.vxLogger;
import io.vevox.vx.lib.vxPlugin;

/**
 * @author Matthew Struble
 */
public class Solaris extends vxPlugin {

  public static class Managers {

    public final SeasonManager seasons;
    public final TimeManager time;

    private Managers(Solaris plugin, vxLogger logger) {
      seasons = new SeasonManager(plugin, this, logger);
      time = new TimeManager(plugin, this, logger);
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
