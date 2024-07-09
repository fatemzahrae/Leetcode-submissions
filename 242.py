from collections import Counter
def dic(s):
    d = {}
    for i in s :
        if i in d :
            d[i] += 1
        else :
            d[i] = 1 
    return d

def isAnagram(s,t):
    return dic(s) == dic(t)

if __name__ == "__main__" :
    print(isAnagram('tar','rat'))
