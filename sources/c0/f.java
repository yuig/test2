package c0;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f24233a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f24234b;

    public f(int i13, Throwable th3) {
        this.f24233a = i13;
        this.f24234b = th3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f24233a == fVar.f24233a) {
            Throwable th3 = fVar.f24234b;
            Throwable th4 = this.f24234b;
            if (th4 == null) {
                if (th3 == null) {
                    return true;
                }
            } else if (th4.equals(th3)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i13 = (this.f24233a ^ 1000003) * 1000003;
        Throwable th3 = this.f24234b;
        return i13 ^ (th3 == null ? 0 : th3.hashCode());
    }

    public final String toString() {
        return "StateError{code=" + this.f24233a + ", cause=" + this.f24234b + "}";
    }
}
