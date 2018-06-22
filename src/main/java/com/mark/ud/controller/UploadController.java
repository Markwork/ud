package com.mark.ud.controller;

import com.mark.ud.service.UploadService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.InputStream;
/**
 * @Desc: 上传文件controller
 * @author lcy
 * @date 2018/6/22 16:18
 * @version V1.0
*/

@RestController
@RequestMapping("/upload")
public class UploadController {
    @Resource
    private UploadService uploadService;

    /**
     * 需要编码格式的上传
     * @param codeType
     * @param fileName
     * @param fileUrl
     * @param multipartFile
     */
    @ApiOperation(value="upload", notes="upload")
    @RequestMapping(value = "upload",method= RequestMethod.POST)
    public void upload(String codeType, String fileName, String fileUrl, MultipartFile multipartFile){
        try {
            InputStream inputStream = multipartFile.getInputStream();
            uploadService.StreamByChar(inputStream,codeType,fileName,fileUrl);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * 不需要编码格式的上传
     * @param fileName
     * @param fileUrl
     * @param multipartFile
     */
    @ApiOperation(value="uploadnocode", notes="uploadnocode")
    @RequestMapping(value = "uploadnocode",method= RequestMethod.POST)
    public void uploadnocode(String fileName, String fileUrl, MultipartFile multipartFile){
        try {
            InputStream inputStream = multipartFile.getInputStream();
            uploadService.StreamByByteNoCodeType(inputStream,fileName,fileUrl);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
