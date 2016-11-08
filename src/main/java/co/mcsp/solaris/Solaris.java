package co.mcsp.solaris;

import co.mcsp.solaris.season.SeasonManager;
import io.vevox.vx.lib.vxPlugin;

/**
 * @author Matthew Struble
 */
public class Solaris extends vxPlugin {

  public static class Managers {

    private SeasonManager seasons;

    private Managers(Solaris plugin) {

    }

  }

  private Managers managers;

  {

    enable(lib -> {

      saveDefaultConfig();

      logger().info("Initializing managers...");
      managers = new Managers(this);

      return true;

    });

  }

}
