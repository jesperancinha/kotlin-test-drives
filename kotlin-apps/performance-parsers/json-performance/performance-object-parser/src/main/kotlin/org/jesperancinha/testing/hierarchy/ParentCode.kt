package org.jesperancinha.testing.hierarchy

class ParentCode : Code {
    var childCodes: MutableMap<String?, Code?> = HashMap()

    constructor(name: String?, comment: String?) : super(name, comment) {
        this.name = name
        parent = this
    }

    constructor(parent: ParentCode?, name: String?) : super(parent, name)

    fun addChild(name: String?, childCode: Code?) {
        childCodes[name] = childCode
    }
}