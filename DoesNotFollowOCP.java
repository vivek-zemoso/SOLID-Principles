import java.util.Scanner;

class Verification {
    private String sendingMode;

    public Verification(String sendingMode) {
        this.sendingMode = sendingMode;
    }

    public String sendMessage(String message) {
        String sentMessage = "";
        switch (this.sendingMode) {
            case "textMessage": {
                // logic for sending message via otp
                sentMessage = message;
            }
                break;

            case "email": {
                // logic for sending message via email
                sentMessage = message;
            }
                break;

            default: {
                sentMessage = "Invalid Sending Mode !! Aborting !!";
            }
        }
        return sentMessage;
    }
}

public class DoesNotFollowOCP {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String sendingMode = s.nextLine();
        Verification verify = new Verification(sendingMode);
        String message = s.nextLine();
        String sentMessage = verify.sendMessage(message);
        System.out.println(sentMessage);
        s.close();

    }
}
