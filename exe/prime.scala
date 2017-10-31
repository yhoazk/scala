/*
First program.
  Print the list of prime numbers upto 1000000.
  By using the Eratostenes Sieve:
    Make a list of all the integers less than or equal to limit (and greater than
    one) Remove from the list all the multiples of all primes less than or equal
    to the square root of limit, the numbers that are left are the primes.
    O(n(log n) log log n) space O(n)

    See also Pritchars "linear segmented wheel sieve"
 */
import scala.math._ // Include the sqrt function

def printPrimes(limit: Int)
{
  println(limit)
  val search_limit = sqrt(limit)
  println(s"Will search until $search_limit")

}



printPrimes(100)
