package solidprinciples.openclosed;

/*
 * Open - Closed Principle
 * It states that the design and writing of the code should be done in a way that new functionality should be added with minimum changes in the existing code.
 * Software entities should be open for extension, but closed for modification.
 * 
 * Here in this example if we want to add new section like Reasoning Questions. We can directly create a class and implements the execute method inside that class.
 */
public class OpenClosedPrinciple {

    public static void main(String[] args) {
        InterviewQuestions interviewQuestions = new InterviewQuestions();
        interviewQuestions.test(new DIQuestions());
        interviewQuestions.test(new VerbalQuestions());
        interviewQuestions.test(new QuantQuestions());
    }
    
}
