import java.util.ArrayList;

public class ArrayListGithubPractice{

	public static void main(String[]args){
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(5);
		list2.add(6);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(5);
		list2.add(6);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(5);
		list2.add(6);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(5);
		list2.add(6);
		list2.add(1);
		list2.add(2);
		list2.add(3);


		System.out.println(list1);
		System.out.println(list2);
		printList(combineList(list1,list2));
		printList(removeDuplicates(list2));

	}

	public static ArrayList<Integer> combineList(ArrayList<Integer> list1, ArrayList<Integer> list2){
		for(int i=0;i<list2.size();i++){
			list1.add(list2.get(i));
			}
		return list1;
		}

	public static void printList(ArrayList list){
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+", ");
			}
			System.out.println();
		}

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
		for(int i=0;i<list.size();i++){
			for(int j=i;j>=0;j--){
				if(list.get(i)==list.get(j) && j!=i){
					list.remove(i);
					j++;
					i--;
					}
				}
			}
			return list;
		}

}