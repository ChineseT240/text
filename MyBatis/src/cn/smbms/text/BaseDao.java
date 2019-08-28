package cn.smbms.text;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;



public class BaseDao {

	/**
	 * ���ݿ������ڹرչ�����
	 */
	
	
	
	/*static String driver="com.mysql.jdbc.Driver";
	static String url="jdbc:mysql://localhost:3306/easybuy";
	static String user="root";
	static String password="123456";
	static Connection conn=null;*/
	/**
	 * ��ʼ�����Ӳ���,�������ļ�����
	 */
	/*public static void init()
	{
		Properties params=new Properties();
		String configFile="database.properties";  //�����ļ�·��
		//���������ļ��������
		InputStream is=BaseDao.class.getClassLoader().getResourceAsStream(configFile);
		try {
			params.load(is);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver=params.getProperty("driver");
		url=params.getProperty("url");
		user=params.getProperty("user");
		password=params.getProperty("password");
	}*/
	
	
	
	/**
	 * ��ȡ���ݿ����
	 */
	public static Connection getConnection(){
		Connection conn=null;
		String driver = ConfigManager.getInstance().getValue("driver");
		String url = ConfigManager.getInstance().getValue("url");
		String user = ConfigManager.getInstance().getValue("user");
		String password = ConfigManager.getInstance().getValue("password");
		if (conn==null) {
			//��ȡ���Ӳ������쳣
			try {
				Class.forName(driver);
				conn=DriverManager.getConnection(url,user,password);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
		
	}
	/**
	 * 查询操作
	 * @param connection
	 * @param pstm
	 * @param rs
	 * @param sql
	 * @param params
	 * @return
	 */
	public static ResultSet execute(Connection connection,PreparedStatement pstm,ResultSet rs,
			String sql,Object[] params) throws Exception{
		pstm = connection.prepareStatement(sql);
		for(int i = 0; i < params.length; i++){
			pstm.setObject(i+1, params[i]);
		}
		rs = pstm.executeQuery();
		return rs;
	}
	/**
	 * 更新操作
	 * @param connection
	 * @param pstm
	 * @param sql
	 * @param params
	 * @return
	 * @throws Exception
	 */
	public static int execute(Connection connection,PreparedStatement pstm,
			String sql,Object[] params) throws Exception{
		int updateRows = 0;
		pstm = connection.prepareStatement(sql);
		for(int i = 0; i < params.length; i++){
			pstm.setObject(i+1, params[i]);
		}
		updateRows = pstm.executeUpdate();
		return updateRows;
	}
	
	/**
	 * 释放资源
	 * @param connection
	 * @param pstm
	 * @param rs
	 * @return
	 */
	public static boolean closeResource(Connection connection,PreparedStatement pstm,ResultSet rs){
		boolean flag = true;
		if(rs != null){
			try {
				rs.close();
				rs = null;//GC回收
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				flag = false;
			}
		}
		if(pstm != null){
			try {
				pstm.close();
				pstm = null;//GC回收
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				flag = false;
			}
		}
		if(connection != null){
			try {
				connection.close();
				connection = null;//GC回收
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				flag = false;
			}
		}
		
		return flag;
	}
	
}
