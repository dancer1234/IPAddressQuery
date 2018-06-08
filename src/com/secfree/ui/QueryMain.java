package com.secfree.ui;

import java.io.File;

import com.secfree.inteface.IPQueryImpl;

public class QueryMain {
	public static void main(String[] args) {
		if (args.length <= 0) {
			System.out.println("\n\t IP物理地址查询 V1.0");
			System.out.println("\t -h 单个IP查询\n\t -f 批量IP查询\n");
		}else {
			IPQueryImpl iqi = new IPQueryImpl();
			if("-h".equals(args[0])) {
				iqi.queryOne(args[1]);
			}else if("-f".equals(args[0])) {
				File filePath = new File(args[1]);
				iqi.queryAll(filePath);
			}
		}
	}
}