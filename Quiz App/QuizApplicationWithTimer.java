import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class QuizQuestion {
    private String question;
    private List<String> options;
    private int correctAnswer;

    public QuizQuestion(String question, List<String> options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getOptions() {
        return options;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}

class QuizApplicationWithTimer {
    private List<QuizQuestion> quizQuestions;
    private int currentQuestionIndex;
    private int score;

    public QuizApplicationWithTimer() {
        quizQuestions = new ArrayList<>();
        currentQuestionIndex = 0;
        score = 0;
        List<String> options1 = new ArrayList<>();
        options1.add("A. Option A");
        options1.add("B. Option B");
        options1.add("C. Option C");
        options1.add("D. Option D");
        
        quizQuestions.add(new QuizQuestion("What is the capital of South Africa?", Arrays.asList("A. Johannesburg", "B. Pretoria", "C. Durban", "D. Port Elizabeth"), 2));
        quizQuestions.add(new QuizQuestion("How many continents are on Earth?", Arrays.asList("A. Ten", "B. Seven", "C. Eleven", "D. Eight"), 2));
        quizQuestions.add(new QuizQuestion("Which ocean is south of Asia?", Arrays.asList("A. Pacific", "B. Atlantic", "C. Indian", "D. Arctic"), 3));
        quizQuestions.add(new QuizQuestion("What is the world's most popular social media platform?", Arrays.asList("A. Instagram", "B. Facebook", "C. Tik Tok", "D. Twitter"), 2));
        quizQuestions.add(new QuizQuestion("What is the world's most popular programming language?", Arrays.asList("A. Python", "B. SQL", "C. JavaScript", "D. HTML/CSS"), 3));
        // questions
    }

    public void startQuiz() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Time's up!");
                currentQuestionIndex++;
                showNextQuestion();
            }
        }, 10000); //miliseconds

        showNextQuestion();
    }

    private void showNextQuestion() {
        if (currentQuestionIndex < quizQuestions.size()) {
            QuizQuestion question = quizQuestions.get(currentQuestionIndex);
            System.out.println(question.getQuestion());
            for (String option : question.getOptions()) {
                System.out.println(option);
            }

            Scanner scanner = new Scanner(System.in);
            int userAnswer = scanner.nextInt();

            if (userAnswer == question.getCorrectAnswer()) {
                score++;
                System.out.println("Correct answer!");
                currentQuestionIndex++;
                showNextQuestion();

            } else {
                System.out.println("Incorrect answer!");
                currentQuestionIndex++;
                showNextQuestion();
            }

            currentQuestionIndex++;
            scanner.close();
            
        } else {
            endQuiz();
        }
    }

    private void endQuiz() {
        System.out.println("Quiz finished!");
        System.out.println("Your score: " + score + "/" + quizQuestions.size());
    }
}