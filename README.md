
# 📰 Article View Counter – GreenEsfinge Experiment

This project simulates an article view counter, commonly used in blogs or content platforms. It is part of an experiment to demonstrate how energy-saving strategies can be integrated into Java applications using the **GreenEsfinge Framework**.

## 📦 Project Structure

The project follows a simple architecture with a `service` and an `entity`.

## ✅ Description

- `entity.Article`: Represents an article with name and view attributes.
- `service.ArticleService`: Contains the business logic to add articles with view counts.

## 🧪 Unit Tests

The test class `ArticleServiceTest` validates the behavior of the logic for adding articles:

- `testFindQtyArticleView`: Verifies that the original service adds exactly 3 articles.
- `testFindQtyArticleUsingGreenFramework`: Uses `GreenFactory.greenify` to dynamically modify the method’s behavior, demonstrating how the framework can alter execution to promote energy efficiency (e.g., by reducing the number of returned articles).
