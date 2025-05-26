package androidx.compose.foundation.lazy.layout;

import a.cb;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f17244a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17245b;

    public h(int i13, int i14) {
        this.f17244a = i13;
        this.f17245b = i14;
        if (i13 < 0) {
            throw new IllegalArgumentException("negative start index".toString());
        }
        if (i14 < i13) {
            throw new IllegalArgumentException("end index greater than start".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f17244a == hVar.f17244a && this.f17245b == hVar.f17245b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17245b) + (Integer.hashCode(this.f17244a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Interval(start=");
        sb3.append(this.f17244a);
        sb3.append(", end=");
        return cb.l(sb3, this.f17245b, ')');
    }
}
