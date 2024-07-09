package template;

public class Main {
    public static void main(String[] args) {
        TemplatePattern templatePattern = new FootBall();
        TemplatePattern game = new BasketBall();
        templatePattern.play();
        game.play();
    }
}
