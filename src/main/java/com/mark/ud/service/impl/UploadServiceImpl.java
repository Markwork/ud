package com.mark.ud.service.impl;

import com.mark.ud.service.UploadService;
import com.mark.ud.util.ByteUtil;
import com.mark.ud.util.CharUtil;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.io.Reader;
/**
 * @Desc: 文件上传实现类
 * @author lcy
 * @date 2018/6/22 11:22
 * @version V1.0
*/

@Service
public class UploadServiceImpl implements UploadService{
    @Override
    public void StreamByByte(InputStream inputStream, String codeType, String fileName, String fileUrl) {

    }

    @Override
    public void StreamByChar(InputStream inputStream, String codeType, String fileName, String fileUrl) {
        CharUtil.Read(inputStream,codeType,fileName,fileUrl);
    }

    @Override
    public void StreamByByteNoCodeType(InputStream inputStream, String fileName, String fileUrl) {
        ByteUtil.InputNoCodeType(inputStream,fileName,fileUrl);
    }
}
