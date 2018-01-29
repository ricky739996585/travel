package com.ricky.travel.gen;

public class GenMain {
	public static void main(String[] args) {
		String configFile = "/generatorConfig.xml";
		try {
			//这里填写需要对应的表名
			String[] tableNames = new String[] { "admin_user","apply_data","apply_expert","article","article_like_record","auth","cate",
			"city","country","divide","province","rs_user","scenic","scenic_create","scenic_like_record","scenic_photo","traffic"};
			GenMybatisFiles.gen(configFile, tableNames);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
