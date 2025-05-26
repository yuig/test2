package s2;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f110647a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f110648b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f110649c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f110650d;

    /* renamed from: e, reason: collision with root package name */
    public int f110651e;

    public final int a(int i13) {
        int i14 = this.f110647a + 1;
        int[] iArr = this.f110648b;
        int length = iArr.length;
        if (i14 > length) {
            int i15 = length * 2;
            int[] iArr2 = new int[i15];
            int[] iArr3 = new int[i15];
            kotlin.collections.z.k(iArr, iArr2, 0, 0, 14);
            kotlin.collections.z.k(this.f110649c, iArr3, 0, 0, 14);
            this.f110648b = iArr2;
            this.f110649c = iArr3;
        }
        int i16 = this.f110647a;
        this.f110647a = i16 + 1;
        int length2 = this.f110650d.length;
        if (this.f110651e >= length2) {
            int i17 = length2 * 2;
            int[] iArr4 = new int[i17];
            int i18 = 0;
            while (i18 < i17) {
                int i19 = i18 + 1;
                iArr4[i18] = i19;
                i18 = i19;
            }
            kotlin.collections.z.k(this.f110650d, iArr4, 0, 0, 14);
            this.f110650d = iArr4;
        }
        int i23 = this.f110651e;
        int[] iArr5 = this.f110650d;
        this.f110651e = iArr5[i23];
        int[] iArr6 = this.f110648b;
        iArr6[i16] = i13;
        this.f110649c[i16] = i23;
        iArr5[i23] = i16;
        int i24 = iArr6[i16];
        while (i16 > 0) {
            int i25 = ((i16 + 1) >> 1) - 1;
            if (iArr6[i25] <= i24) {
                break;
            }
            b(i25, i16);
            i16 = i25;
        }
        return i23;
    }

    public final void b(int i13, int i14) {
        int[] iArr = this.f110648b;
        int[] iArr2 = this.f110649c;
        int[] iArr3 = this.f110650d;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
        int i16 = iArr2[i13];
        iArr2[i13] = iArr2[i14];
        iArr2[i14] = i16;
        iArr3[iArr2[i13]] = i13;
        iArr3[iArr2[i14]] = i14;
    }
}
