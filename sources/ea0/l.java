package ea0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f57972a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f57973b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f57974c;

    /* renamed from: d, reason: collision with root package name */
    public final o82.a0 f57975d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.a0 f57976e;

    public l(u50.i0 title, boolean z13, boolean z14, o82.a0 sectionDisplayState, zy.a0 pinalyticsState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sectionDisplayState, "sectionDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f57972a = title;
        this.f57973b = z13;
        this.f57974c = z14;
        this.f57975d = sectionDisplayState;
        this.f57976e = pinalyticsState;
    }

    public static l e(l lVar, boolean z13, o82.a0 a0Var, zy.a0 a0Var2, int i13) {
        u50.i0 title = lVar.f57972a;
        boolean z14 = lVar.f57973b;
        if ((i13 & 4) != 0) {
            z13 = lVar.f57974c;
        }
        boolean z15 = z13;
        if ((i13 & 8) != 0) {
            a0Var = lVar.f57975d;
        }
        o82.a0 sectionDisplayState = a0Var;
        if ((i13 & 16) != 0) {
            a0Var2 = lVar.f57976e;
        }
        zy.a0 pinalyticsState = a0Var2;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sectionDisplayState, "sectionDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new l(title, z14, z15, sectionDisplayState, pinalyticsState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Intrinsics.d(this.f57972a, lVar.f57972a) && this.f57973b == lVar.f57973b && this.f57974c == lVar.f57974c && Intrinsics.d(this.f57975d, lVar.f57975d) && Intrinsics.d(this.f57976e, lVar.f57976e);
    }

    public final int hashCode() {
        return this.f57976e.hashCode() + ep.b.c(this.f57975d.f93524a, ep.b.e(this.f57974c, ep.b.e(this.f57973b, this.f57972a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "RemixBrowseDisplayState(title=" + this.f57972a + ", showTitleBar=" + this.f57973b + ", showLoadingSpinnerOverlay=" + this.f57974c + ", sectionDisplayState=" + this.f57975d + ", pinalyticsState=" + this.f57976e + ")";
    }
}
