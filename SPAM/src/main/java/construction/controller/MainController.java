package construction.controller;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.Principal;


@Controller
public class MainController {


    @Autowired
    public MainController(){
    }



    @GetMapping("/")
    public String index()
    {
        return "index";
    }

    @PostMapping("/classify")
    public String add(HttpServletRequest request, Model model) throws IOException {

        // Get the message parameter from the request
        String message = request.getParameter("message");

        // Create a RestTemplate instance
        RestTemplate restTemplate = new RestTemplate();

        // Set headers for the request
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        // Create a MultiValueMap to hold the form data
        MultiValueMap<String, String> formData = new LinkedMultiValueMap<>();
        formData.add("message", message);

        // Create the HTTP entity with headers and form data
        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(formData, headers);

        // Define the URL for the POST request
        String url = "https://ycuc7hmo64.execute-api.ap-south-1.amazonaws.com/message_classify";

        // Send the POST request
        ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);

        // Get the response body
        String responseBody = response.getBody();


        // Add the response body to the model
        model.addAttribute("responseBody", responseBody);

        // Return the view name
        return "index";
    }



}





