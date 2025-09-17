import java.io.Serializable;

class BackupData implements Serializable {
    String data = "Backup info";
}

public class DataSerializationBackup {
    public static void main(String[] args) {
        BackupData obj = new BackupData();
        System.out.println("Object ready for backup: " + obj.data);
    }
}