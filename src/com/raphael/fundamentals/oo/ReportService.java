package com.raphael.fundamentals.oo;

interface ExportFormat { void export(String data); }

class PdfExport implements ExportFormat {
    public void export(String data) { System.out.println("PDF: " + data); }
}

public class ReportService {
    private final ExportFormat format;

    public ReportService(ExportFormat format) {
        this.format = format;
    }

    public void generate(String content) {
        format.export(content);
    }
}
