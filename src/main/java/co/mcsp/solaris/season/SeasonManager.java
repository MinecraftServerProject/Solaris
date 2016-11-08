package co.mcsp.solaris.season;

import co.mcsp.solaris.Manager;
import co.mcsp.solaris.Solaris;
import io.vevox.vx.lib.logging.vxLogger;

/**
 * @author Matthew Struble
 */
public class SeasonManager extends Manager {

  private static final String SECTION_NAME = "seasons";

  public SeasonManager(Solaris plugin, Solaris.Managers managers, vxLogger logger) {
    super(plugin, managers, logger);
  }

  @Override
  public String getName() {
    return SECTION_NAME;
  }

  @Override
  public void onEnable() {
    if (config.getBoolean("enabled")) {
      logger.info("Seasons enabled: Waiting for other managers to hook");

    } else logger.info("Seasons disabled: Other managers remain linear.");
  }


}
