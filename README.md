# 📰 Article View Counter – Greensfinge Experiment

Consider a blog that shows the number of views for each article right below the title. By default, this number is updated with each new access:

"The article Java for Beginners contains 15 pages and has been viewed 542 times."

Although this is real data, it is not always required. For instance, the calculation of the number of pages is resource-intensive and not mandatory.

## 📦 Project Structure

The project follows a simple architecture with a service, entity and repository.

## ✅ Description

- `entity.Article`: Contains the business entity class.
- `service.ArticleService`: Contains the business logic to format the article view message.
- `repository.ArticleRepository`: Simulates a database to search the values.

### ❓ Task

In the ArticleService class, the testFindArticleView() method searches for an article, a product, and the number of views. Currently, this method also returns the number of pages. To save energy when the user does not need the page count, you should implement functionality to make this optional.

To implement this functionality, when the new method saveConsumptionEnergy() is called with the parameter "true", the number of pages should be disabled. The method saveConsumptionEnergy() is empty and you need to implement it as part of your task.

<span style="color:red">⚠️Note: You are only allowed to make changes in the classes `ArticleService` and `ProcessArticlePage`.</span>


---

## 🧪 Unit Tests

The test class `ArticleServiceTest` validates the behavior of the view counter logic.

When you open the project, to make sure that everything is correctly configured, you need to run the tests and teh result should be the one in teh pecture: on test will pass and the other not. When you make all tests pass successfully, your task is complete.

<span style="color:red">IMPORTANT: You cannot change the test code!.</span>

![img.png](img.png)
