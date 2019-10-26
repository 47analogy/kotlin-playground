
// class example
class AppUser (
    // constructor
    val name: String = "Bob", // properties
    val joinDate: String,
    val proVersion: Boolean
) {
    // class body
    fun getFirstInitial(): Char {
        return name[0] // grab the first char
    }
}


// data class example (only stores data, but does not change it)
data class User (
    val uid: String,
    val name: String,
    val profilePicUrl: String = "satellite_beam"
)
// data adds some funtions out of the box: equals(), hashcode(), toString(), copy()


class Movies (
    val name: String,
    val releaseDate: String,
    val revenue: Int
){
    fun displayMovie() {
        println("Name: $name " +
                "Released: $releaseDate " +
                "Box Ofiice: $${revenue} million")
    }
}

fun topMovie() {
    val movie = Movies("The Joker", "October 4, 2019", 788)
    movie.displayMovie()
    val movie2 = Movies("It Chapter Two", "September 6, 2019", 488)
    movie2.displayMovie()
}

fun main() {
    topMovie()
}