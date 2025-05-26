package p50;

import kotlin.jvm.internal.Intrinsics;
import pc.t0;

/* loaded from: classes5.dex */
public final class p implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final m f98879a;

    public p(m mVar) {
        this.f98879a = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f98879a, ((p) obj).f98879a);
    }

    public final int hashCode() {
        m mVar = this.f98879a;
        if (mVar == null) {
            return 0;
        }
        return mVar.hashCode();
    }

    public final String toString() {
        return "Data(v3AndroidWidgetGetHomefeedPinsQuery=" + this.f98879a + ")";
    }
}
