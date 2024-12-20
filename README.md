<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

<!-- ABOUT THE PROJECT -->
## About The Project
Это **финальный проект 6 спринта** курса обучения **Автоматизатор тестирования на Java**, который я прохожу на [Яндекс.Практикуме](https://practicum.yandex.ru/)

**UNIT ТЕСТЫ**

Тебя пригласили помочь зоологам: они исследуют семейство кошачьих. Чтобы записывать наблюдения, учёные используют специальную программу. Тебе предстоит протестировать часть программы.

**Основное задание**

- Привяжи GitHub к тренажёру. Как только ты это сделаешь, в списке репозиториев автоматически появится qa_java. Там будет заготовка проекта, в которой нужно дописать код.
- Собери Maven-проект: подключи Jacoco, Mockito и JUnit.
- Класс Lion не должен зависеть от класса Feline. Используй принцип инъекции зависимостей.
- Напиши моки с помощью Mockito. Какие именно понадобятся — определи самостоятельно.
- Напиши тесты на классы Feline, Cat и Lion.
- Подумай, где можно применить параметризацию. Реализуй параметризованные тесты.
- Оцени покрытие с помощью Jacoco: оно должно быть не менее 100% для классов Feline, Cat и Lion..

**Дополнительное задание**

- Создай класс льва Алекса из мультфильма «Мадагаскар». Он будет наследником обычного льва.
- Помимо обычных методов у него есть свои:
getFriends() возвращает список имён его друзей — зебры Марти, бегемотихи Глории и жирафа Мелман;
getPlaceOfLiving() возвращает место, где он живёт — Нью-Йоркский зоопарк.
- Также нужно переопределить метод getKittens(), потому что у Алекса нет львят. А ещё — написать свой конструктор, так как в классе Lion нет дефолтного конструктора. Алекс самец, поэтому в конструктор класса Lion всегда будет передаваться одно и то же значение. 
- Покрой тестами созданный класс.


**Использование:**
Для запуска тестов выполните команду "mvn clean test"


<p align="right">(<a href="#readme-top">back to top</a>)</p>

### Built With

* java 11
* maven 4.0.0
* junit 4.13.2
* Mockito 3.12.4
* Jacoco 0.8.7

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- CONTACT -->
## Contact

Юрий **Ермаков** - bigbro89@yandex.ru
