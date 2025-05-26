package hb2;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f68551a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68552b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f68553c = false;

    public f(int i13, int i14) {
        this.f68551a = i13;
        this.f68552b = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f68551a == fVar.f68551a && this.f68552b == fVar.f68552b && this.f68553c == fVar.f68553c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f68553c) + ep.b.b(this.f68552b, Integer.hashCode(this.f68551a) * 31, 31);
    }

    public final String toString() {
        return "ExpandableItem(id=" + this.f68551a + ", margin=" + this.f68552b + ", isSelected=" + this.f68553c + ")";
    }
}
