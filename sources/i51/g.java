package i51;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f71584a;

    /* renamed from: b, reason: collision with root package name */
    public final u41.e f71585b;

    /* renamed from: c, reason: collision with root package name */
    public final x31.a f71586c;

    /* renamed from: d, reason: collision with root package name */
    public final x31.c f71587d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f71588e;

    /* renamed from: f, reason: collision with root package name */
    public final bq.b f71589f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f71590g;

    public g(boolean z13, u41.e eVar, x31.a aVar, x31.c filterBarDisplayState, boolean z14, bq.b currentSortOrder, boolean z15) {
        Intrinsics.checkNotNullParameter(filterBarDisplayState, "filterBarDisplayState");
        Intrinsics.checkNotNullParameter(currentSortOrder, "currentSortOrder");
        this.f71584a = z13;
        this.f71585b = eVar;
        this.f71586c = aVar;
        this.f71587d = filterBarDisplayState;
        this.f71588e = z14;
        this.f71589f = currentSortOrder;
        this.f71590g = z15;
    }

    public static g e(g gVar, boolean z13, u41.e eVar, x31.a aVar, x31.c cVar, boolean z14, bq.b bVar, boolean z15, int i13) {
        boolean z16 = (i13 & 1) != 0 ? gVar.f71584a : z13;
        u41.e eVar2 = (i13 & 2) != 0 ? gVar.f71585b : eVar;
        x31.a aVar2 = (i13 & 4) != 0 ? gVar.f71586c : aVar;
        x31.c filterBarDisplayState = (i13 & 8) != 0 ? gVar.f71587d : cVar;
        boolean z17 = (i13 & 16) != 0 ? gVar.f71588e : z14;
        bq.b currentSortOrder = (i13 & 32) != 0 ? gVar.f71589f : bVar;
        boolean z18 = (i13 & 64) != 0 ? gVar.f71590g : z15;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(filterBarDisplayState, "filterBarDisplayState");
        Intrinsics.checkNotNullParameter(currentSortOrder, "currentSortOrder");
        return new g(z16, eVar2, aVar2, filterBarDisplayState, z17, currentSortOrder, z18);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f71584a == gVar.f71584a && Intrinsics.d(this.f71585b, gVar.f71585b) && Intrinsics.d(this.f71586c, gVar.f71586c) && Intrinsics.d(this.f71587d, gVar.f71587d) && this.f71588e == gVar.f71588e && this.f71589f == gVar.f71589f && this.f71590g == gVar.f71590g;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f71584a) * 31;
        u41.e eVar = this.f71585b;
        int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        x31.a aVar = this.f71586c;
        return Boolean.hashCode(this.f71590g) + ((this.f71589f.hashCode() + ep.b.e(this.f71588e, (this.f71587d.hashCode() + ((hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProfileSavedTabDisplayState(showFilterBar=");
        sb3.append(this.f71584a);
        sb3.append(", sortButtonDisplayState=");
        sb3.append(this.f71585b);
        sb3.append(", selectedFilter=");
        sb3.append(this.f71586c);
        sb3.append(", filterBarDisplayState=");
        sb3.append(this.f71587d);
        sb3.append(", showSortActionSheet=");
        sb3.append(this.f71588e);
        sb3.append(", currentSortOrder=");
        sb3.append(this.f71589f);
        sb3.append(", needsRefresh=");
        return a.a.r(sb3, this.f71590g, ")");
    }
}
