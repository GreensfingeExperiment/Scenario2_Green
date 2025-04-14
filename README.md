# 📰 Article View Counter – GreenEsfinge Experiment

This project simulates a simplified article view counter, commonly used in blogs or content platforms. It is part of an experiment designed to demonstrate how energy-saving strategies can be integrated into Java applications using the **GreenEsfinge Framework**.

## 📦 Project Structure

The project follows the standard layered architecture with separate packages for controller, service, and repository.

## ✅ Description

- `controller.ArticleController`: Entry point, delegates logic to the service layer.
- `service.ArticleService`: Contains the business logic to format the article view message.
- `repository.ArticleRepository`: Simulates a database with static return values.

## 🧪 Unit Tests

The test class `ArticleControllerTest` validates the behavior of the view counter logic, including cases where the return should be modified based on toggle activation.
