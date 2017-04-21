package com.llhao.baobao.web.controller;

import com.llhao.baobao.entity.Diary;
import com.llhao.baobao.service.DiaryService;
import com.llhao.baobao.web.vo.DiaryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

import java.io.DataInput;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by HAO zong on 2017-4-16.
 */
@Controller
public class DateController {
    @Autowired
    private DiaryService diaryService;

    @RequestMapping("/diary")
    public @ResponseBody DiaryVo diary(){
        List<Diary> diaries = diaryService.allDiary();
        DiaryVo diaryVo = new DiaryVo();
        diaryVo.setDiaries(diaries);
        return  diaryVo;
    }
}
