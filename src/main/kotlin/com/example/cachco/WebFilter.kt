package com.example.cachco

import jakarta.servlet.Filter
import jakarta.servlet.FilterChain
import jakarta.servlet.ServletRequest
import jakarta.servlet.ServletResponse
import jakarta.servlet.annotation.WebFilter
import jakarta.servlet.http.HttpSession
import org.springframework.context.annotation.ComponentScan
import org.springframework.stereotype.Component


@Component
@WebFilter(urlPatterns = ["/"])
class WebFilter(val session: HttpSession) :Filter{
    override fun doFilter(req: ServletRequest?, resp: ServletResponse?, chain: FilterChain?) {
        println("Filtering request")
        chain?.doFilter(req, resp)
    }

}