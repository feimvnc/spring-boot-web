package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.management.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Date;
import java.util.TimeZone;
import java.time.format.DateTimeFormatter;

@RestController
public class DemoController {

    @GetMapping("/")
    public String homePage() {
        Map<String, Object> info = new HashMap<>();
        Runtime runtime = Runtime.getRuntime();
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
        OperatingSystemMXBean osBean = ManagementFactory.getOperatingSystemMXBean();

        // Build HTML string
        StringBuilder htmlResponse = new StringBuilder();
        htmlResponse.append("<html><body><pre>"); // Use <pre> to preserve formatting or just <body>
        htmlResponse.append("--- System Details ---<br>");
        htmlResponse.append("Current UTC: ").append(this.getUTC()).append("<br>");
        htmlResponse.append("Java Version: ").append(System.getProperty("java.version")).append("<br>");
        htmlResponse.append("Total Memory: ").append(runtime.totalMemory()).append("<br>");
        htmlResponse.append("Free Memory: ").append(runtime.freeMemory()).append("<br>");
        htmlResponse.append("Max Memory: ").append(runtime.maxMemory()).append("<br>");
        htmlResponse.append("Available Processors: ").append(osBean.getAvailableProcessors()).append("<br>");
        htmlResponse.append("Thread Count: ").append(threadBean.getThreadCount()).append("<br>");
        // Add more details with <br>
        
        // If you want to show map entries too:
        info.forEach((key, value) -> {
            htmlResponse.append(key).append(": ").append(value).append("<br>");
        });
        
        htmlResponse.append("</pre></body></html>");

        return htmlResponse.toString(); // Return the complete HTML string

    }

    public String getUTC(){
        Date now = new Date();
        return now.toString();
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World!";
    }

}
