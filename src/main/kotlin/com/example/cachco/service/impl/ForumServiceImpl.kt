package com.example.cachco.service.impl

import com.example.cachco.entity.Post
import com.example.cachco.entity.Topic
import com.example.cachco.service.ForumService
import org.springframework.stereotype.Service


@Service
class ForumServiceImpl: ForumService {

    private val topics: MutableList<Topic> = ArrayList()
    private val posts: MutableList<Post> = ArrayList()

    init {
        topics.add(Topic(1,"Title 1","This is a Topic 1"))
        topics.add(Topic(2,"Title 1","This is a Topic 2"))
        topics.add(Topic(3,"Title 3","This is a Topic 3"))

        posts.add(Post(1,"1","This is a Post 1","mhr"))
        posts.add(Post(2,"1","This is a Post 2","mhr"))
        posts.add(Post(3,"2","This is a Post 3","mhr"))
    }

    override fun getAllTopics(): List<Topic> {
        return topics.toList()
    }

    override fun getTopicById(id: Long): Topic? {
        return topics.find { it.id == id }
    }

    override fun addPost(topicId: Long, content: String) {
        val postId=posts.last().id+1
        posts.add(Post(postId, topicId.toString(),content,"mahmudulHasan"))
    }

    override fun addTopic(content: String) {
        val topicId = topics.last().id+1
        topics.add(Topic(topicId, "Title $topicId", "This is a Topic $topicId"))
    }

    override fun getPostsByTopicId(id: Int): List<Post> {
        return posts.filter { it.topicId.toInt() == id }
    }
}