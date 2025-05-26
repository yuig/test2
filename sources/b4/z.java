package b4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final y f21679a;

    /* renamed from: b, reason: collision with root package name */
    public final x f21680b;

    public z(y yVar, x xVar) {
        this.f21679a = yVar;
        this.f21680b = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f21680b, zVar.f21680b) && Intrinsics.d(this.f21679a, zVar.f21679a);
    }

    public final int hashCode() {
        y yVar = this.f21679a;
        int hashCode = (yVar != null ? yVar.hashCode() : 0) * 31;
        x xVar = this.f21680b;
        return hashCode + (xVar != null ? xVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f21679a + ", paragraphSyle=" + this.f21680b + ')';
    }
}
