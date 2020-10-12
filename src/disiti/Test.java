package disiti;
import cs1.HardDisk;
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
	 
