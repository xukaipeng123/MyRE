package com.test3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Vector;

//记录类,同时也可以保存玩家的设置
class Recorder
{
	//记录每关有多少敌人
	private static int enNum=20;
	//设置我有多少可以用的人
	private static int myLife=3;
	//记录总共消灭了多少敌人
	private static int allEnNum=0;
	//从文件中恢复记录点
	static Vector<Node>  nodes=new Vector<Node>();
	
	private static FileWriter fw=null;
	private static BufferedWriter bw=null;
	private static FileReader fr=null;
	private static BufferedReader br=null;
	
	private  Vector<EnemyTank> ets=new Vector<EnemyTank>();
	
	
	
	//完成读取认为
	public Vector<Node> getNodesAndEnNums()
	{
		try {
			fr=new FileReader("d:\\myRecording.txt");
			br=new BufferedReader(fr);
			String n="";
			//先读取第一行
			n=br.readLine();
			allEnNum=Integer.parseInt(n);
			while((n=br.readLine())!=null)
			{
				String []xyz=n.split(" "); 
				
				Node node=new Node(Integer.parseInt(xyz[0]),Integer.parseInt(xyz[1]),Integer.parseInt(xyz[2]));
				nodes.add(node);
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			
			try {
				//后打开则先关闭
				br.close();
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
		
		return nodes;
		
	}
	
	
	//保存击毁敌人的数量和敌人坦克坐标,方向
	
	public  void keepRecAndEnemyTank()
	{
		try {
			
			//创建
			fw=new FileWriter("d:\\myRecording.txt");
			bw=new BufferedWriter(fw);
			
			bw.write(allEnNum+"\r\n");
			
			System.out.println("size="+ets.size());
			//保存当前活的敌人坦克的坐标和方向
			for(int i=0;i<ets.size();i++)
			{
				//取出第一个坦克
				EnemyTank et=ets.get(i);
				
				if(et.isLive)
				{
					//活的就保存
					String recode=et.x+" "+et.y+" "+et.direct;
					
					//写入
					bw.write(recode+"\r\n");
					
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
		
			//关闭流
			try {
				//后开先关闭
				bw.close();
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
	
	
	//从文件中读取，记录
	public static void getRecoring()
	{
		try {
			fr=new FileReader("d:\\myRecording.txt");
			br=new BufferedReader(fr);
			String n=br.readLine();
			allEnNum=Integer.parseInt(n);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			
			try {
				//后打开则先关闭
				br.close();
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
	
	//把玩家击毁敌人坦克数量保存到文件中
	public static void keepRecording()
	{
		try {
			
			//创建
			fw=new FileWriter("d:\\myRecording.txt");
			bw=new BufferedWriter(fw);
			
			bw.write(allEnNum+"\r\n");
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
		
			//关闭流
			try {
				//后开先关闭
				bw.close();
				fw.close();
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}
	
	public static int getEnNum() {
		return enNum;
	}
	public static void setEnNum(int enNum) {
		Recorder.enNum = enNum;
	}
	public static int getMyLife() {
		return myLife;
	}
	public static void setMyLife(int myLife) {
		Recorder.myLife = myLife;
	}
	
	//减少敌人数
	public static void reduceEnNum()
	{
		enNum--;
	}
	//消灭敌人
	public static void addEnNumRec()
	{
		allEnNum++;
	}
	public static int getAllEnNum() {
		return allEnNum;
	}
	public static void setAllEnNum(int allEnNum) {
		Recorder.allEnNum = allEnNum;
	}


	public  Vector<EnemyTank> getEts() {
		return ets;
	}


	public  void setEts(Vector<EnemyTank> ets1) {
		
		this.ets = ets1;
		System.out.println("ok");
	}
}