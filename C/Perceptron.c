#include<stdio.h>

int main() {
    int i, N, frag = 0;
    double B, a, w, tmp = 0;
    scanf("%d %lf", &N, &B);
    for (i = 0; i < N; i++) {
        scanf("%lf %lf", &a, &w);
        tmp += a * w;
    }
    if (0 < tmp + B) {
        frag = 1;
    }
    printf("%d", frag);
}