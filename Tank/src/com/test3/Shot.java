package com.test3;

//�ӵ���
class Shot implements Runnable  {
	int x;
	int y;
	int direct;
	int speed=2;
	//�Ƿ񻹻���
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
				//��
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
			
		//	System.out.println("�ӵ�����x="+x+" y="+y);
			//�ӵ���ʱ����???
			
			//�жϸ��ӵ��Ƿ�������Ե.
			if(x<0||x>400||y<0||y>300)
			{
				this.isLive=false;
				break;
			}
		}
	}
}
