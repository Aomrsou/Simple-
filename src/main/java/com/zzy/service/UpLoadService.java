package com.zzy.service;

import org.springframework.web.multipart.MultipartFile;

public interface UpLoadService {
    String upLoadImg(MultipartFile file);
}
