# Space Scanner

- Build di entrambi i progetti (alien, gateway): `./build-all.sh`
- Esecuzione di tutti i microservizi: `docker-compose up`
- Dashboard di mongo-express: http://localhost:808
- Space Scanner: http://localhost:8080
	- Venus: http://localhost:8080/scanner/venus
	- Mars: http://localhost:8080/scanner/mars
	- Documentazione API (Swagger 2): http://localhost:8080/swagger-ui.html

## Architettura
![Architecture](doc/architecture.png)

## Swagger UI
L'API Gateway aggregga la documentazione delle API sia di venus che di mars (selezionabile dal menu a tendina in alto a destra):
![Swagger UI](./doc/swagger_ui.png)

Si possono inoltre testare le API, come mostrato in questo esempio per `GET scanner/venus/`:
![Swagger UI Query](./doc/swagger_ui_query.png)