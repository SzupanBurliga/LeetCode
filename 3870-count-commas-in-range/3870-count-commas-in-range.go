func countCommas(n int) int {
    a := 0
    if n > 1000{
        a = n - 1000 + 1
        return a
    } 
    if n == 1000{
        return 1
    }
    return 0
}