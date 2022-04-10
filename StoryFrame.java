public class StoryFrame {
    private String image; 
    private String text;
    private String question;
    private String[] answers = new String[4];
    private int previousID;
    private int[] nextID = new int[4];
    private String[] characters = new String[3];
    private int numAnswers;
    private int numCharacters;
    private int choice; 



    public StoryFrame(String image, String text, String question, String[] answers, int previousID, int[] nextID, String[] characters, int numAnswers, int numCharacters) {
        this.image = image;
        this.text = text;
        this.question = question;
        this.answers = answers;
        this.previousID = previousID;
        this.nextID = nextID;
        this.characters = characters;
        this.numAnswers = numAnswers;
        this.numCharacters = numCharacters;

    }

    // create getters

    public String getImage() {
        return image;
    };
    public String getText() {
        return text;
    };
    public String getQuestion() {
        return question;
    };
    public String[] getAnswers () {
        return answers;
    };
    public int getPreviousID() {
        return previousID;
    };
    public int[] getNextID() {
        return nextID;
        //use function here to figure out nextID
    };
    public String[] getCharacters() {
        return characters;
    };
    public int getNumAnswers() {
        return numAnswers;
    };
    public int getNumCharacters() {
        return numCharacters;
    }


    // create setters
    public void setImage(String image) {
        this.image = image;
    };
    public void setText(String text) {
        this.text = text;
    }
    public void setQuestion(String question) {
        this.question = question;
    };
    public void setAnswers(String[] answers) {
        this.answers = answers;
    };
    public void setPreviousID(int previousID) {
        this.previousID = previousID;
    };
    public void setNextID(int[] nextID) {
        this.nextID = nextID;
    };
    public void setCharacters(String[] characters) {
        this.characters = characters;
    };
    public void setNumAnswers(int numAnswers) {
        this.numAnswers = numAnswers;
    };
    public void getNumCharacters(int numCharacters) {
        this.numCharacters = numCharacters;
    }




}

