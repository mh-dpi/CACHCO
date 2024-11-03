package com.example.cachco.controller

import com.example.cachco.entity.Post
import com.example.cachco.service.ForumService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class ForumController {
    @Autowired
    private val forumService: ForumService? = null

    @GetMapping("/forums")
    fun forums(model: Model): String {
        val topics = forumService!!.getAllTopics()
        model.addAttribute("topics", topics)
        return "forums"
    }

    @GetMapping("/forums/{id}")
    fun topicDetails(@PathVariable id: Int, model: Model): String {
        val topic = forumService!!.getTopicById(id.toLong())
        val posts: List<Post> = forumService.getPostsByTopicId(id)
        model.addAttribute("topic", topic)
        model.addAttribute("posts", posts)
        return "topic-details"
    }

    @PostMapping("/forums/{id}/add-post")
    fun addPost(@PathVariable id: Int, @RequestParam content: String): String {
        forumService!!.addPost(id.toLong(), content)
        return "redirect:/forums/{id}"
    }
}
