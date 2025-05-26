package m30;

import kotlin.jvm.internal.Intrinsics;
import pc.t0;

/* loaded from: classes2.dex */
public final class h implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final d f85754a;

    public h(d dVar) {
        this.f85754a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f85754a, ((h) obj).f85754a);
    }

    public final int hashCode() {
        d dVar = this.f85754a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    public final String toString() {
        return "Data(v3GetPinQuery=" + this.f85754a + ")";
    }
}
