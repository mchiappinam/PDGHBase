package me.mchiappinam.pdghx1;

import java.io.File;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHX1] §2iniciando...");
		File file = new File(getDataFolder(),"config.yml");
		getServer().getConsoleSender().sendMessage("§3[PDGHX1] §2verificando se a config existe...");
		if(!file.exists()) {
			try {
				getServer().getConsoleSender().sendMessage("§3[PDGHX1] §2config inexistente, criando config...");
				saveResource("config_template.yml",false);
				File file2 = new File(getDataFolder(),"config_template.yml");
				file2.renameTo(new File(getDataFolder(),"config.yml"));
				getServer().getConsoleSender().sendMessage("§3[PDGHX1] §2config criada");
			}catch(Exception e) {getServer().getConsoleSender().sendMessage("§c[PDGHX1] §cERRO AO CRIAR CONFIG");}
		}
		getServer().getConsoleSender().sendMessage("§3[PDGHX1] §2registrando eventos...");
		getServer().getPluginManager().registerEvents(new Listeners(this), this);
		getServer().getConsoleSender().sendMessage("§3[PDGHX1] §2eventos registrados");
		getServer().getConsoleSender().sendMessage("§3[PDGHX1] §2definindo comandos...");
	    getServer().getPluginCommand("abc").setExecutor(new Comando(this));
		getServer().getConsoleSender().sendMessage("§3[PDGHX1] §2comandos definidos");
		getServer().getConsoleSender().sendMessage("§3[PDGHX1] §2ativado - Developed by mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHX1] §2Acesse: http://pdgh.net/");
	}
	    
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§3[PDGHX1] §2desativado - Developed by mchiappinam");
		getServer().getConsoleSender().sendMessage("§3[PDGHX1] §2Acesse: http://pdgh.net/");
	}
}
