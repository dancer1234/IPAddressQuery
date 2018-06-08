package com.secfree.inteface;

import java.io.File;
import java.util.List;

/**
 * 
 * IP查询接口
 * @author Bearcat
 *
 */
public interface IPQuery {
	/*
	 * 单个IP查询
	 */
	public abstract void queryOne(String ip);
	
	/*
	 * 批量查询 
	 */
	public abstract void queryAll(File filePath);
}
