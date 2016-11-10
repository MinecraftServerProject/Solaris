package co.mcsp.solaris.weather;

import org.bukkit.World;

import java.util.Set;

/**
 * @author Matthew Struble
 */
public class Storms implements Runnable {

  private Set<World> worlds;

  public Storms(Set<World> worlds) {
    this.worlds = worlds;
  }

  private void processWorldDawnTick(World world) {

    // TODO Actual dawn tick processing.
    world.getPlayers().forEach(p -> p.sendMessage("procesWorldDawnTick"));

  }

  @Override
  public void run() {

    worlds.stream().filter(w -> w.getTime() == 0).forEach(this::processWorldDawnTick);

  }

}
