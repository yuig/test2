package is1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b0 extends g0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f73575a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f73576b;

    public b0(String pinId, Throwable error) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f73575a = pinId;
        this.f73576b = error;
    }

    @Override // is1.g0
    public final String a() {
        return this.f73575a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.d(this.f73575a, b0Var.f73575a) && Intrinsics.d(this.f73576b, b0Var.f73576b);
    }

    public final int hashCode() {
        return this.f73576b.hashCode() + (this.f73575a.hashCode() * 31);
    }

    public final String toString() {
        return "Error(pinId=" + this.f73575a + ", error=" + this.f73576b + ")";
    }
}
