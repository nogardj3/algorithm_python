import itertools
import heapq
import bisect
import collections
import math
import time
import re

"""
# 단순 공백 기준 여러개 받기
n, m = map(int, input().split())

# n * m 2차원 배열 받기
n = int(input())
for i in range(n):
data = list(map(int, input().split()))  # n개 받기

# 빠르게 받기
data = sys.stdin.readline().rstrip()

print(n, m, data)
"""
import sys

input = lambda: sys.stdin.readline().strip()
############################################

n = int(input())

len_n = len(str(n))

if len_n == 1:
    print(n)
else:
    res = 0
    for i in range(1, len_n):
        res += 9 * i * 10 ** (i - 1)

    tt = len_n * ((n - (10 ** (len_n - 1))) + 1)
    res += tt
    print(res)
