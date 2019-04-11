package com.example.learn.service;

import com.example.learn.dao.GroupMapper;
import com.example.learn.domain.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GroupService {
    @Autowired
    private GroupMapper groupMapper;

    public Group getGroup(String groupId) {
        return groupMapper.selectByPrimaryKey(groupId);
    }
}
