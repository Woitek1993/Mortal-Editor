package me;


public class Mortal {
	public byte[] old,user,iconData,newIconData;
	public String mortalAdress,iconAdress;
	Mortal(byte[]old, String mortalAdress,String iconAdress, byte[] iconData){
		this.old = old;
		this.mortalAdress = new String(mortalAdress);
		this.iconAdress = iconAdress;
		this.iconData = iconData;
	}
}

