package w41;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final f31.j f128023a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f128024b;

    /* renamed from: c, reason: collision with root package name */
    public final o82.a0 f128025c;

    /* renamed from: d, reason: collision with root package name */
    public final l f128026d;

    /* renamed from: e, reason: collision with root package name */
    public final y0 f128027e;

    /* renamed from: f, reason: collision with root package name */
    public final k51.o f128028f;

    /* renamed from: g, reason: collision with root package name */
    public final zy.a0 f128029g;

    public k(f31.j searchBarDisplayState, a0 filterBarDisplayState, o82.a0 listDisplayState, l emptyDisplayState, y0 offlineDisplayState, k51.o viewOptionsDisplayState, zy.a0 pinalyticsDisplayState) {
        Intrinsics.checkNotNullParameter(searchBarDisplayState, "searchBarDisplayState");
        Intrinsics.checkNotNullParameter(filterBarDisplayState, "filterBarDisplayState");
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(emptyDisplayState, "emptyDisplayState");
        Intrinsics.checkNotNullParameter(offlineDisplayState, "offlineDisplayState");
        Intrinsics.checkNotNullParameter(viewOptionsDisplayState, "viewOptionsDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        this.f128023a = searchBarDisplayState;
        this.f128024b = filterBarDisplayState;
        this.f128025c = listDisplayState;
        this.f128026d = emptyDisplayState;
        this.f128027e = offlineDisplayState;
        this.f128028f = viewOptionsDisplayState;
        this.f128029g = pinalyticsDisplayState;
    }

    public static k e(k kVar, f31.j jVar, a0 a0Var, o82.a0 a0Var2, l lVar, x0 x0Var, k51.o oVar, zy.a0 a0Var3, int i13) {
        f31.j searchBarDisplayState = (i13 & 1) != 0 ? kVar.f128023a : jVar;
        a0 filterBarDisplayState = (i13 & 2) != 0 ? kVar.f128024b : a0Var;
        o82.a0 listDisplayState = (i13 & 4) != 0 ? kVar.f128025c : a0Var2;
        l emptyDisplayState = (i13 & 8) != 0 ? kVar.f128026d : lVar;
        y0 offlineDisplayState = (i13 & 16) != 0 ? kVar.f128027e : x0Var;
        k51.o viewOptionsDisplayState = (i13 & 32) != 0 ? kVar.f128028f : oVar;
        zy.a0 pinalyticsDisplayState = (i13 & 64) != 0 ? kVar.f128029g : a0Var3;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(searchBarDisplayState, "searchBarDisplayState");
        Intrinsics.checkNotNullParameter(filterBarDisplayState, "filterBarDisplayState");
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(emptyDisplayState, "emptyDisplayState");
        Intrinsics.checkNotNullParameter(offlineDisplayState, "offlineDisplayState");
        Intrinsics.checkNotNullParameter(viewOptionsDisplayState, "viewOptionsDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        return new k(searchBarDisplayState, filterBarDisplayState, listDisplayState, emptyDisplayState, offlineDisplayState, viewOptionsDisplayState, pinalyticsDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f128023a, kVar.f128023a) && Intrinsics.d(this.f128024b, kVar.f128024b) && Intrinsics.d(this.f128025c, kVar.f128025c) && Intrinsics.d(this.f128026d, kVar.f128026d) && Intrinsics.d(this.f128027e, kVar.f128027e) && Intrinsics.d(this.f128028f, kVar.f128028f) && Intrinsics.d(this.f128029g, kVar.f128029g);
    }

    public final int hashCode() {
        return this.f128029g.hashCode() + ((this.f128028f.hashCode() + ((this.f128027e.hashCode() + ((this.f128026d.hashCode() + ep.b.c(this.f128025c.f93524a, (this.f128024b.hashCode() + (this.f128023a.hashCode() * 31)) * 31, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ProfilePinsDisplayState(searchBarDisplayState=" + this.f128023a + ", filterBarDisplayState=" + this.f128024b + ", listDisplayState=" + this.f128025c + ", emptyDisplayState=" + this.f128026d + ", offlineDisplayState=" + this.f128027e + ", viewOptionsDisplayState=" + this.f128028f + ", pinalyticsDisplayState=" + this.f128029g + ")";
    }
}
