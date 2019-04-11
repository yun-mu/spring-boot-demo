package com.example.learn.domain;

public class Notice {
    private String id;

    private Byte status;

    private Byte type;

    private String creatorId;

    private String groupId;

    private String title;

    private Object imgs;

    private String note;

    private Integer createTime;

    private Integer noticeTime;

    private Byte hasFile;

    private Object files;

    private Object watchUsers;

    private Integer watchNum;

    private Object likeUsers;

    private Integer likeNum;

    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId == null ? null : creatorId.trim();
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Object getImgs() {
        return imgs;
    }

    public void setImgs(Object imgs) {
        this.imgs = imgs;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getNoticeTime() {
        return noticeTime;
    }

    public void setNoticeTime(Integer noticeTime) {
        this.noticeTime = noticeTime;
    }

    public Byte getHasFile() {
        return hasFile;
    }

    public void setHasFile(Byte hasFile) {
        this.hasFile = hasFile;
    }

    public Object getFiles() {
        return files;
    }

    public void setFiles(Object files) {
        this.files = files;
    }

    public Object getWatchUsers() {
        return watchUsers;
    }

    public void setWatchUsers(Object watchUsers) {
        this.watchUsers = watchUsers;
    }

    public Integer getWatchNum() {
        return watchNum;
    }

    public void setWatchNum(Integer watchNum) {
        this.watchNum = watchNum;
    }

    public Object getLikeUsers() {
        return likeUsers;
    }

    public void setLikeUsers(Object likeUsers) {
        this.likeUsers = likeUsers;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}