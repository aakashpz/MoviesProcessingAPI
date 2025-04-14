# MoviesProcessingAPI


<h2>Backend Local setup:</h2>

```
Step 1: Download or clone the source code to a local machine.

Step 2: mvn clean install

Step 3: Run the application or mvn spring-boot:run
```

<h2>Docker build</h2>

Step 1: Image creation : `docker build -t movie.collection_image .`

Step 2: Pull SQLite container: `docker pull SQLite`

Step 3: Running mongoldb container: `docker run -d --name sqlite-on-docker -h localhost --ip 127.0.0.1 -p 27017:27017 sqlite`

Step 4: Running Spring Application: `docker run -d --name movie.collection -h localhost --ip 127.0.0.1 -p 8080:8080 movie.collection_image`

Step 5: Find Container IP Address : `docker inspect -f '{{range.NetworkSettings.Networks}}{{.IPAddress}}{{end}}' container_name_or_id`

Once done please use `http://localhost:8080/api/movie/all`
