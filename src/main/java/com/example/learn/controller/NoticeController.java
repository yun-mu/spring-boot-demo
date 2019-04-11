package com.example.learn.controller;

import com.example.learn.domain.Notice;
import com.example.learn.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/notice")
@RestController
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @GetMapping("")
    @ResponseBody
    public Notice getNotice() {
        Notice notice = new Notice();
        return notice;
    }

    @PutMapping("")
    public void updateNotice() {

    }

    @PostMapping("/list")
    public void createNotices() {

    }

    @GetMapping("/list")
    @ResponseBody
    public ArrayList<Notice> getNotices() {
        ArrayList<Notice> notices = new ArrayList<>();
        return notices;
    }


}
