package com.test3;

//子弹类
class Shot implements Runnable  {
	int x;
	int y;
	int direct;
	int speed=2;
	//是否还活着
	boolean isLive=true;
	public Shot(int x,int y,int direct)
	{
		this.x=x;
		this.y=y;
		this.direct=direct;
	}
	public void run() {
		
		while(true)
		{
			
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			switch(direct)
			{
			case 0:
				//上
				y-=speed;
				break;
			case 1:
				x+=speed;
				break;
			case 2:
				y+=speed;
				break;
			case 3:
				x-=speed;
				break;
			}
			
		//	System.out.println("子弹坐标x="+x+" y="+y);
			//子弹何时死亡???
			
			//判断该子弹是否碰到边缘.
			if(x<0||x>400||y<0||y>300)
			{
				this.isLive=false;
				break;
			}
		}
	}
}
