import java.util.Scanner;

public class Room1 {

	private int q;
	Scanner keyboard = new Scanner(System.in);

	//here is the answer system
	public void answerSystem(String username){
		System.out.printf("%s let's start with the Room 1 \n",username);

		q = (int) (Math.random()*15);

		//Display all the question
		System.out.printf("      %s          ",questions1(q));
		System.out.println();

		//Display all the possible answers
		String[] answer=answers1(q);
		System.out.printf("1)%s        2)%s\n",answer[0],answer[1]);
		System.out.printf("3)%s        4)%s\n",answer[2],answer[3]);


		System.out.println("Your answer is:");
		int option = keyboard.nextInt();
		int right = rightAnswer(q);


		if(option == right) {
			System.out.println();
			System.out.println("CORRECT");
		} else {
			System.out.println();
			System.out.println("WRONG");
			System.out.printf("The correct answer is: %s",answer[right]);
			System.out.println("You can find more information in this link: https//.....");
		}
	}



	//here there are all the questions
	public String questions1(int i){
		String[] q1 = new String[15];
		q1[0]="q1";
		q1[1]="q2";
		q1[2]="q3";
		q1[3]="q4";
		q1[4]="q5";
		q1[5]="q6";
		q1[6]="q7";
		q1[7]="q8";
		q1[8]="q9";
		q1[9]="q10";
		q1[10]="q11";
		q1[11]="q12";
		q1[12]="q13";
		q1[13]="q14";
		q1[14]="q15";

		return q1[i];
	}


	//here there are all the possible answers
	public String[]answers1(int i){
		String[][] a1 = {{"a11","a12","a13","a14"},
		{"a21","a22","a23","a224"},
		{"a31","a32","a33","a34"},
		{"a41","a42","a43","a44"},
		{"a51","a52","a53","a54"},
		{"a61","a62","a63","a64"},
		{"a71","a72","a73","a74"},
		{"a81","a82","a83","a84"},
		{"a91","a92","a93","a94"},
		{"a101","a102","a103","a104"},
		{"a111","a112","a113","a114"},
		{"a121","a122","a123","a124"},
		{"a131","a132","a133","a134"},
		{"a141","a142","a143","a144"},
		{"a151","a152","a153","a154"}};

		String[] answ= {a1[i][0],a1[i][1],a1[i][2],a1[i][3]};

		return answ;
	}


	//Here there are all the righ answers for every question
	public int rightAnswer(int i) {

		int[] r_answer= new int[15];

		r_answer[0]=3;
		r_answer[1]=4;
		r_answer[2]=1;
		r_answer[3]=1;
		r_answer[4]=2;
		r_answer[5]=3;
		r_answer[6]=2;
		r_answer[7]=4;
		r_answer[8]=4;
		r_answer[9]=1;
		r_answer[10]=3;
		r_answer[11]=3;
		r_answer[12]=2;
		r_answer[13]=1;
		r_answer[14]=4;

		return r_answer[i];
	}


}
