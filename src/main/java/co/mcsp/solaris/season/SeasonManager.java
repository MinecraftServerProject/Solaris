package co.mcsp.solaris.season;

import co.mcsp.solaris.Manager;
import co.mcsp.solaris.Solaris;

/**
 * @author Matthew Struble
 */
public class SeasonManager extends Manager {

  private static final String SECTION_NAME = "seasons";

  public SeasonManager(Solaris plugin, Solaris.Managers managers) {
    super(plugin, managers);
  }

  @Override
  public String getName() {
    return SECTION_NAME;
  }


}
