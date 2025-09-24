# HoenScanner: Dropwizard Microservice for Hotels and Car Rentals

**HoenScanner** is a **Java-based Dropwizard microservice** designed to assist users in finding **hotels and car rentals** on the Hoen Archipelago, an emerging tourist destination. This project is part of the Skyscanner platform integration for the region.

---

## 🛠 Project Overview

- **Objective:** Provide a microservice capable of handling HTTP requests from the Skyscanner backend, returning relevant hotels and rental car services for a given city in the Hoen Archipelago.
- **Purpose:** Enable tourists to discover and book accommodations and car rentals efficiently in the newly popular region.
- **Microservice Architecture Insight:**
  - Built as an independent microservice rather than part of a monolithic system.
  - Communicates over HTTP, decoupled from other services.
  - Easily maintainable and scalable; changes can be deployed independently.

---

## ⚙️ Features

- Accepts HTTP requests containing a city name.
- Searches the provided dataset for matching hotels and car rental services.
- Returns structured JSON responses with relevant results.
- Simple, maintainable architecture following **Dropwizard conventions**.
- Demonstrates best practices in **microservice design**.

---

## 🛠 Technology Stack

- **Language:** Java  
- **Framework:** Dropwizard  
- **HTTP Handling:** Jetty server (via Dropwizard)  
- **Build Tool:** Maven or Gradle (depending on setup)  
- **Data Processing:** JSON parsing and file-based lookup  

---

## 🚀 How to Run

1. **Clone the repository:**
```bash
git clone https://github.com/Karthikgs3/HoenScanner-SkyScanner.git
cd HoenScanner-SkyScanner
```
## Build the project using maven or gradle
# For Maven
- mvn clean install

# For Gradle
- gradle build
# run the service
- java -jar target/hoenscanner-1.0-SNAPSHOT.jar server config.yml

🔍 API Usage

Endpoint: /search

Method: GET

Query Parameter: city — name of the city on Hoen Archipelago

Response Example:
{
  "city": "Hoen City",
  "hotels": [
    "Hoen Grand Hotel",
    "Seaside Inn"
  ],
  "carRentals": [
    "Hoen Car Rentals",
    "Island Wheels"
  ]
}

📂 Project Structure

HoenScanner-SkyScanner/
├── src/
│   ├── main/java/com/hoenscanner/
│   │   ├── resources/   # Configuration and dataset files
│   │   ├── api/         # REST endpoint definitions
│   │   ├── core/        # Data models
│   │   └── service/     # Service implementation logic
├── config.yml            # Dropwizard configuration
├── pom.xml or build.gradle # Build configuration
└── README.md

👤 Author

- Karthik G S
- Skyscanner Forage Internship Project
