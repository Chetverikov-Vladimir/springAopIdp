package che.vlvl.springAopIdp.service.book

import che.vlvl.springAopIdp.annotation.LoggingMethodWithAspect
import che.vlvl.springAopIdp.domain.Book
import org.springframework.stereotype.Service

@Service
class BookServiceImpl : BookService {
    override fun getBook(): Book = Book()

    @LoggingMethodWithAspect
    override fun getBookSlowly(): Book {
        Thread.sleep(1000)
        return Book()
    }
}