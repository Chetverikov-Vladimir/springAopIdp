package che.vlvl.springAopIdp.service.book

import che.vlvl.springAopIdp.domain.Book

interface BookService {
    fun getBook(): Book
    fun getBookSlowly(): Book
}