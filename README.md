**Как проверить работоспособность**
***
_Изменить в application.properties_<br/>
    1) spring.datasource.username=<br/>
    2) spring.datasource.password=<br/>
***
_Запустить оба модуля и зайти по ссылкам_<br/>
    1) http://localhost:8080/1 - получаем Json с игрой + создаём/увеличиваем Count в Social (WebClient)<br/>
    2) http://localhost:8181/1?increment=false - проверяем значение Count в Social
