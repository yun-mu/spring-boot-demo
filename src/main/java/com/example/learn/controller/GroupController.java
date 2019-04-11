package com.example.learn.controller;

import com.example.learn.domain.Group;
import com.example.learn.service.GroupService;
import com.example.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping("/group")
@RestController
public class GroupController {
    @Autowired
    private GroupService groupService;
    @Autowired
    private UserService userService;

    @PostMapping
    public void createGroup() {

    }

    @GetMapping
    @ResponseBody
    public Group getGroup(String groupId) {
        return groupService.getGroup(groupId);
    }

    @GetMapping("/list")
    @ResponseBody
    public ArrayList<Group> getGroups() {
        ArrayList<Group> groups = new ArrayList<>();
        return groups;
    }

    @PostMapping("/action/join")
    public void joinGroup() {

    }

    @PostMapping("/action/leave")
    public void leaveGroup() {

    }
}
