package io.github.shifukatogaming.shichi;

import java.sql.SQLException;

import io.github.shifukatogaming.shichi.item.ModItems;
import io.github.shifukatogaming.shichi.mysql.MysqlConnection;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ShichiMain.MODID, name = ShichiMain.NAME, version = ShichiMain.VERSION)
public class ShichiMain 
{
	
	public static final String MODID = "";
	public static final String NAME = "MafiaCraft";
	public static final String VERSION = "0.0.1-ALPHA";
	
	@Instance(MODID)
	public static ShichiMain instance;
	
	@SidedProxy(clientSide = "io.github.shifukatogaming.shichi.client.ClientProxy", serverSide = "io.github.shifukatogaming.shichi.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) throws ClassNotFoundException, SQLException 
	{
		ModItems.init();
		MysqlConnection.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		
	}
	
}
