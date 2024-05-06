fun main() {
    // Number of times a webpage was visited
    val pageVisitTracker = PageVisitTracker()

    pageVisitTracker.trackPageVisit("Home")
    pageVisitTracker.trackPageVisit("About")
    pageVisitTracker.trackPageVisit("Contact")
    pageVisitTracker.trackPageVisit("Login")
    pageVisitTracker.trackPageVisit("Home")
    pageVisitTracker.trackPageVisit("Contact")
    pageVisitTracker.trackPageVisit("Offers")
    pageVisitTracker.trackPageVisit("Discount")
    pageVisitTracker.trackPageVisit("Sales")
    pageVisitTracker.trackPageVisit("Promotions")
    pageVisitTracker.trackPageVisit("Login")
    pageVisitTracker.trackPageVisit("Home")
    pageVisitTracker.trackPageVisit("Offers")
    pageVisitTracker.trackPageVisit("Promotions")
    pageVisitTracker.trackPageVisit("Promotions")

    val topVisitedPages = pageVisitTracker.getTopFivePages()
    println("Top 5 most visited pages")

    topVisitedPages.forEachIndexed{index,pair ->
        println("${index + 1}.${pair.second} was visited ${pair.second} times")
    }
    println(topVisitedPages)
}



//Counting  the number of times a webpage was visited.
class PageVisitTracker(){
    val pagesVisited = mutableMapOf<String,Int>()

    fun trackPageVisit(page:String){
        pagesVisited[page] = pagesVisited.getOrDefault(page,0) + 1
    }

    fun getTopFivePages():List<Pair<String,Int>>{
        return pagesVisited.toList().sortedByDescending{it.second}.take(5)
    }
}