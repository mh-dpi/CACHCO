package com.example.cachco.service

import com.example.cachco.entity.Faq
import com.example.cachco.entity.Feedback

interface SupportService {
  fun  getAllFaqs():List<Faq>
  fun addFaq(faq: Faq)
  fun addFeedback(feedback: Feedback)
  fun getAllFeedback():List<Feedback>
}