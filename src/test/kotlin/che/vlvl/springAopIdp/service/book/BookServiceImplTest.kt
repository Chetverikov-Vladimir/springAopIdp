package che.vlvl.springAopIdp.service.book

import mu.KotlinLogging
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class BookServiceImplTest {
    val logger = KotlinLogging.logger { }

    @Autowired
    lateinit var service: BookService

    @Test

    fun getBookTest() {
        service.getBook()
    }

    @Test
    //With logging aspect
    fun getBookSlowlyTest() {
        service.getBookSlowly()
    }
}