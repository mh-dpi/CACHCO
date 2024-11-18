package com.example.cachco.service.impl

import com.example.cachco.entity.Faq
import com.example.cachco.entity.Feedback
import com.example.cachco.service.SupportService
import org.springframework.stereotype.Service


@Service
class SupportServiceImpl : SupportService {

    private val faqs: MutableList<Faq> = ArrayList()
    private val feedbacks: MutableList<Feedback> = ArrayList()

    init {


        faqs.add(
            Faq(
                1,
                "What is corruption?",
                "Corruption is the abuse of entrusted power for private gain. It can involve bribery, embezzlement, favoritism, and other unethical practices."
            )
        )

        faqs.add(
            Faq(
                2,
                "How can I report corruption?",
                "You can report corruption by contacting local anti-corruption agencies, whistleblowing hotlines, or using online platforms dedicated to exposing corrupt practices."
            )
        )

        faqs.add(
            Faq(
                3,
                "What are the consequences of corruption?",
                "Corruption undermines trust in institutions, distorts markets, hinders economic development, and exacerbates social inequalities."
            )
        )

        faqs.add(
            Faq(
                4,
                "What is the role of whistleblowers in fighting corruption?",
                "Whistleblowers play a crucial role in exposing corrupt activities by reporting them to authorities or the public, often at great personal risk."
            )
        )

        faqs.add(
            Faq(
                5,
                "How can technology help combat corruption?",
                "Technology can increase transparency through digital record-keeping, blockchain for secure transactions, and AI for detecting irregularities in data."
            )
        )

        faqs.add(
            Faq(
                6,
                "What are the key international anti-corruption agreements?",
                "The United Nations Convention Against Corruption (UNCAC) and the OECD Anti-Bribery Convention are major frameworks aimed at addressing corruption globally."
            )
        )

        faqs.add(
            Faq(
                7,
                "How can individuals contribute to anti-corruption efforts?",
                "Individuals can raise awareness, report corruption, support ethical businesses, and hold public officials accountable through advocacy and participation."
            )
        )

        faqs.add(
            Faq(
                8,
                "What is the difference between bribery and extortion?",
                "Bribery involves offering or receiving something of value to influence a decision, while extortion involves forcing someone to give something of value through threats."
            )
        )

        faqs.add(
            Faq(
                9,
                "How does corruption affect developing countries?",
                "In developing countries, corruption diverts resources away from essential services like healthcare and education, perpetuating poverty and inequality."
            )
        )

        faqs.add(
            Faq(
                10,
                "What can businesses do to prevent corruption?",
                "Businesses can implement robust compliance programs, enforce anti-bribery policies, and foster a culture of transparency and accountability."
            )
        )


        feedbacks.add(
            Feedback(
                1,
                "The platform is very user-friendly and informative. I found the resources on whistleblower protections extremely helpful."
            )
        )

        feedbacks.add(
            Feedback(
                2,
                "Great initiative! The webinars and learning modules are insightful and well-organized. Keep up the good work!"
            )
        )

        feedbacks.add(
            Feedback(
                3,
                "I appreciate the transparency and quick response from the support team when I reported an issue. Excellent service!"
            )
        )

        feedbacks.add(
            Feedback(
                4,
                "The case studies were eye-opening. It's good to see real-world examples of how corruption is tackled globally."
            )
        )

        feedbacks.add(
            Feedback(
                5,
                "The community discussion section could use more moderation to keep the conversations constructive, but overall, a great resource."
            )
        )

        feedbacks.add(
            Feedback(
                6,
                "The resources provided on combating corruption at the grassroots level were exactly what I needed. Thank you!"
            )
        )

        feedbacks.add(
            Feedback(
                7,
                "The anti-corruption hotline details were easy to find and very useful. Keep expanding the platform!"
            )
        )

        feedbacks.add(
            Feedback(
                8,
                "While the platform is excellent, adding more regional-specific content would make it even better."
            )
        )

        feedbacks.add(
            Feedback(
                9,
                "The use of technology to detect and expose corruption was fascinating to learn about. A very innovative approach!"
            )
        )

        feedbacks.add(
            Feedback(
                10,
                "I enjoyed the interactive quizzes in the learning modules. They made the content engaging and helped reinforce key concepts."
            )
        )
    }

    override fun getAllFaqs(): List<Faq> {
        return faqs.toList()
    }

    override fun addFaq(faq: Faq) {
       val faqId = faqs.size + 1L
        faqs.add(faq.copy(id = faqId))
    }

    override fun addFeedback(feedback: Feedback) {
        val feedbackId = feedbacks.size + 1L
        feedbacks.add(feedback.copy(id = feedbackId))
    }

    override fun getAllFeedback(): List<Feedback> {
        return feedbacks.toList()
    }
}