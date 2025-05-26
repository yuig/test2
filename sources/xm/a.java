package xm;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a implements Cloneable {

    /* renamed from: b, reason: collision with root package name */
    public int f135344b = 0;

    /* renamed from: a, reason: collision with root package name */
    public int[] f135343a = new int[1];

    public final void a(boolean z13) {
        c(this.f135344b + 1);
        if (z13) {
            int[] iArr = this.f135343a;
            int i13 = this.f135344b;
            int i14 = i13 / 32;
            iArr[i14] = (1 << (i13 & 31)) | iArr[i14];
        }
        this.f135344b++;
    }

    public final void b(int i13, int i14) {
        if (i14 < 0 || i14 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        c(this.f135344b + i14);
        while (i14 > 0) {
            boolean z13 = true;
            if (((i13 >> (i14 - 1)) & 1) != 1) {
                z13 = false;
            }
            a(z13);
            i14--;
        }
    }

    public final void c(int i13) {
        int[] iArr = this.f135343a;
        if (i13 > (iArr.length << 5)) {
            int[] iArr2 = new int[(i13 + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f135343a = iArr2;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f135343a.clone();
        int i13 = this.f135344b;
        a aVar = new a();
        aVar.f135343a = iArr;
        aVar.f135344b = i13;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f135344b == aVar.f135344b && Arrays.equals(this.f135343a, aVar.f135343a);
    }

    public final boolean g(int i13) {
        return ((1 << (i13 & 31)) & this.f135343a[i13 / 32]) != 0;
    }

    public final int h() {
        return (this.f135344b + 7) / 8;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f135343a) + (this.f135344b * 31);
    }

    public final String toString() {
        int i13 = this.f135344b;
        StringBuilder sb3 = new StringBuilder((i13 / 8) + i13 + 1);
        for (int i14 = 0; i14 < this.f135344b; i14++) {
            if ((i14 & 7) == 0) {
                sb3.append(' ');
            }
            sb3.append(g(i14) ? 'X' : '.');
        }
        return sb3.toString();
    }
}
