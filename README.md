# CLOUD-BASED-SPAM-MESSAGE-DETECTION-USING-TENSERFLOW

## Overview

This project utilizes machine learning to achieve classification od messages into two categories SPAM and HAM. The model is trained, exported, and hosted using Flask. The communication between the frontend, backend (Spring Boot), and the model is orchestrated through AWS services, including API Gateway and Lambda, etc.

## Components

- **Machine Learning Model:** Trained and exported model.

- **Flask Server:** Hosts the machine learning model for predictions.

- **Frontend and Backend (Spring Boot):** Hosted on an EC2 instance, the frontend interacts with the user, and the backend communicates with the Flask server through an API Gateway endpoint.

- **API Gateway:** Manages and routes HTTP requests between user and Lambda-Flask Server.

- **Lambda Function:** Acts as an intermediary between the API Gateway and Flask Server, facilitating communication.

## Setup

### Flask Server

1. Navigate to the `flask-server` directory.
2. Install the required dependencies using `pip install -r requirements.txt`.
3. Run the Flask server using `python app.py`.

### Frontend and Backend (Spring Boot)

1. Navigate to the `spring-boot-app` directory.
2. Build the project using `./mvnw clean install`.
3. Run the Spring Boot application using `java -jar target/spring-boot-app.jar`.

### Lambda Function

1. Deploy the Lambda function.

### API Gateway

1. Create an API Gateway instance on the AWS Management Console.
2. Configure endpoints and integrate them with Lambda functions.
3. Deploy the API.

## Usage

1. Access the frontend through the provided URL.
2. Input data for predictions.
3. The frontend communicates with the Spring Boot backend, which, in turn, communicates with the Lambda function via API Gateway Endpoint and queries to Flask server for predictions.

Certainly! The credits section is where you acknowledge and give credit to any libraries, frameworks, tools, or resources that you used in your project. Here's a placeholder credits section that you can customize based on the specific technologies and tools you utilized:

---

## Credits

This project wouldn't have been possible without the invaluable contributions from the following tools, libraries, and frameworks:

- **Spring Boot:** The Spring Boot framework provided a robust and efficient foundation for building our backend services.

- **Flask:** Flask served as the web framework for hosting our machine learning model, providing a simple and flexible solution.

- **AWS Services (API Gateway, Lambda, EC2):** The seamless integration of AWS services allowed us to create a scalable and reliable architecture.

- **Maven:** Maven simplified our project's build and dependency management process, making it more maintainable.
