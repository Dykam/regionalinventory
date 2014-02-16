package nl.dykam.dev.regionalinventory;

import nl.dykam.dev.KitManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

public class RegionalInventoryPlugin extends JavaPlugin {
    private KitManager kitManager;

    @Override
    public void onEnable() {
        if (!getKitManager()) return;
        reloadConfig();
    }

    @Override
    public void reloadConfig() {
        super.reloadConfig();

    }

    private boolean getKitManager() {
        RegisteredServiceProvider<KitManager> registration = Bukkit.getServicesManager().getRegistration(KitManager.class);
        if (registration == null) {
            return false;
        }
        kitManager = registration.getProvider();
        return true;
    }
}
