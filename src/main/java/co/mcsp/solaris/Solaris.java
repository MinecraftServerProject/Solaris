package co.mcsp.solaris;

import co.mcsp.solaris.season.SeasonManager;
import io.vevox.vx.lib.logging.vxLogger;
import io.vevox.vx.lib.vxPlugin;

/**
 * @author Matthew Struble
 */
public class Solaris extends vxPlugin {

  public static class Managers {

    private SeasonManager seasons;

    private Managers(Solaris plugin, vxLogger logger) {

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
