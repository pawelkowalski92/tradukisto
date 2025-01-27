package pl.allegro.finance.tradukisto.internal.languages.russian

import spock.lang.Ignore
import spock.lang.Specification
import spock.lang.Unroll

import static pl.allegro.finance.tradukisto.internal.Container.russianContainer

class RussianValuesTest extends Specification {

    static intConverter = russianContainer().getIntegerConverter()
    static longConverter = russianContainer().getLongConverter()

    @Unroll
    def "should convert #value to '#words' in Russian"() {
        expect:
        intConverter.asWords(value) == words

        where:
        value         | words
        0             | "ноль"
        1             | "один"
        2             | "два"
        3             | "три"
        4             | "четыре"
        5             | "пять"
        6             | "шесть"
        7             | "семь"
        8             | "восемь"
        9             | "девять"
        11            | "одиннадцать"
        12            | "двенадцать"
        13            | "тринадцать"
        14            | "четырнадцать"
        15            | "пятнадцать"
        16            | "шестнадцать"
        17            | "семнадцать"
        18            | "восемнадцать"
        19            | "девятнадцать"
        10            | "десять"
        20            | "двадцать"
        30            | "тридцать"
        40            | "сорок"
        50            | "пятьдесят"
        60            | "шестьдесят"
        70            | "семьдесят"
        80            | "восемьдесят"
        90            | "девяносто"
        21            | "двадцать один"
        37            | "тридцать семь"
        43            | "сорок три"
        58            | "пятьдесят восемь"
        69            | "шестьдесят девять"
        76            | "семьдесят шесть"
        82            | "восемьдесят два"
        95            | "девяносто пять"
        100           | "сто"
        200           | "двести"
        300           | "триста"
        400           | "четыреста"
        500           | "пятьсот"
        600           | "шестьсот"
        700           | "семьсот"
        800           | "восемьсот"
        900           | "девятьсот"
        111           | "сто одиннадцать"
        272           | "двести семьдесят два"
        387           | "триста восемьдесят семь"
        448           | "четыреста сорок восемь"
        569           | "пятьсот шестьдесят девять"
        625           | "шестьсот двадцать пять"
        782           | "семьсот восемьдесят два"
        895           | "восемьсот девяносто пять"
        999           | "девятьсот девяносто девять"
        1_000         | "одна тысяча"
        2_000         | "две тысячи"
        5_000         | "пять тысяч"
        7_634         | "семь тысяч шестьсот тридцать четыре"
        21_000        | "двадцать одна тысяча"
        24_190        | "двадцать четыре тысячи сто девяносто"
        51_000        | "пятьдесят одна тысяча"
        481_000       | "четыреста восемьдесят одна тысяча"
        653_000       | "шестьсот пятьдесят три тысячи"
        123_454       | "сто двадцать три тысячи четыреста пятьдесят четыре"
        700_000       | "семьсот тысяч"
        999_999       | "девятьсот девяносто девять тысяч девятьсот девяносто девять"
        1_000_000     | "один миллион"
        2_000_000     | "два миллиона"
        5_000_000     | "пять миллионов"
        23_437_219    | "двадцать три миллиона четыреста тридцать семь тысяч двести девятнадцать"
        100_000_000   | "сто миллионов"
        123_456_789   | "сто двадцать три миллиона четыреста пятьдесят шесть тысяч семьсот восемьдесят девять"
        1_000_000_000 | "один миллиард"
        2_147_483_647 | "два миллиарда сто сорок семь миллионов четыреста восемьдесят три тысячи шестьсот сорок семь"
    }

    @Ignore("Needs Russian long converter and values for trillion, quadrillion, quintillion")
    @Unroll
    def "should convert long #value to '#words' in Russian"() {
        expect:
        longConverter.asWords(value) == words

        where:
        value                     | words
        5_000_000_000             | ""

        1_000_000_000_000         | ""
        2_000_000_000_000         | ""
        5_000_000_000_000         | ""

        1_000_000_000_000_000     | ""
        2_000_000_000_000_000     | ""
        5_000_000_000_000_000     | ""

        1_000_000_000_000_000_000 | ""
        2_000_000_000_000_000_000 | ""
        Long.MAX_VALUE            | ""
    }
}
