//GPL v2
/*
 * 
 */
package com.litecoding.andorstrail.editor.entity.common;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;


public abstract class Loot {
	public int mExp;
	public int mGold;
	public ItemContainer mItemContainer;
	public Coord mPosition;
	public boolean mIsVisible;
	
	public Loot(int version, DataInputStream dis) throws IOException {
		
	}
	
	public abstract void writeToStream(DataOutputStream dos) throws IOException;
	
}