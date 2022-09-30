package com.got.houses.models
// model class for books
class Book (


    var id: Int = 0,
    var url: String? = null,
    var name: String? = null,
    var isbn: String? = null,
    var authors: List<String>? = null,
    var numberOfPages: String? = null,
    var country: String? = null,
    var mdType: String? = null,
    var released: String? = null,
    var characters: List<String>? = null
)