package r1;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final int f105849a;

    public b(int i13) {
        this.f105849a = i13;
        if (i13 <= 0) {
            throw new IllegalArgumentException(a.a.e("Provided count ", i13, " should be larger than zero").toString());
        }
    }

    public final ArrayList a(int i13, int i14) {
        int i15 = this.f105849a;
        int i16 = i13 - ((i15 - 1) * i14);
        int i17 = i16 / i15;
        int i18 = i16 % i15;
        ArrayList arrayList = new ArrayList(i15);
        int i19 = 0;
        while (i19 < i15) {
            arrayList.add(Integer.valueOf((i19 < i18 ? 1 : 0) + i17));
            i19++;
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            if (this.f105849a == ((b) obj).f105849a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return -this.f105849a;
    }
}
