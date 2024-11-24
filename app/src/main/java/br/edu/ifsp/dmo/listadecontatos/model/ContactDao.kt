package br.edu.ifsp.dmo.listadecontatos.model

import java.util.LinkedList

object ContactDao { // o sort para organizar...

    private val dataset = ArrayList<Contact>()

    fun insert(contact: Contact) {
        dataset.add(Contact(contact.name, contact.phone))
    }

    fun findAll(): List<Contact> {
        dataset.sortBy { it.name }
        return ArrayList(dataset)
    }


}