package b2;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final m4.h f21180a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21181b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21182c;

    public n(m4.h hVar, int i13, long j13) {
        this.f21180a = hVar;
        this.f21181b = i13;
        this.f21182c = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f21180a == nVar.f21180a && this.f21181b == nVar.f21181b && this.f21182c == nVar.f21182c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21182c) + ep.b.b(this.f21181b, this.f21180a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f21180a + ", offset=" + this.f21181b + ", selectableId=" + this.f21182c + ')';
    }
}
