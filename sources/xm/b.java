package xm;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final int f135345a;

    /* renamed from: b, reason: collision with root package name */
    public final int f135346b;

    /* renamed from: c, reason: collision with root package name */
    public final int f135347c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f135348d;

    public b(int i13, int i14) {
        if (i13 <= 0 || i14 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f135345a = i13;
        this.f135346b = i14;
        int i15 = (i13 + 31) / 32;
        this.f135347c = i15;
        this.f135348d = new int[i15 * i14];
    }

    public final boolean a(int i13, int i14) {
        return ((this.f135348d[(i13 / 32) + (i14 * this.f135347c)] >>> (i13 & 31)) & 1) != 0;
    }

    public final void b(int i13, int i14) {
        int i15 = (i13 / 32) + (i14 * this.f135347c);
        int[] iArr = this.f135348d;
        iArr[i15] = (1 << (i13 & 31)) | iArr[i15];
    }

    public final void c(int i13, int i14, int i15, int i16) {
        if (i14 < 0 || i13 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i16 <= 0 || i15 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i17 = i15 + i13;
        int i18 = i16 + i14;
        if (i18 > this.f135346b || i17 > this.f135345a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i14 < i18) {
            int i19 = this.f135347c * i14;
            for (int i23 = i13; i23 < i17; i23++) {
                int i24 = (i23 / 32) + i19;
                int[] iArr = this.f135348d;
                iArr[i24] = iArr[i24] | (1 << (i23 & 31));
            }
            i14++;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f135348d.clone();
        return new b(this.f135345a, this.f135346b, this.f135347c, iArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f135345a == bVar.f135345a && this.f135346b == bVar.f135346b && this.f135347c == bVar.f135347c && Arrays.equals(this.f135348d, bVar.f135348d);
    }

    public final int hashCode() {
        int i13 = this.f135345a;
        return Arrays.hashCode(this.f135348d) + (((((((i13 * 31) + i13) * 31) + this.f135346b) * 31) + this.f135347c) * 31);
    }

    public final String toString() {
        int i13 = this.f135345a;
        int i14 = this.f135346b;
        StringBuilder sb3 = new StringBuilder((i13 + 1) * i14);
        for (int i15 = 0; i15 < i14; i15++) {
            for (int i16 = 0; i16 < i13; i16++) {
                sb3.append(a(i16, i15) ? "X " : "  ");
            }
            sb3.append("\n");
        }
        return sb3.toString();
    }

    public b(int i13, int i14, int i15, int[] iArr) {
        this.f135345a = i13;
        this.f135346b = i14;
        this.f135347c = i15;
        this.f135348d = iArr;
    }
}
