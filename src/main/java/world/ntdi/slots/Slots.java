package world.ntdi.slots;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import redempt.redlib.commandmanager.CommandParser;
import world.ntdi.slots.Commands.GambleCMD;

public final class Slots extends JavaPlugin {

    public static Slots instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;

        new CommandParser(this.getResource("commands.rdcml")).parse().register("slots", this,
                new GambleCMD());

        Bukkit.getLogger().info("Slots is enabled!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Slots is disabled!");

    }

    public static Slots getInstance() {
        return instance;
    }
}
