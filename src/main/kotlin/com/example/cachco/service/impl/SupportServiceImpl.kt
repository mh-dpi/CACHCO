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
        faqs.add(Faq(1, "What is Your Name 1?","My Name Is Hasan 1"))
        faqs.add(Faq(2, "What is Your Name 2?","My Name Is Hasan 2"))
        faqs.add(Faq(3, "What is Your Name 3?","My Name Is Hasan 3"))


        feedbacks.add(Feedback(1,"Best Service"))
        feedbacks.add(Feedback(2,"Good Service"))
        feedbacks.add(Feedback(3,"West Service"))
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