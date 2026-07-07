package org.jesperancinha.kotlin.crums1.sealed.package2

// import org.jesperancinha.kotlin.crums1.sealed.package1.AnotherShape

// This won't work because it is in a different package
// class Trapezoid: AnotherShape {
// }

sealed class ThisShape

class Cube: ThisShape()
