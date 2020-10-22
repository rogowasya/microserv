Порядок запуска:

0) Деплой библиотек расширения(и модули ядра). Например, ou-model и т.д.
1) ou-config-service - сервер конфигурации
2) ou-eureka-service - Discovery server
3) ou-gateway-service - прокси. Например поднять по адресу http:/localhost:8080/.
Тогда доступ к сервису ou-auth-service можно настроить как http:/localhost:8080/auth/*.
А скажем к сервису отчетов ou-report-service как http:/localhost:8080/reports/*.
4) ou-security-service - сервис авторизации