\# Practice\_BMSTU — задание по Java и Git



Репозиторий для учебного задания: написать простую библиотеку на Java и потренироваться работать с Git. \[file:1]



\## Где лежит Java‑код



Проект:  

`library-management-system/src/main/java/library`



Там три файла:



\- `Book.java` — класс книги  

\- `Library.java` — класс библиотеки и журнал операций  

\- `Main.java` — пример работы с библиотекой  \[file:1]



\## Ветки



Ветки сделаны по шагам из задания. \[file:1]



\- `feature/book-class` — добавлен класс `Book`.  

\- `feature/library-class` — добавлены `Library` и `Main`, а также метод `getStatistics()` (перенесён отдельным коммитом).  

\- `feature/experimental` — в этой ветке добавлены методы `getStatistics()`, `removeBook()` и `updateBook()` отдельными коммитами. \[file:1]



\## Что отрабатывалось в Git



В рамках задания использовались:



\- создание и переключение веток  

\- `reset --soft`, чтобы разнести изменения по разным коммитам  

\- `cherry-pick`, чтобы взять один коммит с методом `getStatistics()` из экспериментальной ветки и перенести его в `feature/library-class` \[file:1]



