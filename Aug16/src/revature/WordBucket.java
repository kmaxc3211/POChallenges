package revature;

import java.util.ArrayList;
import java.util.List;

public class WordBucket {

	public static List<String> bucketize(String in, int size) {
		List<String> out = new ArrayList<String>();
		List<String> empty = new ArrayList<String>();
		
		String[] split = in.split(" ");
		
		String bucket = "";
		for(String s : split) {
			if(s.length() > size)
				return empty;
			String temp = bucket + " " + s;
			if(temp.trim().length() <= size) {
				bucket = temp.trim();
				continue;
			}
			else {
				out.add(bucket);
				bucket = s;
			}
		}
		
		out.add(bucket);
		return out;
	}
	
	public static void main(String[] args) {
		
		System.out.println(bucketize("she sells sea shells by the sea", 10).toString());
		System.out.println(bucketize("the mouse jumped over the cheese", 7).toString());
		System.out.println(bucketize("fairy dust coated the air", 20).toString());
		System.out.println(bucketize("a b c d e", 2).toString());
		
	}

}
