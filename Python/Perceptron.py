N, B = list(map(float, input().split()))
tmp = 0
frag = 0
for i in range(int(N)):
    a, w = list(map(float, input().split()))
    tmp += a * w
if 0 < tmp + B:
    frag = 1
print(frag)
