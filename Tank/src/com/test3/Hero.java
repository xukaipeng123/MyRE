package com.test3;

import java.util.Vector;

class Hero extends Tank
{	
	//子弹
	//Shot s=null;
	Vector<Shot> ss=new Vector<Shot>();
	Shot s=null;
	 int speed=5;
	public Hero(int x,int y)
	{
		super(x,y);	
	}
	//开火
	public void shotEnemy()
	{	
			switch(this.direct)
		{
		case 0:
			//创建一颗子弹
			 s=new Shot(x+10,y,0);
			//把子弹加入向量
			ss.add(s);
			break;
		case 1:
			s=new Shot(x+30,y+10,1);
			ss.add(s);
			break;
		case 2:
			 s=new Shot(x+10,y+30,2);
			ss.add(s);
			break;
		case 3:
			s=new Shot(x,y+10,3);
			ss.add(s);
			break;
			
		}
		//启动子弹线程
		Thread t=new Thread(s);
		t.start();
		
	}
}