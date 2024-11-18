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


        topics.add(
            Topic(1, "Corruption in Government Procurement", "A deep dive into how corruption can infiltrate government procurement processes and ways to prevent it.")
        )

        topics.add(
            Topic(2, "Whistleblowing and Legal Protections", "Understanding the role of whistleblowers in exposing corruption and the legal protections available to them.")
        )

        topics.add(
            Topic(3, "The Role of Technology in Combating Corruption", "Exploring how technologies like blockchain and open data can be used to prevent corruption and increase transparency.")
        )


        posts.add(
            Post(1, "1", "Government procurement is one of the most vulnerable sectors to corruption, especially when there is a lack of transparency. Here's how we can combat this.", "mhr")
        )

        posts.add(
            Post(2, "1", "Whistleblowers are essential in fighting corruption, but they often face significant risks. Learn about the protections available for whistleblowers.", "mhr")
        )

        posts.add(
            Post(3, "2", "Technology is revolutionizing how we combat corruption. From AI to blockchain, these tools can be game-changers in the fight for transparency.", "mhr")
        )

        // Adding more topics
        topics.add(
            Topic(4, "Corporate Corruption and Ethical Practices", "Exploring the impact of corruption in the corporate world and how ethical business practices can curb it.")
        )

        topics.add(
            Topic(5, "Public Sector Corruption and Its Impact on Society", "Understanding how corruption in public sector institutions undermines societal trust and economic growth.")
        )

        topics.add(
            Topic(6, "Fighting Corruption with Data Transparency", "How making data accessible and transparent can reduce corruption and promote accountability in both government and private sectors.")
        )

        topics.add(
            Topic(7, "International Anti-Corruption Measures", "Explores international agreements and conventions aimed at preventing corruption and promoting global governance reforms.")
        )

        topics.add(
            Topic(8, "The Power of Media in Exposing Corruption", "The crucial role of media and investigative journalism in uncovering corruption and ensuring accountability.")
        )

        topics.add(
            Topic(9, "Community-Based Approaches to Combat Corruption", "Learn about grassroots efforts and community-driven initiatives to fight corruption and build trust in public institutions.")
        )

// Adding more posts
        posts.add(
            Post(4, "4", "Corruption within corporations can often lead to large-scale financial fraud and scandals. It's essential for businesses to adopt transparent and ethical practices.", "mhr")
        )

        posts.add(
            Post(5, "4", "Corruption in the public sector can result in poor service delivery and weakened institutions. Strengthening oversight mechanisms is critical for tackling this issue.", "mhr")
        )

        posts.add(
            Post(6, "5", "Transparency in data can expose hidden corruption, especially in government spending. When citizens have access to accurate data, it holds officials accountable.", "mhr")
        )

        posts.add(
            Post(7, "6", "International measures like the UN Convention Against Corruption are essential for fostering global cooperation in tackling corruption and ensuring fair governance worldwide.", "mhr")
        )

        posts.add(
            Post(8, "7", "Media outlets have a crucial role in holding power to account. Investigative journalists are often the first to uncover major corruption scandals.", "mhr")
        )

        posts.add(
            Post(9, "8", "Community efforts, like local anti-corruption campaigns and transparency initiatives, can play a major role in changing public attitudes and increasing accountability.", "mhr")
        )

        posts.add(
            Post(10, "9", "The media has the power to expose corruption and bring it to the public's attention. It is vital for media outlets to operate with integrity and independence.", "mhr")
        )


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