package simpleMethods;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Employee{

	
	int id;
	int importance; 
	List<Integer> subordinates;
}


public class EmployeeProb {
	
	public static void main(String[] args) {
		System.out.println(" vw");
	}
	
	
public int getImportance(List<Employee> employees, int id) {
        
        Map<Integer,Employee> map = new HashMap<>();
        int ans=0;
        for(Employee e : employees){
           map.put( e.id,e);
        }
        
        LinkedList<Employee> listEmp = new LinkedList<>();
       
        listEmp.addFirst(map.get(id));
        
        while(!listEmp.isEmpty()){
        	int temp= listEmp.getFirst().importance;
            ans= ans + temp;
            listEmp.removeFirst();
            
            for(int i : listEmp.getFirst().subordinates){
                listEmp.add(map.get(i));
            }
            
        }
        return 0;

    }
	
	
	
	

}
