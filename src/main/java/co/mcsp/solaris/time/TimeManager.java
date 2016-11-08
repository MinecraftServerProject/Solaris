package co.mcsp.solaris.time;

import co.mcsp.solaris.Manager;
import co.mcsp.solaris.Solaris;
import io.vevox.vx.lib.logging.vxLogger;

/**
 * @author Matthew Struble
 */
public class TimeManager extends Manager {

  public TimeManager(Solaris plugin, Solaris.Managers managers, vxLogger logger) {
    super(plugin, managers, logger);
  }

  @Override
  public String getName() {
    return "time";
  }

  @Override
  public void onEnable() {
    if (isActive()) {
      logger.info("Time manager enabled.");
      if (managers.seasons.isActive() && config.getBoolean("use-seasons")) {
        logger.info("Using seasonal variations for daylight cycle");

      } else {

      }
    } else logger.info("Time manager disabled.");
  }

}
