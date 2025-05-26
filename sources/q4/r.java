package q4;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f102354a;

    public r(boolean z13, boolean z14, a0 a0Var, boolean z15) {
        this.f102354a = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        rVar.getClass();
        return this.f102354a == rVar.f102354a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ep.b.e(true, (this.f102354a.hashCode() + ep.b.e(true, Boolean.hashCode(true) * 31, 31)) * 31, 31);
    }
}
