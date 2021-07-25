package che.vlvl.springAopIdp.aspect

import mu.KotlinLogging
import org.aspectj.lang.ProceedingJoinPoint
import org.aspectj.lang.annotation.Around
import org.aspectj.lang.annotation.Aspect
import org.springframework.stereotype.Component


@Aspect
@Component
class LoggingAspect {
    val logger = KotlinLogging.logger {}

    @Around("@annotation(che.vlvl.springAopIdp.annotation.LoggingMethodWithAspect)")
    fun logging(joinPoint: ProceedingJoinPoint): Any? {
        logger.info("Logging aspect for ${joinPoint.target} before running")

        val result = joinPoint.proceed()

        logger.info("Logging aspect for ${joinPoint.target} after running. Result - $result")

        return result
    }
}