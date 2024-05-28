1. Diagrama de Casos de Uso
O diagrama de casos de uso mostra as interações entre os atores (usuários ou outros sistemas) e o sistema.

          +-----------------+
          |    Usuário      |
          +-----------------+
             /        |      \
           /          |        \
 +-------------+  +--------------+  +---------------+
 | Gerenciar   |  | Gerenciar    |  | Acessar       |
 | Músicas     |  | Chamadas     |  | Internet      |
 +-------------+  +--------------+  +---------------+
2. Diagrama de Classes
O diagrama de classes define a estrutura do sistema mostrando suas classes, atributos, métodos e os relacionamentos entre os objetos.

+-------------------+           +-----------------+           +------------------+
|   MusicPlayer     |           |      Phone      |           |    WebBrowser    |
+-------------------+           +-----------------+           +------------------+
| - currentTrack    |           | - contacts      |           | - currentURL     |
| - playlist        |           | - currentCall   |           | - history        |
+-------------------+           +-----------------+           +------------------+
| + play()          |           | + makeCall()    |           | + navigate()     |
| + pause()         |           | + receiveCall() |           | + openApp()      |
| + stop()          |           | + endCall()     |           |                  |
| + createPlaylist()|           | + rejectCall()  |           |                  |
| + addToPlaylist() |           |                 |           |                  |
+-------------------+           +-----------------+           +------------------+
3. Diagrama de Sequência
O diagrama de sequência mostra a interação entre os objetos ao longo do tempo para realizar uma funcionalidade específica.

a. Reproduzir Música

Usuário       MusicPlayer
   |               |
   |    play()     | 
   |-------------->|
   |               |
   | <----- música |
b. Fazer Chamada

Usuário       Phone
   |             |
   | makeCall()  |
   |------------>|
   |             |
   | <--- chamada|
c. Navegar na Web

Usuário       WebBrowser
   |              |
   |  navigate()  |
   |------------->|
   |              |
   | <--- página  |
Conclusão
Esses diagramas UML fornecem uma visão abrangente das funcionalidades de músicas, chamadas e internet do iPhone, representando tanto a interação do usuário com o sistema quanto a estrutura interna necessária para suportar essas operações. Os diagramas de casos de uso capturam os principais casos de uso do usuário, os diagramas de classes mostram a estrutura do sistema e os diagramas de sequência ilustram como essas funcionalidades são executadas dinamicamente.