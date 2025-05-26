package sk;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final a f113037c = new a(new int[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f113038a;

    /* renamed from: b, reason: collision with root package name */
    public final int f113039b;

    public a(int[] iArr) {
        int length = iArr.length;
        this.f113038a = iArr;
        this.f113039b = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i13 = aVar.f113039b;
        int i14 = this.f113039b;
        if (i14 != i13) {
            return false;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            bf.b.l(i15, i14);
            int i16 = this.f113038a[i15];
            bf.b.l(i15, aVar.f113039b);
            if (i16 != aVar.f113038a[i15]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i13 = 1;
        for (int i14 = 0; i14 < this.f113039b; i14++) {
            i13 = (i13 * 31) + this.f113038a[i14];
        }
        return i13;
    }

    public Object readResolve() {
        return this.f113039b == 0 ? f113037c : this;
    }

    public final String toString() {
        int i13 = this.f113039b;
        if (i13 == 0) {
            return "[]";
        }
        StringBuilder sb3 = new StringBuilder(i13 * 5);
        sb3.append('[');
        int[] iArr = this.f113038a;
        sb3.append(iArr[0]);
        for (int i14 = 1; i14 < i13; i14++) {
            sb3.append(", ");
            sb3.append(iArr[i14]);
        }
        sb3.append(']');
        return sb3.toString();
    }

    public Object writeReplace() {
        int[] iArr = this.f113038a;
        int length = iArr.length;
        int i13 = this.f113039b;
        return i13 < length ? new a(Arrays.copyOfRange(iArr, 0, i13)) : this;
    }
}
