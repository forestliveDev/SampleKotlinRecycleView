package net.forestlive.kotlinrecyclerview.recycler.manage

import net.forestlive.kotlinrecyclerview.recycler.entity.TriompheEntity

/**
 * Created by ymori on 2017/10/01.
 */
class TriompheManager {

    init {

    }

    fun raceList(): List<TriompheEntity> {
        val horseList = listOf(
                "ザラック",
                "ドーハドリーム",
                "ワンフットインヘヴン",
                "ユリシーズ",
                "クロスオブスターズ",
                "シルバーウェーヴ",
                "アイダホ",
                "チンギスシークレット",
                "サトノダイヤモンド",
                "サトノノブレス",
                "イキートス",
                "オーダーオブセントジョージ",
                "セブンスヘブン",
                "ブラムト",
                "カプリ",
                "プリュマティック",
                "エネイブル",
                "ウィンター")

        val kuniList = listOf(
                "フランス",
                "フランス",
                "フランス",
                "イギリス",
                "フランス",
                "フランス",
                "アイルランド",
                "ドイツ",
                "日本",
                "日本",
                "フランス",
                "フランス",
                "フランス",
                "イギリス",
                "フランス",
                "フランス",
                "イギリス",
                "フランス",
                "フランス",
                "アイルランド")


        val trioList = mutableListOf<TriompheEntity>()

        for (i in 0..horseList.size-1 ){
            trioList.add(TriompheEntity(horseList[i], kuniList[i]))
        }

        return trioList
    }

    fun countryName(name:String): String = when(name) {
        "イギリス" -> "🇬🇧" + " " + name
        "フランス" -> "🇫🇷" + " " + name
        "日本" -> "🇯🇵" + " " + name
        "ドイツ" -> "🇩🇪" + " " + name
        "アイスランド" -> "🇮🇸" + " " + name
        else -> "🇺🇸" + " " + name
    }

}