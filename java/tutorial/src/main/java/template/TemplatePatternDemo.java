package template;

/**
 * https://www.tutorialspoint.com/design_pattern/template_pattern.htm
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        System.out.println("// ------------------------------ //");
        Game game = new Football();
        game.play();
        System.out.println("--------------------------------- //");

        System.out.println("// ------------------------------ //");
        game = new Cricket();
        game.play();
        System.out.println("--------------------------------- //");
    }
}
