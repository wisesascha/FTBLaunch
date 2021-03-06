package net.ftb.util;

import java.io.File;
import java.net.URISyntaxException;
import java.security.CodeSource;

import net.ftb.gui.LaunchFrame;

public class OSUtils {
	/**
	 * Gets the default installation path for the current OS.
	 * @return a string containing the default install path for the current OS.
	 */
	public static String getDefInstallPath() {
		String osString = System.getProperty("os.name").toLowerCase();		
		if (osString.contains("win")) {
		return System.getProperty("user.home") + "/AppData/Roaming";
		}else if (osString.contains("nix") || osString.contains("nux")) {
			System.getProperty("user.home");
		} else if (osString.contains("mac")) {
			System.getProperty("user.home");
		}else{
			System.getProperty("user.home");
		}
		return osString;
	}

	public static OS getCurrentOS() {
		String osString = System.getProperty("os.name").toLowerCase();
		if (osString.contains("win")) {
			return OS.WINDOWS;
		} else if (osString.contains("nix") || osString.contains("nux")) {
			return OS.UNIX;
		} else if (osString.contains("mac")) {
			return OS.MACOSX;
		} else {
			return OS.OTHER;
		}
	}

	public enum OS {
		WINDOWS,
		UNIX,
		MACOSX,
		OTHER,
	}
}
