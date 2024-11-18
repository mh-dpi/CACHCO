package com.example.cachco.service.impl

import com.example.cachco.entity.AdvocacyAlert
import com.example.cachco.entity.VolunteerOpportunity
import com.example.cachco.service.AdvocacyService
import org.springframework.stereotype.Service


@Service
class AdvocacyServiceImpl:AdvocacyService {
    private val alerts: MutableList<AdvocacyAlert> = ArrayList()
    private val opportunities: MutableList<VolunteerOpportunity> = ArrayList()


    init {


        alerts.add(
            AdvocacyAlert(
                1,
                "Bribery Incident Reported in Local Office",
                "A whistleblower has reported a case of bribery at the City Council's Permit Office. Investigations are underway, and the community is urged to report any further irregularities anonymously through our platform."
            )
        )

        alerts.add(
            AdvocacyAlert(
                2,
                "Misuse of Public Funds in Road Construction Project",
                "Auditors have identified potential misuse of public funds in the ongoing Main Street road construction. Citizens are encouraged to review the expenditure details published on the municipal website."
            )
        )

        alerts.add(
            AdvocacyAlert(
                3,
                "Fraudulent Scholarship Scheme Alert",
                "Students and parents are warned about a fraudulent scholarship program claiming to be government-backed. Always verify such schemes with official education authorities."
            )
        )

        alerts.add(
            AdvocacyAlert(
                4,
                "Illegal Land Grabbing Activity Noted",
                "Reports suggest illegal land-grabbing activities in the Green Valley area. Residents are advised to stay vigilant and report any unauthorized construction or eviction notices."
            )
        )

        alerts.add(
            AdvocacyAlert(
                5,
                "Anonymous Tip Leads to Corruption Arrest",
                "Thanks to an anonymous tip, law enforcement has arrested a senior official involved in embezzling community development funds. This highlights the power of collective vigilance against corruption."
            )
        )
        alerts.add(
            AdvocacyAlert(
                6,
                "Unethical Hiring Practices Exposed",
                "A local government department has been accused of nepotism in recent hiring processes. Authorities are investigating irregularities in the recruitment of junior officers."
            )
        )

        alerts.add(
            AdvocacyAlert(
                7,
                "Public Procurement Fraud in Healthcare",
                "Evidence has surfaced of inflated procurement costs for hospital equipment. Citizens can review and track the procurement records online to ensure transparency."
            )
        )

        alerts.add(
            AdvocacyAlert(
                8,
                "Fake Charity Organizations Soliciting Donations",
                "Be cautious of charity groups claiming to collect funds for disaster relief. Verify the legitimacy of such organizations before contributing."
            )
        )

        alerts.add(
            AdvocacyAlert(
                9,
                "Conflict of Interest in Awarded Contracts",
                "A recent review found that multiple public contracts were awarded to firms owned by relatives of senior officials. Legal proceedings are being initiated."
            )
        )

        alerts.add(
            AdvocacyAlert(
                10,
                "Mismanagement of School Development Funds",
                "Parents and teachers have reported missing funds meant for upgrading local schools. A special audit has been ordered, and reports will be shared with the community."
            )
        )

        alerts.add(
            AdvocacyAlert(
                11,
                "Community Vigilance Leads to Illegal Mining Shutdown",
                "Thanks to local residents' reports, an illegal mining operation threatening the environment has been halted. Continue to report suspicious activities."
            )
        )

        alerts.add(
            AdvocacyAlert(
                12,
                "Unauthorized Use of Emergency Relief Supplies",
                "Displaced families have reported receiving inadequate supplies due to alleged diversion of relief items by local authorities. Investigations are ongoing."
            )
        )

        alerts.add(
            AdvocacyAlert(
                13,
                "Tax Evasion Scheme Uncovered",
                "Authorities have discovered a major tax evasion scheme involving high-profile individuals. Citizens are reminded to report any suspicious business practices."
            )
        )

        alerts.add(
            AdvocacyAlert(
                14,
                "Corruption in Public Transportation Services",
                "Commuters have complained about increased fares and poor maintenance of buses due to alleged corruption in the transport department."
            )
        )

        alerts.add(
            AdvocacyAlert(
                15,
                "Community Action Results in Greater Transparency",
                "Thanks to community efforts, the local government has implemented an open data policy for all public projects. Citizens are encouraged to participate in monitoring these projects."
            )
        )

// Continue adding more alerts up to your desired number.

        alerts.add(
            AdvocacyAlert(
                16,
                "Water Supply Contamination Cover-Up",
                "Reports indicate that officials ignored contamination warnings in the local water supply. Authorities are working on solutions, and citizens are advised to use alternative sources until further notice."
            )
        )

        alerts.add(
            AdvocacyAlert(
                17,
                "Local Business Bribing for Zoning Approvals",
                "A construction company has been accused of bribing officials to bypass zoning regulations. Community members are urged to monitor new developments closely."
            )
        )

        alerts.add(
            AdvocacyAlert(
                18,
                "Unauthorized Charges for Government Services",
                "Citizens have reported being charged unauthorized fees for basic government services. Please report such incidents directly to our platform."
            )
        )

        alerts.add(
            AdvocacyAlert(
                19,
                "Youth Group Recognized for Anti-Corruption Efforts",
                "A local youth group has been recognized for their innovative app that tracks public spending. Their efforts demonstrate how technology can combat corruption."
            )
        )

        alerts.add(
            AdvocacyAlert(
                20,
                "Fraudulent Land Titles Circulating",
                "Be aware of fake land titles being sold by unauthorized agents. Verify all land documents through the official land registry office."
            )
        )


// Add more alerts as needed following the same pattern.


        opportunities.add(
            VolunteerOpportunity(
                0,
                "Research Assistant for Corruption Studies",
                "Assist in conducting research on corruption trends and case studies. Analyze data, prepare reports, and contribute to policy recommendations for anti-corruption efforts."
            )
        )

        opportunities.add(
            VolunteerOpportunity(
                1,
                "Community Advocate for Transparent Governance",
                "Join our team to raise awareness about transparent governance. Assist in organizing workshops and engaging with local communities to educate them about their rights and the importance of accountability."
            )
        )

        opportunities.add(
            VolunteerOpportunity(
                2,
                "Data Analyst for Public Spending Review",
                "Analyze public expenditure data to identify irregularities and potential misuse of funds. Work with a team of experts to prepare detailed reports and present findings to the community."
            )
        )

        opportunities.add(
            VolunteerOpportunity(
                3,
                "Social Media Coordinator for Anti-Corruption Campaign",
                "Help manage social media platforms to spread awareness about corruption issues. Create compelling posts, engage with the community, and ensure consistent messaging for our campaigns."
            )
        )

        opportunities.add(
            VolunteerOpportunity(
                4,
                "Event Organizer for Anti-Corruption Workshops",
                "Plan and execute workshops aimed at educating citizens about reporting corruption and advocating for transparency. Coordinate logistics, speaker schedules, and community outreach."
            )
        )

        opportunities.add(
            VolunteerOpportunity(
                5,
                "Legal Advisor for Whistleblower Support",
                "Provide legal guidance to whistleblowers who come forward with information about corruption. Help ensure their protection and assist in navigating legal proceedings."
            )
        )

        opportunities.add(
            VolunteerOpportunity(
                6,
                "Tech Developer for Transparency Tools",
                "Collaborate with a team to develop tech solutions like mobile apps or websites for reporting corruption and tracking public projects. Experience in web or app development is a plus."
            )
        )

        opportunities.add(
            VolunteerOpportunity(
                7,
                "Translator for Multilingual Resources",
                "Assist in translating anti-corruption resources and campaign materials into local languages. Help make information accessible to a wider audience across diverse communities."
            )
        )

        opportunities.add(
            VolunteerOpportunity(
                8,
                "Field Researcher for Community Surveys",
                "Conduct field surveys to understand the impact of corruption on local communities. Collect data, interview residents, and contribute to comprehensive research reports."
            )
        )

        opportunities.add(
            VolunteerOpportunity(
                9,
                "Volunteer Educator for Youth Programs",
                "Engage with schools and youth groups to educate young people about the importance of integrity and the dangers of corruption. Develop creative ways to teach these values."
            )
        )

        opportunities.add(
            VolunteerOpportunity(
                10,
                "Graphic Designer for Awareness Campaigns",
                "Create visually appealing materials such as posters, infographics, and banners for anti-corruption campaigns. Help convey complex ideas in a simple and impactful way."
            )
        )




    }

    override fun getAllAlerts(): List<AdvocacyAlert> {
        return alerts.toList()
    }

    override fun getAlertById(id: Int): AdvocacyAlert? {
        return alerts.find { it.id == id.toLong() }
    }

    override fun addAlert(alert: AdvocacyAlert) {

        val alertId = alerts.last().id?.plus(1.toLong())
        alert.id = alertId?.toLong()
        alerts.add(alert)
    }

    override fun getAllOpportunities(): List<VolunteerOpportunity> {
        return opportunities.toList()
    }

    override fun getOpportunityById(id: Int): VolunteerOpportunity? {
        return opportunities.find { it.id == id }
    }

    override fun addOpportunity(opportunity: VolunteerOpportunity) {
        val opportunityId = opportunities.last().id.plus(1.toLong())
        opportunity.id=opportunityId.toInt()
        opportunities.add(opportunity)
    }
}