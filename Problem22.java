import java.util.*;
import java.io.*;

public class Problem22 {

	public static void main(String[] args) {

		List<String> list = readFromFile();
		System.out.println(list.size());

		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);

		int idx = 1;
		int totalWeight = 0;

		for (String name: list) {

			int weight = 0;
			for(int i = 0; i < name.toCharArray().length; i++) {
				weight += name.charAt(i) % 0x20;
			}


			totalWeight += weight*idx;
			idx++;
		}


		System.out.println(totalWeight);

	}




	public static List<String> readFromFile() {

	 	try {
           
            String strFile = "names.txt";
           
            BufferedReader br = new BufferedReader( new FileReader(strFile));
            String strLine = "";
            StringTokenizer st = null;
           
            List<String> list = new ArrayList<String>();

            while( (strLine = br.readLine()) != null) {

                    st = new StringTokenizer(strLine, ",");
                   
                    while(st.hasMoreTokens()) {
                            String str = st.nextToken();
                    		String s = str.substring(1,str.length()-1);
                    		list.add(s);
                    }

                   
            }

            return list;
                               
        }
        catch(Exception e)
        {
            System.out.println("Exception while reading csv file: " + e);
            throw new RuntimeException();               
        }
	}
}