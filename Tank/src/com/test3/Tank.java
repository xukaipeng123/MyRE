package com.test3;

//̹����
class Tank
{
	//��ʾ̹�˵ĺ�����
	int x=0;
	//̹��������
	int y=0;
	
	//̹�˷���
	//0��ʾ�� 1��ʾ �� 2��ʾ��  3��ʾ��
	int direct=0;
	int color;
	
	boolean isLive=true;
	
	//̹�˵��ٶ�
	int speed=2;
	public Tank(int x,int y)
	{
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDirect() {
		return direct;
	}

	public void setDirect(int direct) {
		this.direct = direct;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
	
}