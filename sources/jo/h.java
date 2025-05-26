package jo;

import a.cb;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f77141a;

    /* renamed from: b, reason: collision with root package name */
    public final int f77142b;

    public h(int i13, int i14) {
        this.f77141a = i13;
        this.f77142b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f77141a == hVar.f77141a && this.f77142b == hVar.f77142b;
    }

    public final int hashCode() {
        return (this.f77141a * 31) + this.f77142b;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("[");
        sb3.append(this.f77141a);
        sb3.append(",");
        return cb.l(sb3, this.f77142b, ']');
    }
}
