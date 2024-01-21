**# Kafkaesque**

**## Unidirectional Communication with Kafka for Loose Coupling**

**Kafkaesque is a learning project that demonstrates how to implement unidirectional (producer-to-consumer) active communication using Kafka. It's designed for software developers who want to get hands-on experience with Kafka, Spring, and Docker.**

**## Key Features**

* Separate producer and consumer services, enabling loose coupling
* Data safety within the Kafka cluster, even if the producer service goes down
* Non-polling communication for efficient data transfer

**## Technologies Used**

* Java
* Spring
* Kafka
* Zookeeper
* Docker
* Docker-compose
* Gradle

**## Installation**

1. Clone the repository:
   ```bash
   git clone https://github.com/ParamjotSingh5/kafkaesque.git
   ```
2. Navigate to the producer directory:
   ```bash
   cd Kafkaesque/producer
   ```
3. Run the bootup batch file:
   ```bash
   bootup.bat
   ```
   This will:
     - Build JARs for both consumer and producer applications
     - Initiate Docker-compose to spin up required containers and services

**## Usage**

1. **Send a Message to Kafka:**
   - Create an HTTP POST request with the following details:
     - URL: `http://localhost:8082/kafka/producer/message`
     - Content-Type: `application/json`
     - Body:
       ```json
       {
         "message": "This is a message to Kafka consumer"
       }
       ```
   - You can use tools like Postman or curl to send the request.

2. **View Consumer Logs:**
   - Run the following command to view the consumer container's logs:
     ```bash
     docker logs -f message_consumer_container
     ```
   - The received message will be displayed in the console output.
