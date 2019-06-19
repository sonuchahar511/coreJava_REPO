package com.chahar.core.systeminfo.ethernet_interfaces;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

public class EthernetInterfacesApp {

	public static void main(String[] args) throws SocketException {
		Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();

		for (NetworkInterface netIf : Collections.list(nets)) {
			System.out.println("Display name: " + netIf.getDisplayName());
			System.out.println("Name: " + netIf.getName());
			displaySubInterfaces(netIf);
		}
	}

	static void displaySubInterfaces(NetworkInterface netIf) throws SocketException {
		Enumeration<NetworkInterface> subIfs = netIf.getSubInterfaces();

		for (NetworkInterface subIf : Collections.list(subIfs)) {
			System.out.println("\t Sub Interface Display name: " + subIf.getDisplayName());
			System.out.println("\t Sub Interface Name: " + subIf.getName());
		}
	}

}
