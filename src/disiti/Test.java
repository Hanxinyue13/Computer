package disiti;
import cs1.HardDisk;
public class Test {
		public static void main(String args[]){
			CPU cpu =new CPU();			//����CPU
			cpu.setSpeed(2200);		//speed����Ϊ2200
			cpu.setRabbet(1155);	
			HardDisk disk=new HardDisk();			//����HardDisk
			disk.setAmount(200);
			disk.setRpm(5400);//disk��amount����Ϊ200
			PC pc=new PC();			//����PC
			pc.setCPU(cpu);
			pc.setHardDisk(disk);
			pc.show();
			
		}
}
	 
