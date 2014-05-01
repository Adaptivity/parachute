//  
//  =====GPL=============================================================
//  This program is free software; you can redistribute it and/or modify
//  it under the terms of the GNU General Public License as published by
//  the Free Software Foundation; version 2 dated June, 1991.
// 
//  This program is distributed in the hope that it will be useful, 
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//  GNU General Public License for more details.
// 
//  You should have received a copy of the GNU General Public License
//  along with this program;  if not, write to the Free Software
//  Foundation, Inc., 675 Mass Ave., Cambridge, MA 02139, USA.
//  =====================================================================
//
//
// Copyright 2011-2014 Michael Sheppard (crackedEgg)
//

package com.parachute.common;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.living.LivingFallEvent;


public class PlayerFallEvent {
	
	public PlayerFallEvent()
	{
		Parachute.proxy.print("PlayerFallEvent ctor");
	}
	
	@SubscribeEvent
	public void onFallEvent(LivingFallEvent ev)
	{
//		Parachute.proxy.print("in onFallEvent()");
		if (ev.entity.ridingEntity instanceof EntityParachute) {
//			Parachute.proxy.print("Cancelling the fall event - player is on a parachute");
			ev.setCanceled(true);
		}
	}
}