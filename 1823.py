def findTheWinner(n,k) :
    L = [i for i in range(1,n+1)]
    start = 0
    while len(L) > 1 :
        dep = (start + k - 1) % len(L)
        L.pop(dep)
        start = dep
    return L[0]
    