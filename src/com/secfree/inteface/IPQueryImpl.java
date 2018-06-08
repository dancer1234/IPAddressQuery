package com.secfree.inteface;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.secfree.util.IPSeeker;

/**
 * 
 * IPQuery实现类
 * 
 * @author Bearcat
 *
 */
public class IPQueryImpl implements IPQuery{
	
	@Override
	public void queryOne(String ip) {
		IPSeeker is = new IPSeeker();
		System.out.println("\n" + ip + "----" +is.getAddress(ip));
		System.out.println("\n 查询完成");
	}
	
	public void queryAll(File filePath) {
		String ip;
		IPSeeker is = new IPSeeker();
		System.out.println("\n");
		try {
			BufferedReader read = new BufferedReader(new FileReader(filePath));
			while ((ip = read.readLine()) != null) {
				System.out.println(ip + "----" +is.getAddress(ip));
			}
			System.out.println("\n 查询完成");
		} catch (IOException e) {
			System.out.println("[!] " + filePath + " 文件不存在\n");
		}
	}
}