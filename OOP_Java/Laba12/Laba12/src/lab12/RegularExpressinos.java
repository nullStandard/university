package lab12;
 import java.util.Scanner; import java.io.*; 
public class RegularExpressinos { 
 	public static void main(String[] args) throws IOException { 
 	 	Info info = new Info(); 
 	 	LinkedContainer<Info> list = new LinkedContainer<Info>();  	 	
 	 	Scanner in = new Scanner(System.in); 
 	 	System.out.println("a. ������� � ������\nb. ������� � �����"); 
 	 	String choise = in.nextLine();  	 	
 	 	while(true) {  	 	
 	 		switch(choise) {  	 	
 	 		case "a": 
 	 	 	System.out.print("���� �������� ���: ");  	 	 	
 	 	 	info.passport = in.nextLine();  	 	 	
 	 	 	list.add(info.passport);  	 	 	
 	 	 	System.out.print("���� �����: ");  	 	 	
 	 	 	info.education = in.nextLine();  	 	 	
 	 	 	list.add(info.education); 
 	 	 	System.out.print("���� ��������: ");  	 	 	
 	 	 	info.price = in.nextLine();  	 	 	
 	 	 	list.add(info.price); 
 	 	 	System.out.print("��� ����: ");  	 	 	
 	 	 	info.career_viddil = in.nextLine();  	 	 	
 	 	 	list.add(info.career_viddil);  	 	 	
 	 	 	System.out.print("���� ������: ");  	 	 	
 	 	 	info.career_position = in.nextLine();  	 	 	
 	 	 	list.add(info.career_position);  	 	 	
 	 	 	System.out.print("���� �����������: ");  	 	 	
 	 	 	info.career_date = in.nextLine();  	 	 	
 	 	 	list.add(info.career_date); 
 	 	 	System.out.print("��� ���� ������ ��������������: ");  	 	 	
 	 	 	for(int i = 0; i < 3; i++) {  	 	 	 	
 	 	 		info.characteristics[i] = in.nextLine();  	 	 	 	
 	 	 		list.add(info.characteristics[i]); 
 	 	 	} 
 	 	 	System.out.println(list.toString()); 
 	 	 	break;  	 	case "b": 
 	 	 	FileReader fr = new FileReader("info.txt");  	 	 	
 	 	 	BufferedReader into = new BufferedReader(fr);  	 	 	
 	 	 	while(into.ready()) { 
 	 	 	 	System.out.println(into.readLine()); 
 	 	 	} 
 	 	 	break;  	 	default : 
 	 	 	System.out.println("Wrong char"); 
 	 	 	 
 	 	} 
 	 	break; 
 	} 
 	 	 
 	} 
} 
