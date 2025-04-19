<!-- Add content for readme for normal java spring boot crud api -->

# Spring Boot CRUD API

This is a simple CRUD API using Spring Boot. It uses an in-memory H2 database to store the data.

## Requirements

- Java 8
- Maven

## Running the application

To run the application, execute the following command:

```bash
mvn spring-boot:run
```

The application will be available at `http://localhost:8080`.

## API Endpoints

The following endpoints are available:

- `GET /todos`: Get all Todos
- `GET /todos/{id}`: Get a Todo by ID
- `POST /todos`: Create a new Todo
- `PUT /todos`: Update a Todo
- `DELETE /todos/{id}`: Delete a Todo

The request and response bodies are in JSON format.

## Example

To create a new todo, send a POST request to `http://localhost:8080/todos` with the following JSON body:

```json
{
    "id": 1,
    "title": "Create a new todo",
    "description": "Create a new todo",
    "done": false
}
```

The response will be the created todo with an ID assigned to it.
