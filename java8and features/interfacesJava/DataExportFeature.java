interface Exporter {
    void export();
    default void exportToJSON() {
        System.out.println("Exported to JSON (default)");
    }
}

class CSVExporter implements Exporter {
    public void export() { System.out.println("Exported to CSV"); }
}

public class DataExportFeature {
    public static void main(String[] args) {
        Exporter csv = new CSVExporter();
        csv.export();
        csv.exportToJSON();
    }
}