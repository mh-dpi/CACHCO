package com.example.cachco.service.impl

import com.example.cachco.entity.LearningModule
import com.example.cachco.entity.Webinar
import com.example.cachco.service.EducationService
import org.springframework.stereotype.Service


@Service
class EducationServiceImpl : EducationService {

    private val learningModule: MutableList<LearningModule> = ArrayList()
    private val webinars: MutableList<Webinar> = ArrayList()

    init {


        learningModule.add(
            LearningModule(
                1,
                "Understanding Corruption: Causes and Effects",
                "Learn about the root causes of corruption, its various forms, and how it impacts society, economy, and governance."
            )
        )

        learningModule.add(
            LearningModule(
                2,
                "Laws and Policies Against Corruption",
                "An overview of national and international anti-corruption laws, policies, and enforcement mechanisms, including case studies of successful implementation."
            )
        )

        learningModule.add(
            LearningModule(
                3,
                "How to Identify Corruption in Public Systems",
                "This module teaches techniques to identify and report corruption in government and public services, using real-world examples."
            )
        )

        learningModule.add(
            LearningModule(
                4,
                "Whistleblowing: Rights and Protections",
                "Understand the role of whistleblowers, their legal rights, and how to ensure personal safety when reporting corruption."
            )
        )

        learningModule.add(
            LearningModule(
                5,
                "The Role of Technology in Combating Corruption",
                "Explore how tools like blockchain, data analytics, and reporting apps can be used to enhance transparency and accountability."
            )
        )

        learningModule.add(
            LearningModule(
                6,
                "Community Engagement for Transparency",
                "Learn how to organize community efforts to advocate for transparency and accountability in governance."
            )
        )

        learningModule.add(
            LearningModule(
                7,
                "Ethical Leadership and Integrity",
                "This module focuses on cultivating ethical leadership and promoting integrity in personal and professional settings."
            )
        )

        learningModule.add(
            LearningModule(
                8,
                "Monitoring Public Budgets and Expenditures",
                "A practical guide on how citizens can monitor public budgets and track expenditures to prevent misuse of funds."
            )
        )

        learningModule.add(
            LearningModule(
                9,
                "Building a Corruption-Free Culture in Organizations",
                "Discover strategies to foster a culture of accountability and transparency within private and public organizations."
            )
        )

        learningModule.add(
            LearningModule(
                10,
                "Using Media and Social Networks to Fight Corruption",
                "Learn how to effectively use social media and traditional media to expose corruption and raise awareness."
            )
        )



        webinars.add(
            Webinar(
                1,
                "Fighting Corruption in Public Procurement",
                "Learn about strategies and tools to combat corruption in public procurement processes.",
                "2024-12-01",
                "Webinar",
                "https://zoom.us/webinar/123",
                90,
                "Jane Smith",
                "Transparency International"
            )
        )

        webinars.add(
            Webinar(
                2,
                "Whistleblower Protections: Rights and Risks",
                "Explore the legal frameworks and personal safety measures for whistleblowers reporting corruption.",
                "2024-12-10",
                "Webinar",
                "https://zoom.us/webinar/456",
                75,
                "Dr. Robert Clarke",
                "Global Integrity Foundation"
            )
        )

        webinars.add(
            Webinar(
                3,
                "Leveraging Technology for Transparency",
                "Discover how blockchain, AI, and open data can enhance accountability in governance.",
                "2024-12-15",
                "Webinar",
                "https://zoom.us/webinar/789",
                60,
                "Emily Johnson",
                "OpenGov Tech"
            )
        )

        webinars.add(
            Webinar(
                4,
                "Grassroots Advocacy: Mobilizing Communities Against Corruption",
                "Practical tips on organizing community efforts to tackle corruption at the local level.",
                "2024-12-20",
                "Webinar",
                "https://zoom.us/webinar/101",
                120,
                "Ahmed Ali",
                "Civic Action Network"
            )
        )

        webinars.add(
            Webinar(
                5,
                "Anti-Corruption in Education Systems",
                "Examine case studies of corruption in education and learn ways to ensure transparency in the sector.",
                "2024-12-25",
                "Webinar",
                "https://zoom.us/webinar/112",
                90,
                "Laura Green",
                "Education Integrity Initiative"
            )
        )

        webinars.add(
            Webinar(
                6,
                "Investigative Journalism and Corruption",
                "Learn how journalists uncover corruption and hold public officials accountable.",
                "2025-01-05",
                "Webinar",
                "https://zoom.us/webinar/131",
                90,
                "Michael Torres",
                "Investigative Journalists Network"
            )
        )

        webinars.add(
            Webinar(
                7,
                "Corporate Ethics and Anti-Bribery Policies",
                "Understand the role of corporate ethics and anti-bribery policies in creating a fair business environment.",
                "2025-01-10",
                "Webinar",
                "https://zoom.us/webinar/415",
                60,
                "Sarah Tanaka",
                "Corporate Accountability Alliance"
            )
        )

        webinars.add(
            Webinar(
                8,
                "Environmental Corruption: Challenges and Solutions",
                "Explore corruption in environmental projects and how to combat it through policies and activism.",
                "2025-01-15",
                "Webinar",
                "https://zoom.us/webinar/161",
                75,
                "Carlos Mendes",
                "Earth Integrity Network"
            )
        )

        webinars.add(
            Webinar(
                9,
                "Building a Culture of Transparency in Organizations",
                "Practical steps for creating an organizational culture that prioritizes transparency and accountability.",
                "2025-01-20",
                "Webinar",
                "https://zoom.us/webinar/191",
                60,
                "Priya Kapoor",
                "Ethics First Consultancy"
            )
        )

        webinars.add(
            Webinar(
                10,
                "Youth Engagement in Anti-Corruption Initiatives",
                "Discuss how young people can drive change and lead anti-corruption efforts in their communities.",
                "2025-01-25",
                "Webinar",
                "https://zoom.us/webinar/202",
                90,
                "Liam O'Connor",
                "Youth for Transparency"
            )
        )

    }


    override fun getAllModules(): List<LearningModule> {
        return learningModule.toList()
    }

    override fun getModuleById(id: Long): LearningModule? {
       return learningModule.find { it.id == id }
    }

    override fun getAllWebinars(): List<Webinar> {
        return webinars.toList()
    }

    override fun getWebinarById(id: Long): Webinar? {
        return webinars.find { it.id == id.toInt() }
    }

    override fun addWebinar(webinar: Webinar) {
        webinars.add(webinar)
    }
}