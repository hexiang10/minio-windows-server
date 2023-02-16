package com.example.demo.demos.enums;

/**
 * 文件类型 枚举
 */
public enum FilePathType {
    VIDEO(1, "video/"),
    FACE(2, "image/");

    public final Integer TYPE;
    public final String PATH;

    FilePathType(Integer type, String path) {
        this.TYPE = type;
        this.PATH = path;
    }
}
