# JAVA
CPU
## 阅读程序
```
package disiti;
public class CPU {
	int speed,rabbet;
	float Speed;
	CPU(){
	}
	public	int getSpeed(){
		return speed;
	}
	public	int getRabbet(){
		return rabbet;
	}
	public void setRabbet(int rabbet){
		this.rabbet=rabbet;
	}
	public void setSpeed(int speed){
		this.speed=speed;
	}
	public void setSpeed(float m){
		this.Speed=m;
	}
}
```  
```
package disiti;
import cs1.HardDisk;
public class PC {
private	CPU cpu;
private	HardDisk disk;
public	void setCPU(CPU c){
		this.cpu=c;
	}
public	void setHardDisk(HardDisk h){
		this.disk=h;	
	}
public	void show(){
		System.out.println("CPU速度"+cpu.getSpeed());
		System.out.println("CPU插槽"+cpu.getRabbet());
		System.out.println("硬盘容量"+disk.getAmount());
		System.out.println("硬盘转速"+disk.getRpm());
	}
}
```  
```
package disiti;
import cs1.HardDisk; 		//调用不同包中的类
public class Test {
		public static void main(String args[]){
			CPU cpu =new CPU();			//创建CPU
			cpu.setSpeed(2200);		//speed设置为2200
			cpu.setRabbet(1155);	
			HardDisk disk=new HardDisk();			//创建HardDisk
			disk.setAmount(200);
			disk.setRpm(5400);//disk的amount设置为200
			PC pc=new PC();			//创建PC
			pc.setCPU(cpu);
			pc.setHardDisk(disk);
			pc.show();
			
		}
}
```  
```
package cs1;
public class HardDisk {
private		int amount;
private		int rpm;
public		int getAmount(){
			return amount;
		}
		public		int getRpm(){
			return rpm;
		}
		public void setamount(int m){
			this.amount=m;
		}
		public void setAmount(int amount){
			this.amount=amount;
		}
		public void setRpm(int rpm){
			this.rpm=rpm;
		}	 

}
```  
## 实验目的  
1、初步使用JAVA编写简单的语句程序同时加深对软件的使用。  
2、在实验中对包、类等的划分进行理解。  
3、实际操作感受不同权限（public、private）下不同类进行互相访问时的差别。  
3、加深复习构造方法以及类的不同属性的应用。  
## 实验过程  
第一步-创建新的JAVA项目  
第二步-创建CUP、HardDisk、Test、PC四个类  
第三步-编写CPU类中的语句，如：定义setSpeed（）、getSpeed（），并用setSpeed（int m）方法将m的值赋值给speed，同时完成附加任务中的两种构造方法和类的两种属性。  
第四步-编写HardDisk类中的语句，如：定义setAmount（）、getAmount（），并用setAmount（int m）方法将m的值赋值给amount，getAmount（）返回amount的值，同时完成附加任务中的两种构造方法和类的两种属性。  
第五步-编写Test类中单语句，如：对cup、harddisk、pc进行新建并进行赋值操作，调用其余三个类中的语句或方法。  
第六步-编辑PC类中的语句，如：新建语句以及编写输出语句等。  
第七步-运行程序。  
## 核心方法  
例：
```
package disiti;
import cs1.HardDisk;
public class PC {                            //公共可用
private	CPU cpu;                         //仅本类别可用
private	HardDisk disk;
public	void setCPU(CPU c){
		this.cpu=c;
	}
public	void setHardDisk(HardDisk h){
		this.disk=h;	
	}
public	void show(){
		System.out.println("CPU速度"+cpu.getSpeed());
		System.out.println("CPU插槽"+cpu.getRabbet());		//展示CPU中的两个属性
		System.out.println("硬盘容量"+disk.getAmount());
		System.out.println("硬盘转速"+disk.getRpm());		//展示HardDisk中的两个属性
	}
}
```  
```
package disiti;
import cs1.HardDisk; 		//调用不同包中的类
public class Test {
		public static void main(String args[]){
			CPU cpu =new CPU();			//创建CPU
			cpu.setSpeed(2200);		//speed设置为2200
			cpu.setRabbet(1155);	
			HardDisk disk=new HardDisk();			//创建HardDisk
			disk.setAmount(200);
			disk.setRpm(5400);//disk的amount设置为200
			PC pc=new PC();			//创建PC
			pc.setCPU(cpu);
			pc.setHardDisk(disk);
			pc.show();
			
		}
}
```  
## 实验结果  
第一次新建类时，Cup、HardDisk、PC使用了仅包内能调用同时新建了Cpu2为公共，在另一个包内新建了Text类并进行响应语句的编写，得到结果Cpu2的语句可以正常执行，而另外两个仅包内可调用的类（HardDisk、PC）显示报错没有找到。（因还有后续步骤，部分类已经删除，不分类已做修改）  
第二次对三个类都进行了公开，但对各类中不分语句进行private设置，因都是不需要其他类进行调用的语句所以对权限和运行没有影响。并添加了cup的插口信息和硬盘的转速信息。程序可正常运行并显示结果  
## 实验感想  
通过本次的实验不仅对之前的课程有了进一步知识的加深对软件使用的熟练，同时对编写程序有了初步的练习。对包、类、类中的属性有了进一步的理解。学会使用不同权限来对各类中的语句进行编辑。  
