Порядок запуска:

0) Деплой библиотек расширения(и модули ядра). Например, micro-model и т.д.
1) micro-config-service - сервер конфигурации
2) micro-eureka-service - Discovery server
3) micro-gateway-service - прокси. Например поднять по адресу http:/localhost:8080/.
Тогда доступ к сервису micro-auth-service можно настроить как http:/localhost:8080/auth/*.
А скажем к сервису отчетов micro-report-service как http:/localhost:8080/reports/*.

4) Далее стартуем все пользовательские сервисы