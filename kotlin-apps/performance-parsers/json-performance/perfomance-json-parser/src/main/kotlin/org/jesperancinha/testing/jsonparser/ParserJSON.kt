package org.jesperancinha.testing.jsonparser

import org.json.simple.JSONObject
import org.json.simple.parser.JSONParser
import org.json.simple.parser.ParseException
import java.awt.Color
import java.io.FileReader
import java.io.IOException

class ParserJSON(fileName: String) {
    private val colorMap: MutableMap<String, IntArray> by lazy {
        val parser = JSONParser()
        val obj = parser.parse(FileReader(fileName))
        val jsonObject = obj as JSONObject
        val i: Iterator<*> = jsonObject.entries.iterator()
        val colorMap: MutableMap<String, IntArray> = HashMap()
        while (i.hasNext()) {
            val (key, value) = i.next() as Map.Entry<*, *>
            val color = Color.decode(value.toString())
            colorMap[key.toString()] = intArrayOf(
                color.red, color.green,
                color.blue
            )
        }
        colorMap
    }

    fun getColour(name: String, brightness: Float): String {
        val rgbValues = colorMap[name]
       return rgbValues?.let {
            val hsbVals = Color.RGBtoHSB(
                rgbValues[0], rgbValues[1],
                rgbValues[2], null
            )
            val changedColor = Color.getHSBColor(
                hsbVals[0], hsbVals[1],
                brightness * hsbVals[2]
            )
            colorMap[name] = intArrayOf(
                changedColor.red, changedColor.green,
                changedColor.blue
            )
            val rawHexString = Integer.toHexString(changedColor.rgb and 0x00ffffff)
            val zeroes = "000000"
            val hexString = zeroes.substring(rawHexString.length) + rawHexString
            "#$hexString"
        } ?: "#000000"
    }

    fun toJSON(brightness: Float): String {
        val jsonObject = JSONObject()
        val newColorMap = HashMap<String, IntArray>()
        colorMap.entries.forEach { (key, value) -> newColorMap[key] = value }
        newColorMap.keys.forEach { key ->
            val hexString = getColour(key, brightness)
            jsonObject[key] = hexString
        }
        return jsonObject.toJSONString()
    }

    companion object {
        /**
         * @param args
         */
        @JvmStatic
        fun main(args: Array<String>) {
            val obj = ParserJSON("c:\\colours.json")
            println(obj.getColour("white", 0.75f))
            println(obj.toJSON(0.75f))
        }
    }
}