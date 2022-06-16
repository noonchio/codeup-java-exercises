public class ServerNameGenerator {

    private String[] adjectives = {"brave", "busy", "brainy", "blushing", "manic", "dark", "bright", "tasty", "careful", "calm"};
    private String[] nouns = {"ice", "Insect", "", "Branch", "Orc", "Airport", "Flag", "Afternoon", "Dog", "Finland"};

    public String[] getAdjectives() {
        return adjectives;
    }

    public void setAdjectives(String[] adjectives) {
        this.adjectives = adjectives;
    }

    public String[] getNouns() {
        return nouns;
    }

    public void setNouns(String[] nouns) {
        this.nouns = nouns;
    }

    private static String getStringInArray(String[] arrayOfStrings){
        return arrayOfStrings[(int) Math.ceil(Math.random() * arrayOfStrings.length-1)];
    }

    public static void main(String[] args) {
        ServerNameGenerator serverNameGenerator = new ServerNameGenerator();
        System.out.println("Here is your server name:");
        String noun = getStringInArray(serverNameGenerator.getNouns());
        String adjective = getStringInArray(serverNameGenerator.getAdjectives());
        System.out.printf("%s-%s%n", adjective, noun);
    }
}
