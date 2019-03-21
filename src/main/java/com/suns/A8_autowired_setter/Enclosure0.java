package com.suns.A8_autowired_setter;


public class Enclosure0 {
    private String filename;
    private String content;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Enclosure0{" +
                "filename='" + filename + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
