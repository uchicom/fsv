// (c) 2018 uchicom
package com.uchicom.fsv;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
public class Fsv {

	private List<File> fileList = new ArrayList<>();

	public Fsv(File root) {
		if (root.isDirectory()) {
			nest(root);
		}
		Collections.sort(fileList, new Comparator<File>() {

			@Override
			public int compare(File o1, File o2) {
				long result = o1.length() - o2.length();
				if (result > 0) {
					return 1;
				} else if (result < 0) {
					return -1;
				}
				return 0;
			}

		});
		fileList.forEach((file)->{
			System.out.println(file.length() + " " + file.getPath());
		});
	}

	public void nest(File dir) {
		for (File file : dir.listFiles()) {
			if (file.isDirectory()) {
				nest(file);
			} else {
				fileList.add(file);
			}
		}
	}
}
