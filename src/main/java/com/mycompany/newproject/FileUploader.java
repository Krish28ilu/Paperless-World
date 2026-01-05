/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.newproject;

/**
 *
 * @author krish
 */

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.PutObjectRequest;
import java.io.File;
import java.util.UUID;

public class FileUploader {
    
     String accessKey = "CONFIDENTIAL KEY";
       String secretKey = "CONFIDENTIAL KEY";
       String bucketName = "ARCHIVE";
        Regions clientRegion = Regions.AP_SOUTH_1;
       


     String uploadFile(File file) throws Exception{
        
   
            BasicAWSCredentials awsCreds = new BasicAWSCredentials(accessKey, secretKey);

            AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                    .withRegion(clientRegion)
                    .withCredentials(new AWSStaticCredentialsProvider(awsCreds))
                    .build();
            
            String fileKey = UUID.randomUUID().toString();

            PutObjectRequest request = new PutObjectRequest(bucketName, fileKey, file);
           
            s3Client.putObject(request);

            System.out.println(" File uploaded successfully to S3!");
            
        
        
        return "https://ARCHIVE.s3.ap-south-1.amazonaws.com/"+fileKey;
    }
}
