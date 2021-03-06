package net.xolt.addons.packetfly;

import net.xolt.addons.packetfly.modules.PacketFly;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PacketFlyAddon extends MeteorAddon {

	public static final Logger LOG = LogManager.getLogger();

	@Override
	public void onInitialize() {
		LOG.info("Initializing Packet Fly Addon");
		Modules.get().add(new PacketFly());
	}

}
