package s30;

import kotlin.jvm.internal.Intrinsics;
import pc.t0;

/* loaded from: classes2.dex */
public final class s implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final r f111053a;

    public s(r rVar) {
        this.f111053a = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f111053a, ((s) obj).f111053a);
    }

    public final int hashCode() {
        r rVar = this.f111053a;
        if (rVar == null) {
            return 0;
        }
        return rVar.hashCode();
    }

    public final String toString() {
        return "Data(v3AndroidCubesClustersQuery=" + this.f111053a + ")";
    }
}
