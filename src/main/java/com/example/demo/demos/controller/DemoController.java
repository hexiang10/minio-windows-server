/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.demo.demos.controller;

import com.example.demo.demos.enums.FilePathType;
import com.example.demo.demos.result.Result;
import com.example.demo.demos.utils.MinIOUtil;
import com.example.demo.demos.utils.StringUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * Minio上传文件
 * @author hexiang
 */
@RestController
public class DemoController {

    /**
     * 上传文件
     * @param file 文件
     * @return com.example.demo.demos.common。Result
     * @throws Exception 异常信息
     */
    @PostMapping("/upload")
    public Result upload(MultipartFile file) throws Exception {
        // TODO 文件路径、文件夹名、文件名自定义设置处理
        String fileName = FilePathType.VIDEO.PATH+StringUtil.getCurrentTimeStr()+"_"+file.getOriginalFilename();
        // 通过文件流的方式上传文件，可自己开发其他上传方式
        MinIOUtil.uploadFile(fileName,file.getInputStream());
        // 获取文件上传成功的地址，如果获取其他文件信息，可自行封装对象
        String url =MinIOUtil.getFileUrl(fileName);
        // 返回信息给前端
        return Result.ok(url);
    }

}
