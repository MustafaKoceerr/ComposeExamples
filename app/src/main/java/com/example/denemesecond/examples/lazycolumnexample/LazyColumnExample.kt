package com.example.denemesecond.examples.lazycolumnexample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnExample() {
    val personRepository = PersonRepository()
    val getAllData = personRepository.getAllData()

    LazyColumn(
        contentPadding = PaddingValues(all = 12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)//
    ) {
//        items(items = getAllData) { item ->
//            CustomItem(person = item)
//        }
//        itemsIndexed(items = getAllData) { index, item ->
//        }

        itemsIndexed(
            items = getAllData,
            key = { index, person -> person.id }
        ) { index, item ->
            CustomItem(person = item)
        }
    }
}