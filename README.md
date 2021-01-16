# App VIS - API Java
## Versão 0.0.2 - 16/01/2020
README.md criado em https://stackedit.io/
Para alterações veja em CHANGLOG.md(Em construção)


## Variávies de ambiente - Obrigatórias
Estas variáveis de ambientes são necessárias para executar a api. Sem elas a API não irá rodar.
**APP_VIS_DATABASE_IP** - Ip para o servidor de Produção/Desenvolvimento
**APP_VIS_DATABASE_PORT** - Porta para o servidor de Produção/Desenvolvimento
**APP_VIS_DATABASE_NAME** - Nome do banco de produção/desenvolvimento **
** É obrigatório que ambos os banco estejam criados da seguinte forma  
|Modo| Banco |
|--|--|
|Produção|<**APP_VIS_DATABASE_NAME**>|
|Desenvolvimento|<**APP_VIS_DATABASE_NAME**>_DEV|

## Execução da API
Após a criação das variáveis de ambiente, executar o seguinte comando para rodar a API

    java -jar <nome_do_arquivo.jar>

Caso seja necessário rodar a API em modo de desenvolvimento, executar o seguinte comando.

    java -jar -Dspring.profiles.active=dev <nome_do_arquivo.jar>
## Modo de desenvolvedor
Este modo possui algumas diferenças.

 1. Tempo de expiração do Token para 24 horas.
 2. Secret usado para gerar o Token diferente
 3. Alguns endpoints extras.

## Documentação API
Toda a documentação da API poderá ser encontrada em ...(Em desenvolvimento)