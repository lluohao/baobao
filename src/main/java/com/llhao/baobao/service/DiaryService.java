package com.llhao.baobao.service;

import com.llhao.baobao.entity.Diary;
import com.llhao.baobao.util.StreamUtil;
import org.springframework.stereotype.Service;
import redis.clients.jedis.Jedis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by HAO zong on 2017-4-16.
 */
@Service
public class DiaryService {
    public List<Diary> allDiary(){
       File root = new File("C:/data");
       File[] files = root.listFiles();
       List<Diary> diaries = new ArrayList<Diary>();
       for (File file : files) {
           try {
               Diary diary = new Diary();
               SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
               String title = file.getName().split("_")[1].replace(".txt","");
               diary.setTitle(title);
               diary.setContent(StreamUtil.readAll(new FileInputStream(file),"UTF-8"));
               Date date = sdf.parse(title);
               diary.setTitle(title);
               diary.setId(date.getTime());
               diaries.add(diary);
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
       return diaries;
    }


    public void addDiary(String title,String content){
        try {
            File file  = new File("C:/data/diary_"+title+".txt");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(content);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addDiary(String content){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
            String str = sdf.format(new Date());
            addDiary(str,content);
        } catch (Exception e) {
            System.out.println("parse failure");
        }
    }
    public static void main(String[] args){
        new DiaryService().addDiary("ÄãºÃ°¡£¡");
        List<Diary> diaries = new DiaryService().allDiary();
        for (Diary diary : diaries) {
            System.out.println(diary.getContent());
        }
    }
}
