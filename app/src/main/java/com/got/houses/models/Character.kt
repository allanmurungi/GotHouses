package com.got.houses.models
// model class for Game Of Thrones characters
class Character (


    var id: Int = 0,
    var url: String? = null,
    var name: String? = null,
    var gender: String? = null,
    var culture: String? = null,
    var allegiances: List<String>? = null,
    var titles: List<String>? = null,
    var born: String? = null,
    var died: String? = null,
    var father: String? = null,
    var mother: String? = null,
    var spouse: String? = null,
    var books: List<String>? = null,
    var povBooks: List<String>?? = null,
    var swornMembers: List<String>? = null
)