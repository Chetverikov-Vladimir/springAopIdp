package che.vlvl.springAopIdp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.EnableAspectJAutoProxy

@SpringBootApplication
@EnableAspectJAutoProxy
class SpringAopIdpApplication

fun main(args: Array<String>) {
	runApplication<SpringAopIdpApplication>(*args)
}
