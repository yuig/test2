package hd;

import a.cb;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f68843a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68844b;

    public p(int i13, int i14) {
        this.f68843a = i13;
        this.f68844b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f68843a == pVar.f68843a && this.f68844b == pVar.f68844b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68844b) + (Integer.hashCode(this.f68843a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrimMetrics(itemsTrimmed=");
        sb3.append(this.f68843a);
        sb3.append(", dataTrimmed=");
        return cb.l(sb3, this.f68844b, ')');
    }
}
