package bk1;

/* loaded from: classes2.dex */
public final class z implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23386a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23387b;

    public z(boolean z13) {
        long currentTimeMillis = System.currentTimeMillis() * 1000000;
        this.f23386a = z13;
        this.f23387b = currentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f23386a == zVar.f23386a && this.f23387b == zVar.f23387b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23387b) + (Boolean.hashCode(this.f23386a) * 31);
    }

    public final long i() {
        return this.f23387b;
    }

    public final boolean j() {
        return this.f23386a;
    }

    public final String toString() {
        return "OnHandleTapFromWrapper(fromEndFrame=" + this.f23386a + ", clickThroughStartTimestamp=" + this.f23387b + ")";
    }
}
