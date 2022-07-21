Para gerar o jar que será copiado:

```bash
mvn clean package
```

Para gerar a imagem:

```bash
docker build -t springio/gs-spring-boot-docker .
```

Para executar no docker:

```bash
docker run -p 8080:8080 -t springio/gs-spring-boot-docker
```
