package Office;

public class FillInQuestion extends Question {

    public FillInQuestion(String text) {
        super(text);
    }

    @Override
    public void display() {
        String formattedText = getText().replaceAll("_([^_]*)_", "_____");
        System.out.println(formattedText);
    }

    @Override
    public boolean checkAnswer(String response) {
        String[] parts = getText().split("_");
        if (parts.length < 3) {
            return false;
        }
        String answer = parts[1].trim();
        return response.equalsIgnoreCase(answer);
    }
}

