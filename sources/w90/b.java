package w90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f128520a;

    /* renamed from: b, reason: collision with root package name */
    public final o82.a0 f128521b;

    /* renamed from: c, reason: collision with root package name */
    public final zy.a0 f128522c;

    public b(boolean z13, o82.a0 listDisplayState, zy.a0 pinalyticsState) {
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f128520a = z13;
        this.f128521b = listDisplayState;
        this.f128522c = pinalyticsState;
    }

    public static b e(b bVar, boolean z13, o82.a0 listDisplayState, zy.a0 pinalyticsState, int i13) {
        if ((i13 & 1) != 0) {
            z13 = bVar.f128520a;
        }
        if ((i13 & 2) != 0) {
            listDisplayState = bVar.f128521b;
        }
        if ((i13 & 4) != 0) {
            pinalyticsState = bVar.f128522c;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new b(z13, listDisplayState, pinalyticsState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f128520a == bVar.f128520a && Intrinsics.d(this.f128521b, bVar.f128521b) && Intrinsics.d(this.f128522c, bVar.f128522c);
    }

    public final int hashCode() {
        return this.f128522c.hashCode() + ep.b.c(this.f128521b.f93524a, Boolean.hashCode(this.f128520a) * 31, 31);
    }

    public final String toString() {
        return "CollageDraftPickerDisplayState(isSavingToCollage=" + this.f128520a + ", listDisplayState=" + this.f128521b + ", pinalyticsState=" + this.f128522c + ")";
    }
}
