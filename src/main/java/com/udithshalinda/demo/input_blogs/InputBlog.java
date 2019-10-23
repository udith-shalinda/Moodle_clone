package com.udithshalinda.demo.input_blogs;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.List;

public class InputBlog {
    @Id
    public ObjectId id;

    public String testId;
    public String header;
    public String blog;
    public String createrId;
    public String coverImageId;
    public List<String> upVoters;
    public List<String> downVoters;


    public InputBlog(String header,String blog,String createrId,String coverImageId) {
        this.header = header;
        this.blog = blog;
        this.createrId= createrId;
        this.coverImageId = coverImageId;
    }
    public void setId(ObjectId id){
        this.id = id;
    }

    public void addUpVoters(String userId){
        this.upVoters.add(userId);
    }
    public void addDownVoters(String userId){
        this.downVoters.add(userId);
    }
}
