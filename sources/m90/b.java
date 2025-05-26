package m90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f86624a;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f86625b;

    /* renamed from: c, reason: collision with root package name */
    public final o82.a0 f86626c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f86627d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f86628e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f86629f;

    /* renamed from: g, reason: collision with root package name */
    public final zy.a0 f86630g;

    public b(u50.i0 title, e1 searchDisplayState, o82.a0 listDisplayState, boolean z13, boolean z14, boolean z15, zy.a0 pinalyticsState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(searchDisplayState, "searchDisplayState");
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f86624a = title;
        this.f86625b = searchDisplayState;
        this.f86626c = listDisplayState;
        this.f86627d = z13;
        this.f86628e = z14;
        this.f86629f = z15;
        this.f86630g = pinalyticsState;
    }

    public static b e(b bVar, o82.a0 a0Var, boolean z13, zy.a0 a0Var2, int i13) {
        u50.i0 title = bVar.f86624a;
        e1 searchDisplayState = bVar.f86625b;
        if ((i13 & 4) != 0) {
            a0Var = bVar.f86626c;
        }
        o82.a0 listDisplayState = a0Var;
        boolean z14 = bVar.f86627d;
        boolean z15 = bVar.f86628e;
        if ((i13 & 32) != 0) {
            z13 = bVar.f86629f;
        }
        boolean z16 = z13;
        if ((i13 & 64) != 0) {
            a0Var2 = bVar.f86630g;
        }
        zy.a0 pinalyticsState = a0Var2;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(searchDisplayState, "searchDisplayState");
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new b(title, searchDisplayState, listDisplayState, z14, z15, z16, pinalyticsState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f86624a, bVar.f86624a) && Intrinsics.d(this.f86625b, bVar.f86625b) && Intrinsics.d(this.f86626c, bVar.f86626c) && this.f86627d == bVar.f86627d && this.f86628e == bVar.f86628e && this.f86629f == bVar.f86629f && Intrinsics.d(this.f86630g, bVar.f86630g);
    }

    public final int hashCode() {
        return this.f86630g.hashCode() + ep.b.e(this.f86629f, ep.b.e(this.f86628e, ep.b.e(this.f86627d, ep.b.c(this.f86626c.f93524a, (this.f86625b.hashCode() + (this.f86624a.hashCode() * 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "CollageContentBrowseDisplayState(title=" + this.f86624a + ", searchDisplayState=" + this.f86625b + ", listDisplayState=" + this.f86626c + ", showBackButton=" + this.f86627d + ", showCloseButton=" + this.f86628e + ", showOnboarding=" + this.f86629f + ", pinalyticsState=" + this.f86630g + ")";
    }
}
