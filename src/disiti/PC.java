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
