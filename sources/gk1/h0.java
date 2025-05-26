package gk1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f65231a;

    /* renamed from: b, reason: collision with root package name */
    public final long f65232b;

    public h0(long j13, String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        this.f65231a = pinUid;
        this.f65232b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.d(this.f65231a, h0Var.f65231a) && zn2.b.d(this.f65232b, h0Var.f65232b);
    }

    public final int hashCode() {
        int hashCode = this.f65231a.hashCode() * 31;
        zn2.a aVar = zn2.b.f142311b;
        return Long.hashCode(this.f65232b) + hashCode;
    }

    public final String toString() {
        return a.a.q(new StringBuilder("StartButtonOverlayHideTimer(pinUid="), this.f65231a, ", hideDelay=", zn2.b.o(this.f65232b), ")");
    }
}
