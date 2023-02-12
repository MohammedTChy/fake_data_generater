import java.util.Random;

public class Faker {

    private Random random;

    public Faker() {
        this.random = new Random();
    }

    public String letterify(String letterString) {
        StringBuilder sb = new StringBuilder();
        for (char c : letterString.toCharArray()) {
            if (c == '?') {
                sb.append((char)(random.nextInt(26) + 'a'));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String numerify(String numberString) {
        StringBuilder sb = new StringBuilder();
        for (char c : numberString.toCharArray()) {
            if (c == '#') {
                sb.append(random.nextInt(10));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String bothify(String string) {
        StringBuilder sb = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (c == '?') {
                sb.append((char)(random.nextInt(26) + 'a'));
            } else if (c == '#') {
                sb.append(random.nextInt(10));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
