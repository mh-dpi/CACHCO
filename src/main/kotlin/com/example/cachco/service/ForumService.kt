package com.example.cachco.service

import com.example.cachco.entity.Post
import com.example.cachco.entity.Topic

interface ForumService {
    fun getAllTopics():List<Topic>
    fun getTopicById(id:Long):Topic?

    fun addPost(topicId:Long,content:String)
    fun addTopic(content:String)
    fun getPostsByTopicId(id: Int): List<Post>
}