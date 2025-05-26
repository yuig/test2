package p50;

import kotlin.jvm.internal.Intrinsics;
import pc.i0;

/* loaded from: classes5.dex */
public final class u implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final t f98887a;

    public u(t tVar) {
        this.f98887a = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f98887a, ((u) obj).f98887a);
    }

    public final int hashCode() {
        t tVar = this.f98887a;
        if (tVar == null) {
            return 0;
        }
        return tVar.hashCode();
    }

    public final String toString() {
        return "Data(v3WidgetTapsMutation=" + this.f98887a + ")";
    }
}
