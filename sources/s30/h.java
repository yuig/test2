package s30;

import kotlin.jvm.internal.Intrinsics;
import pc.t0;

/* loaded from: classes2.dex */
public final class h implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final g f111033a;

    public h(g gVar) {
        this.f111033a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f111033a, ((h) obj).f111033a);
    }

    public final int hashCode() {
        g gVar = this.f111033a;
        if (gVar == null) {
            return 0;
        }
        return gVar.hashCode();
    }

    public final String toString() {
        return "Data(v3AndroidCubesSignInQuery=" + this.f111033a + ")";
    }
}
