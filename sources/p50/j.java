package p50;

import kotlin.jvm.internal.Intrinsics;
import pc.t0;

/* loaded from: classes5.dex */
public final class j implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f98869a;

    public j(b bVar) {
        this.f98869a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f98869a, ((j) obj).f98869a);
    }

    public final int hashCode() {
        b bVar = this.f98869a;
        if (bVar == null) {
            return 0;
        }
        return bVar.hashCode();
    }

    public final String toString() {
        return "Data(v3AndroidWidgetGetBoardPinsQuery=" + this.f98869a + ")";
    }
}
