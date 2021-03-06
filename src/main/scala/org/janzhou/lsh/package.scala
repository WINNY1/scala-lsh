package org.janzhou

/**
 * [[https://janzhou.org/lsh/ Locality Sensitive Hashing (LSH)]] is a family of hashing methods that tent to produce the same hash (or signature) for similar items.
 *
 * =Install=
 * {{{
 * libraryDependencies += "org.janzhou" %% "scala-lsh" % "versionNumber"
 * resolvers += "Jian Zhou Release" at "https://raw.githubusercontent.com/janzhou/mvn-repo/release"
 * }}}
 *
 * =Example=
 * {{{
 * import org.janzhou.LSH
 *
 * val hash = LSH.forInt(dimension, minValue, maxValue, repeating)
 * hash(LSH.move(minValue, maxValue, Array(...)))
 * }}}
*/
package object LSH extends LSHHelper
