package h90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final o82.a0 f68241a;

    /* renamed from: b, reason: collision with root package name */
    public final zy.a0 f68242b;

    public d(o82.a0 listDisplayState, zy.a0 pinalyticsDisplayState) {
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        this.f68241a = listDisplayState;
        this.f68242b = pinalyticsDisplayState;
    }

    public static d e(d dVar, o82.a0 listDisplayState, zy.a0 pinalyticsDisplayState, int i13) {
        if ((i13 & 1) != 0) {
            listDisplayState = dVar.f68241a;
        }
        if ((i13 & 2) != 0) {
            pinalyticsDisplayState = dVar.f68242b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        return new d(listDisplayState, pinalyticsDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f68241a, dVar.f68241a) && Intrinsics.d(this.f68242b, dVar.f68242b);
    }

    public final zy.a0 f() {
        return this.f68242b;
    }

    public final int hashCode() {
        return this.f68242b.hashCode() + (this.f68241a.f93524a.hashCode() * 31);
    }

    public final String toString() {
        return "CutoutCloseupItemDisplayState(listDisplayState=" + this.f68241a + ", pinalyticsDisplayState=" + this.f68242b + ")";
    }
}
