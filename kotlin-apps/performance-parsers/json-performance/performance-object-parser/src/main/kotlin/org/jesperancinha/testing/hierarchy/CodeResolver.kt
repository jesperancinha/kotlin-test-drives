package org.jesperancinha.testing.hierarchy

class CodeResolver : CodeHierarchy {
    private val allMaps: MutableMap<String, ParentCode> = HashMap()
    override fun isChildOf(aCode: String, bCode: String): Boolean {
        val codeA = requireNotNull(allMaps[aCode]) { "No code found for $aCode" }
        val codeB = requireNotNull(allMaps[bCode]) { "No code found for $bCode" }
        val parent = requireNotNull(codeA.parent) { "$aCode has no parent" }
        return parent.name == codeB.name
    }

    override fun isParentOf(aCode: String, bCode: String): Boolean {
        val codeA = requireNotNull(allMaps[aCode]) { "No code found for $aCode" }
        val codeB = requireNotNull(allMaps[bCode]) { "No code found for $bCode" }
        val parent = requireNotNull(codeB.parent) { "$bCode has no parent" }
        return parent.name == codeA.name
    }

    override fun inHierarchyOf(aCode: String, bCode: String): Boolean {
        return isChildOf(aCode, bCode) || isParentOf(aCode, bCode)
    }

    fun proccessMatrix(matrix: Array<Array<String>>) {
        for (i in matrix.indices) {
            val parentString = matrix[i][1]
            val childString = matrix[i][0]
            val coment = matrix[i][2]
            val parent = allMaps[parentString] ?: ParentCode(parentString, coment)
            val code = allMaps[parentString] ?: ParentCode(parent, childString)
            parent.addChild(childString, code)
            allMaps[parentString] = parent
            allMaps[childString] = code
        }
        println(isParentOf("A", "B"))
        println(inHierarchyOf("A", "D"))
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val matrix = arrayOf(
                arrayOf("A", "A", "It's A"),
                arrayOf("B", "A", "It's B"),
                arrayOf("C", "A", "It's C"),
                arrayOf("D", "C", "It's D")
            )
            val resolver = CodeResolver()
            resolver.proccessMatrix(matrix)
        }
    }
}