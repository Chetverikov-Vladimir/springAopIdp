Практикум с аспектами. 

Терминология:


**Aspect** – это специальный класс, который описывает,какую cross-cutting логику применить в заданных точках приложения


**Weaving** – это процесс применения (связывания, объединения) кода аспекта к оригинального коду (JoinPoint)


Виды weaving:
**Compile time weaving** – аспекты внедряются в классы на этапе компиляции. 
**Load time weaving** – аспекты внедряются в классы
на этапе загрузки в JVM. Делается через инструментацию (агент). **Runtime weaving** – аспекты это бины внутри прокси.
**Advice** (совет) - метод в аспекте, который содержит дополнительную применяемую логику.


**JoinPoint**(точка соединения). Это место (точка) в программе, где применяется advice. В большинстве случаев это вызов
метода


**PointCut** (срез) - правило/описание/шаблон, по которому можно узнать подходит JoinPoint текущему Advice.

Виды **Advice**:

• @Before – выполняется перед точкой входа (есть возможность и не заходить в метод)

• @After – выполняется после точки входа (даже после исключения)

• @Around – до и после (вокруг)

• @AfterReturning – после того, как точка входа завершилась корректно • @AfterThrowing – в случае исключения в точке
входа

**PointCuts** - применяется синтаксис AspectJ (https://www.baeldung.com/spring-aop-pointcut-tutorial)

• execution – применяется ко всем публичным методам, которые совпадают по сигнатуре 

• within – применяется ко всем
публичным методам классов, которые совпадают по сигнатуре 

• target – применяется ко всем публичным методам классов,
которые являются инстансом заданного класса 

• this – применяется ко всем публичным методам классов, у которых прокси
заданного типа 

• bean – применяется ко всем публичным методам классов, у которых id бина соответствует заданному
паттерну 

• args – применяется ко всем публичным методам, которые совпадают по сигнатуре аргументов. Аргументы определены
своими типами 

• @target – применяется ко всем публичным методам классов, которые имеют над собой заданную аннотацию 

• @within – применяется ко всем публичным методам классов, которые имеют над собой заданную аннотацию 

• @annotation – применяется ко всем публичным методам, которые имеют над собой заданную аннотацию 

• @args – применяется ко всем публичным методам, которые совпадают по сигнатуре аргументов. Аргументы определены своими аннотациями

**Хорошим тоном для добавления функциональности аспектов в явном виде предполагается использование аннотаций с pointcuts:**

@target(org.springframework.stereotype.Repository) - для уровня класса 

@annotation(org.baeldung.aop.annotations.Loggable) - для уровня метода
