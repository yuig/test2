package la0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final o82.a0 f82396a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f82397b;

    /* renamed from: c, reason: collision with root package name */
    public final u50.i0 f82398c;

    /* renamed from: d, reason: collision with root package name */
    public final u50.i0 f82399d;

    /* renamed from: e, reason: collision with root package name */
    public final x31.c f82400e;

    /* renamed from: f, reason: collision with root package name */
    public final zy.a0 f82401f;

    /* renamed from: g, reason: collision with root package name */
    public final zy.b f82402g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f82403h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f82404i;

    public g(o82.a0 listDisplayState, boolean z13, u50.i0 emptyStateTitle, u50.i0 emptyStateMessage, x31.c filterBarDisplayState, zy.a0 pinalyticsState, zy.b impressionDisplayState, Set availableOptions, boolean z14) {
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(emptyStateTitle, "emptyStateTitle");
        Intrinsics.checkNotNullParameter(emptyStateMessage, "emptyStateMessage");
        Intrinsics.checkNotNullParameter(filterBarDisplayState, "filterBarDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(impressionDisplayState, "impressionDisplayState");
        Intrinsics.checkNotNullParameter(availableOptions, "availableOptions");
        this.f82396a = listDisplayState;
        this.f82397b = z13;
        this.f82398c = emptyStateTitle;
        this.f82399d = emptyStateMessage;
        this.f82400e = filterBarDisplayState;
        this.f82401f = pinalyticsState;
        this.f82402g = impressionDisplayState;
        this.f82403h = availableOptions;
        this.f82404i = z14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [u50.i0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [u50.i0] */
    public static g e(g gVar, o82.a0 a0Var, u50.k0 k0Var, u50.k0 k0Var2, x31.c cVar, zy.a0 a0Var2, boolean z13, int i13) {
        o82.a0 listDisplayState = (i13 & 1) != 0 ? gVar.f82396a : a0Var;
        boolean z14 = gVar.f82397b;
        u50.k0 emptyStateTitle = (i13 & 4) != 0 ? gVar.f82398c : k0Var;
        u50.k0 emptyStateMessage = (i13 & 8) != 0 ? gVar.f82399d : k0Var2;
        x31.c filterBarDisplayState = (i13 & 16) != 0 ? gVar.f82400e : cVar;
        zy.a0 pinalyticsState = (i13 & 32) != 0 ? gVar.f82401f : a0Var2;
        zy.b impressionDisplayState = gVar.f82402g;
        Set availableOptions = gVar.f82403h;
        boolean z15 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? gVar.f82404i : z13;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(emptyStateTitle, "emptyStateTitle");
        Intrinsics.checkNotNullParameter(emptyStateMessage, "emptyStateMessage");
        Intrinsics.checkNotNullParameter(filterBarDisplayState, "filterBarDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(impressionDisplayState, "impressionDisplayState");
        Intrinsics.checkNotNullParameter(availableOptions, "availableOptions");
        return new g(listDisplayState, z14, emptyStateTitle, emptyStateMessage, filterBarDisplayState, pinalyticsState, impressionDisplayState, availableOptions, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f82396a, gVar.f82396a) && this.f82397b == gVar.f82397b && Intrinsics.d(this.f82398c, gVar.f82398c) && Intrinsics.d(this.f82399d, gVar.f82399d) && Intrinsics.d(this.f82400e, gVar.f82400e) && Intrinsics.d(this.f82401f, gVar.f82401f) && Intrinsics.d(this.f82402g, gVar.f82402g) && Intrinsics.d(this.f82403h, gVar.f82403h) && this.f82404i == gVar.f82404i;
    }

    public final int hashCode() {
        int hashCode = (this.f82401f.hashCode() + ((this.f82400e.hashCode() + ep.b.d(this.f82399d, ep.b.d(this.f82398c, ep.b.e(this.f82397b, this.f82396a.f93524a.hashCode() * 31, 31), 31), 31)) * 31)) * 31;
        this.f82402g.getClass();
        return Boolean.hashCode(this.f82404i) + ((this.f82403h.hashCode() + ((hashCode + 172602875) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CollageRetrievalFeedDisplayState(listDisplayState=");
        sb3.append(this.f82396a);
        sb3.append(", showFilters=");
        sb3.append(this.f82397b);
        sb3.append(", emptyStateTitle=");
        sb3.append(this.f82398c);
        sb3.append(", emptyStateMessage=");
        sb3.append(this.f82399d);
        sb3.append(", filterBarDisplayState=");
        sb3.append(this.f82400e);
        sb3.append(", pinalyticsState=");
        sb3.append(this.f82401f);
        sb3.append(", impressionDisplayState=");
        sb3.append(this.f82402g);
        sb3.append(", availableOptions=");
        sb3.append(this.f82403h);
        sb3.append(", isProgressOverlayVisible=");
        return a.a.r(sb3, this.f82404i, ")");
    }
}
