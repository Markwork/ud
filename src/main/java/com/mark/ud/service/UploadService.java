package com.mark.ud.service;

import java.io.InputStream;
import java.io.Reader;

public interface UploadService{
    /**
     * 字节流上传
     */
    public void StreamByByte(InputStream inputStream,String codeType,String fileName,String fileUrl);

    /**
     * 字符流上传
     */
    public void StreamByChar(InputStream inputStream,String codeType,String fileName,String fileUrl);
    /**
     * 文件copy
     */
    /**
     * 无编码格式文件上传，如jpg等
     */
    public void StreamByByteNoCodeType(InputStream inputStream,String fileName,String fileUrl);
}
