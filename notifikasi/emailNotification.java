package notifikasi;

public class emailNotification implements interfaceNotifikasi {
    @Override
    public void sendMessage(String receiver, String content) {
        System.out.println("Mengirim email ke " + receiver + " dengan isi:");
        System.out.println(content);
    }
}
