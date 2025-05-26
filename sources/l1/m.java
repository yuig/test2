package l1;

/* loaded from: classes2.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    public final long f81352a;

    public m(long j13) {
        this.f81352a = j13;
        if (!com.bumptech.glide.c.y0(j13)) {
            throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return a3.c.b(this.f81352a, ((m) obj).f81352a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f81352a);
    }

    public final String toString() {
        return "Open(offset=" + ((Object) a3.c.j(this.f81352a)) + ')';
    }
}
