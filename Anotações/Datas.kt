package br.com.maick

import java.text.*
import java.time.*
import java.time.format.*
import java.time.temporal.ChronoUnit
import java.util.*

fun main(){
    //tipos de data
    val date = Date()
    val localDate = LocalDate.now()
    val localDateTime = LocalDateTime.now()

    // como parsear de string para data
    var yesterday = LocalDate.from(DateTimeFormatter.ofPattern("dd/MM/yyyy").parse("20/11/2021"))
    var yesterdayTime = LocalDateTime.from(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").parse("20/11/2021 04:00"))
    var simpleDateFormat1 = SimpleDateFormat("dd/MM/yyyy")
    var simpleDateFormat2 = SimpleDateFormat("ddMMyyyy")
    var yesterdayDate = simpleDateFormat1.parse("20/11/2021")
    println(yesterday)
    println(yesterdayTime)
    println(yesterdayDate)

    // Como formatar a data da maneira desejada
    println(DateTimeFormatter.ofPattern("yyyyMMdd").format(yesterday))
    println(DateTimeFormatter.ofPattern("yyyyMMddHHmm").format(yesterdayTime))
    println(simpleDateFormat2.format(yesterdayDate))
    //=========================================================================
    //Operações com datas
    //somar e subtrair data
    yesterday = yesterday.plusDays(7)//LocalDate e LocalDateTime
    yesterdayTime = yesterdayTime.plusDays(3)//LocalDate e LocalDateTime
    println(yesterday)
    println(yesterdayTime)

    yesterdayDate = Date(yesterdayDate.toInstant().plus(7, ChronoUnit.DAYS).toEpochMilli())//Date
    println(yesterdayDate)

    //comparar datas
    println(yesterday.isAfter(yesterdayTime.toLocalDate()))//LocalDate e LocalDateTime
    println(yesterdayTime.isAfter(yesterday.atStartOfDay()))//LocalDate e LocalDateTime
    println(date.after(yesterdayDate))                      //Date

    //comparacao dia da semana

    while(yesterday.dayOfWeek == DayOfWeek.SUNDAY || yesterday.dayOfWeek == DayOfWeek.SATURDAY){//LocalDate e LocalDateTime
        yesterday = yesterday.plusDays(1)//se for sabado ou domingo, vai adicionar 1 dia até nao ser mais
    }
    println(yesterday)

    val calendar = Calendar.getInstance()
    calendar.time = yesterdayDate
    while(calendar.get(Calendar.DAY_OF_WEEK) == 1 || calendar.get(Calendar.DAY_OF_WEEK) == 7) { 4
        yesterdayDate = Date(yesterdayDate.toInstant().plus(1, ChronoUnit.DAYS).toEpochMilli())
        calendar.time = yesterdayDate
    }
    println(yesterdayDate)

}