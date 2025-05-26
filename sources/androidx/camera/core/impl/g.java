package androidx.camera.core.impl;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16841a;

    public g(Object obj) {
        this.f16841a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f16841a.equals(((g) obj).f16841a);
    }

    public final int hashCode() {
        return this.f16841a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.f16841a + "}";
    }
}
