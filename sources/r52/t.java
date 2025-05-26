package r52;

/* loaded from: classes4.dex */
public final class t implements w {

    /* renamed from: a, reason: collision with root package name */
    public final int f106298a;

    /* renamed from: b, reason: collision with root package name */
    public final int f106299b;

    public t(int i13, int i14) {
        this.f106298a = i13;
        this.f106299b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f106298a == tVar.f106298a && this.f106299b == tVar.f106299b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f106299b) + ep.b.b(5, Integer.hashCode(this.f106298a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ShowBelowMinToast(selectedCount=");
        sb3.append(this.f106298a);
        sb3.append(", minCount=5, maxCount=");
        return a.a.n(sb3, this.f106299b, ")");
    }
}
