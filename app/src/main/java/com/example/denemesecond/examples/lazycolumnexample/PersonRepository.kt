package com.example.denemesecond.examples.lazycolumnexample

class PersonRepository {
    fun getAllData(): List<Person> {
        // temp data
        return listOf(
            Person(1, "Ahmet", "Yılmaz", 28),
            Person(2, "Mehmet", "Kaya", 34),
            Person(3, "Ayşe", "Demir", 25),
            Person(4, "Fatma", "Çelik", 30),
            Person(5, "Ali", "Şahin", 40),
            Person(6, "Zeynep", "Koç", 22),
            Person(7, "Emre", "Aydın", 27),
            Person(8, "Elif", "Kurt", 26),
            Person(9, "Burak", "Aslan", 32),
            Person(10, "Selin", "Yalçın", 29),
            Person(11, "Can", "Öztürk", 36),
            Person(12, "Derya", "Polat", 24),
            Person(13, "Hakan", "Erdoğan", 33),
            Person(14, "Gizem", "Arslan", 31),
            Person(15, "Mert", "Uçar", 23),
            Person(16, "Ece", "Güneş", 21),
            Person(17, "Yusuf", "Toprak", 38),
            Person(18, "Melis", "Bozkurt", 35),
            Person(19, "Berk", "Kara", 26),
            Person(20, "Seda", "Aksoy", 28)
        )
    }
}