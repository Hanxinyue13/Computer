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
		System.out.println("CPU�ٶ�"+cpu.getSpeed());
		System.out.println("CPU���"+cpu.getRabbet());
		System.out.println("Ӳ������"+disk.getAmount());
		System.out.println("Ӳ��ת��"+disk.getRpm());
	}
}
