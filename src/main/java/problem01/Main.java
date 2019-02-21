package problem01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		int[] ar = arr;
		Map<String,List> result = new HashMap(); 
		int compare=0;
		String answer = null;
		for(int i=0; i< ar.length; i++){
			for(int t=0; t<ar.length; t++){
				if(i !=t){
					List li = new ArrayList();
					int num = ar[i]*ar[t];
					li.add(i);
					li.add(t);
					li.add(num);
					result.put(i+","+t, li);
				}
			}
		}
		for(Map.Entry<String,List> mp : result.entrySet()){
			List li = mp.getValue();
			if(compare ==0){
				compare =(Integer) li.get(2); 
				answer = mp.getKey();
			}else {
				if(compare < (Integer)li.get(2)){
					compare = (Integer)li.get(2);
					answer = mp.getKey();
				}
			}
			//System.out.println(mp);
		}
	//	System.out.println("["+answer+"]");
		String[] resultValue = answer.split((","));
		System.out.println("["+ arr[Integer.parseInt(resultValue[0])]+"," +arr[Integer.parseInt(resultValue[1])] +"]");

		
	}

}
