import java.util.Scanner;

interface CommunicationOperations {
    public String sendMessage(String message);
}

class SendViaOTP implements CommunicationOperations {

    private String sentMessage;

    @Override
    public String sendMessage(String message) {

        // logic for sending message via otp
        this.sentMessage = message;
        return sentMessage;
    }

}

class SendViaVoiceCall implements CommunicationOperations {

    private String sentMessage;

    @Override
    public String sendMessage(String message) {

        // logic for sending message via voice call
        this.sentMessage = message;
        return sentMessage;
    }

}

class SendViaEmail implements CommunicationOperations {

    private String sentMessage;

    @Override
    public String sendMessage(String message) {

        // logic for sending message via email
        this.sentMessage = message;
        return sentMessage;
    }

}

class SendViaWhatsApp implements CommunicationOperations {

    private String sentMessage;

    @Override
    public String sendMessage(String message) {

        // logic for sending message via whatsApp
        this.sentMessage = message;
        return sentMessage;
    }

}

class Verification {
    Scanner s = new Scanner(System.in);

    public String sendMessage(CommunicationOperations commOps) {
        if (commOps == null) {
            return "error";
        }
        String message = s.nextLine();
        return commOps.sendMessage(message);
    }

}

public class FollowsOCP {
    public static void main(String[] args) {
        Verification verify = new Verification();
        String sentViaOTP = verify.sendMessage(new SendViaOTP());
        System.out.println(sentViaOTP);

        String sentViaEmail = verify.sendMessage(new SendViaEmail());
        System.out.println(sentViaEmail);

        String sentViaVoiceCall = verify.sendMessage(new SendViaVoiceCall());
        System.out.println(sentViaVoiceCall);

        String sentViaWhatsApp = verify.sendMessage(new SendViaWhatsApp());
        System.out.println(sentViaWhatsApp);
    }
}
