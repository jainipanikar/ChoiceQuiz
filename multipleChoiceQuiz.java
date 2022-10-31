import java.util. *;

public class multipleChoiceQuiz {
	private ArrayList<Question> questionSet;
	public multipleChoiceQuiz() {
		
		questionSet = new ArrayList<Question>();
		String q = " What is name of the tallest mountain on earth?";
		String[] a = {"Mount Everest", "Denali", "Aconcagua"};
		questionSet.add(new Question(q, a, "Mount Everest"));
		q = "How many months have 31 days?";
		a = new String[] {"8", "7", "9"};
		questionSet.add(new Question(q, a, " 7"));
		q = "Which is faster light or sound?";
		a = new String[] { "light", "Sound"};
		questionSet.add(new Question(q,a," Light"));		
		q = "How many colors of rainbow are there?";
		a = new String[] { " 10", "9", "7"};
		questionSet.add(new Question(q,a, "7"));
		q = "What company was originally called Cadabra?";
		a = new String[] { "Amazon", "Carmax", "Zoom"};
		questionSet.add(new Question(q,a,"Amazon"));
		q = "Which planet in Milky Way is the hottest?";
		a = new String[] { "Venus", "Mars", "Mercury"};
		questionSet.add(new Question(q,a, "Venus"));
		q= "What planet has most moons";
		a = new String[] { "Jupiter", "Saturn", "Uranus"};
		questionSet.add(new Question(q,a,"Saturn"));
		q = "How many bones do we have in an ear?";
		a = new String[] { "2", "3", "1",};
		questionSet.add( new Question(q,a, "3"));
		q = "How many Continents are there?";
		a = new String[] { "6", "8", "7"};
		questionSet.add( new Question (q,a,"7"));
		q = "What is the name of a shape with 5 sides?";
		a = new String[] { "Pentagon", "Octagon", "Heptagon"};
		questionSet.add(new Question (q,a, "Pentagon"));
		
		
		Collections.shuffle(questionSet, new Random());;
		
		System.out.println( "Welcome to multiple choice Quiz, you have 10 questions, select index number 1-3 not the answers");
		
		
		}
	
	
		public void start() {
			Scanner scan = new Scanner(System.in);
					int numCorrect = 0;
					for (int question =0; question< questionSet.size(); question++) { 
				System.out.println(questionSet.get(question).getQuestion());
				int numChoices = questionSet.get(question).getChoices().size();
				for (int choice = 0; choice <numChoices; choice++) {
					System.out.println((choice +1) +":" +
								questionSet.get(question).getChoices().get(choice));
					
				}
				int playerAnswer = scan.nextInt();
				ArrayList<String> choiceSet = 
						questionSet.get(question).getChoices();
				String correctAnswer = questionSet.get(question).getAnswer();
				int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
	
				if(playerAnswer == correctAnswerIndex +1) {
					numCorrect++;
					
				}
			}
			scan.close();
			System.out.println("you got" + numCorrect + "correct answer(s)");
			
			
		}
		
	}

	


