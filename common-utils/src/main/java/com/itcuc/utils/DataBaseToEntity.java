package com.itcuc.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import java.sql.ResultSet;

public class DataBaseToEntity {
	/**
	 * 内部类 保存表格字段名和类型
	 * 
	 * @author xuanjiayao
	 *
	 */
	public class tableStrus {
		public tableStrus() {
		}

		String colName;
		String colType;
	};

	// 保存所有表的名字
	static Vector<String> tableName = new Vector<String>();
	
	/**
	 * 修改main方法为action方法, 方便调用
	 */
	public static void action() {
		// JDBC test = new JDBC(sql);
		// System.out.println(ColNameToClassName("role_function_id"));
		// TODO Auto-generated method stub
		String sql = "show tables;";// SQL语句
		DataBaseToEntity db1 = new DataBaseToEntity(sql);// 创建DBHelper对象
		try {
			ResultSet ret = db1.pst.executeQuery();// 执行语句，得到结果集
			while (ret.next()) {
				// 这里把所有表的名字读取出来
				String tName = ret.getString(1);
				tableName.add(tName);
				// System.out.println(tName);
			}
			String sql_t;
			for (String tName : tableName) {
				// 逐个表去读取字段和类型
				System.out.println("name=" + tName);
				// 保存表的字段和类型
				Vector<tableStrus> tableCol = new Vector<tableStrus>();
				sql_t = "show  columns from " + tName + ";";
				db1.setSql(sql_t);// 创建DBHelper对象
				ret = db1.pst.executeQuery();// 执行语句，得到结果集
				while (ret.next()) {
					tableStrus ts = db1.new tableStrus();
					ts.colName = ColNameToProName(ret.getString(1));
					ts.colType = colTypeToClassType(ret.getString(2));
					System.out.println(ts.colName + "," + ts.colType);
					tableCol.add(ts);
				} // 显示数据

				// 至此 tName和tableCol就是一个实体类，下面把它们生成代码
				creatClass(tName, tableCol);
			}

			ret.close();
			db1.close();// 关闭连接
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void creatClass(String className, Vector<tableStrus> tableCol) {
		// tName要先转成符合规则的类名称
		className = tabNameToClassName(className);
		String out = "//需要引入的包\r\n";
		out += "public class " + className + " implements Serializable {\r\n";
		for (tableStrus tc : tableCol) {
			out += "	private " + tc.colType + " " + tc.colName + ";\r\n";
			//如果需要get set方法可以在这里继续接着写
		}
		out += "	public " + className + "() {\r\n";
		out += "		super();\r\n";
		// TODO Auto-generated constructor stub
		out += "	}\r\n";

		out += "}\r\n";

		File f = new File("D:\\1");
		// 如果文件夹不存在则创建
		if (!f.exists() && !f.isDirectory()) {
			//System.out.println("//不存在");
			f.mkdir();
		} else {
			// System.out.println("//目录存在");
		}

		String path = "D:\\1\\" + className + ".txt";
		File file = new File(path);
		if (!file.exists()) {
			file.getParentFile().mkdirs();
		}
		try {
			file.createNewFile();
			// write
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(out);
			bw.flush();
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * 把表名转换为实体类的类名 例如role_function 变为RoleFunction
	 * 
	 * @param tabName
	 * @return
	 */
	public static String tabNameToClassName(String tabName) {
		String name = "";
		tabName = ColNameToProName(tabName);
		char[] cs = tabName.toCharArray();
		cs[0] -= 32;
		name = String.valueOf(cs);
		if (name == "" || name == null) {
			name = "ero";
		}
		return name;
	}

	/**
	 * 把表的列名转换为实体类的属性名 例如 col_name转换为colName
	 * 
	 * @param colName
	 * @return
	 */
	public static String ColNameToProName(String colName) {
		String name = "";
		String[] names = colName.split("_");
		name = names[0];
		if (names.length > 1) {
			for (int i = 1; i < names.length; i++) {
				char[] cs = names[i].toCharArray();
				cs[0] -= 32;
				name = name + String.valueOf(cs);
			}
		}
		if (name == "" || name == null) {
			name = "ero";
		}
		return name;
	}

	/***
	 * 把数据库字段类型转换为实体类属性类型
	 * 
	 * @param colType
	 * @return
	 */
	public static String colTypeToClassType(String colType) {
		String type = "";
		colType = colType.substring(0,3);
		System.out.println("type===="+colType);
		if ("int".equals(colType)) {
			// 整型
			type = "Integer ";
		} else if ("tim".equals(colType)) {
			// 时间类型
			type = "Timestamp ";
		} else if ("med".equals(colType)) {
			// 图片类型
			type = "byte[] ";
		} else {
			// 其他都是字符串
			type = "String ";
		}
		return type;
	}

	public static final String url = "jdbc:mysql://127.0.0.1/com_itcuc_base";
	public static final String name = "com.mysql.jdbc.Driver";
	public static final String user = "root";
	public static final String password = "root";

	public Connection conn = null;
	public PreparedStatement pst = null;

	public DataBaseToEntity(String sql) {
		try {
			Class.forName(name);// 指定连接类型
			conn = DriverManager.getConnection(url, user, password);// 获取连接
			pst = conn.prepareStatement(sql);// 准备执行语句
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setSql(String sql) {
		try {
			pst = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 准备执行语句
	}

	public void close() {
		try {
			this.conn.close();
			this.pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
