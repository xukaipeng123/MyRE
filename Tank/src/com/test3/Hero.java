package com.test3;

import java.util.Vector;

class Hero extends Tank
{	
	//�ӵ�
	//Shot s=null;
	Vector<Shot> ss=new Vector<Shot>();
	Shot s=null;
	 int speed=5;
	public Hero(int x,int y)
	{
		super(x,y);	
	}
	//����
	public void shotEnemy()
	{	
			switch(this.direct)
		{
		case 0:
			//����һ���ӵ�
			 s=new Shot(x+10,y,0);
			//���ӵ���������
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
		//�����ӵ��߳�
		Thread t=new Thread(s);
		t.start();
		
	}
}