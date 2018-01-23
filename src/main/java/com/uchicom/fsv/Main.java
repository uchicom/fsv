// (c) 2018 uchicom
package com.uchicom.fsv;

import java.io.File;

/**
 * @author uchicom: Shigeki Uchiyama
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 1) {
			// バッチ処理
			File root = new File(args[0]);
			Fsv fsv = new Fsv(root);
		} else {
			// TODO 画面表示
			// TODO 画面ドラッグアンドドロップ
			// TODO サイズの大きい順に並べる
			// TODO JTable でファイルサイズとパスを表示
			// TODO フォルダをファイルの合計にする
			// TODO ポップアップメニューでファイルの削除を可能にする
			// TODO 拡張子や正規表現等で種類をリストアップする
			// TODO 
		}
	}


}
