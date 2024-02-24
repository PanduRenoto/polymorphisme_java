package notifikasi;

public class main {
    public static void main(String[] args) {
        String emailPenerima = "panduprwk05@gmail.com";
        String nomerHp = "+6282143408625";
        String mobileId = "android-192387";

        emailNotification emailNotif = new emailNotification();
        smsNotification smsNotif = new smsNotification();
        pushNotification pushNotif = new pushNotification();

        String message = "Halo namaku pandu";
        
        emailNotif.sendMessage(emailPenerima, message);
        smsNotif.sendMessage(nomerHp, message);
        pushNotif.sendMessage(mobileId, message);
    }
}
