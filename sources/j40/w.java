package j40;

import kotlin.jvm.internal.Intrinsics;
import pc.t0;

/* loaded from: classes5.dex */
public final class w implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final k f74631a;

    public w(k kVar) {
        this.f74631a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && Intrinsics.d(this.f74631a, ((w) obj).f74631a);
    }

    public final int hashCode() {
        k kVar = this.f74631a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public final String toString() {
        return "Data(v3OrientationTopicsQuery=" + this.f74631a + ")";
    }
}
