package d0;

import c0.n0;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final s f53510a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f53511b;

    public f(s sVar, n0 n0Var) {
        if (sVar == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f53510a = sVar;
        this.f53511b = n0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f53510a.equals(fVar.f53510a) && this.f53511b.equals(fVar.f53511b);
    }

    public final int hashCode() {
        return ((this.f53510a.hashCode() ^ 1000003) * 1000003) ^ this.f53511b.hashCode();
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.f53510a + ", imageProxy=" + this.f53511b + "}";
    }
}
