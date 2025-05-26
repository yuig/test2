package androidx.camera.core.impl;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f16871a;

    public i(Throwable th3) {
        if (th3 == null) {
            throw new NullPointerException("Null error");
        }
        this.f16871a = th3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        return this.f16871a.equals(((i) obj).f16871a);
    }

    public final int hashCode() {
        return this.f16871a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ErrorWrapper{error=" + this.f16871a + "}";
    }
}
