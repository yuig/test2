package cj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f27823a;

    /* renamed from: b, reason: collision with root package name */
    public final gj0.c f27824b;

    /* renamed from: c, reason: collision with root package name */
    public final ej0.a f27825c;

    /* renamed from: d, reason: collision with root package name */
    public final o82.a0 f27826d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.a0 f27827e;

    /* renamed from: f, reason: collision with root package name */
    public final yk1.i f27828f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27829g;

    public g(int i13, gj0.c toolbarDisplayState, ej0.a headerDisplayState, o82.a0 sectionDisplayState, zy.a0 pinalyticsState, yk1.i iVar, boolean z13) {
        Intrinsics.checkNotNullParameter(toolbarDisplayState, "toolbarDisplayState");
        Intrinsics.checkNotNullParameter(headerDisplayState, "headerDisplayState");
        Intrinsics.checkNotNullParameter(sectionDisplayState, "sectionDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f27823a = i13;
        this.f27824b = toolbarDisplayState;
        this.f27825c = headerDisplayState;
        this.f27826d = sectionDisplayState;
        this.f27827e = pinalyticsState;
        this.f27828f = iVar;
        this.f27829g = z13;
    }

    public static g e(g gVar, int i13, gj0.c cVar, ej0.a aVar, o82.a0 a0Var, zy.a0 a0Var2, yk1.i iVar, boolean z13, int i14) {
        int i15 = (i14 & 1) != 0 ? gVar.f27823a : i13;
        gj0.c toolbarDisplayState = (i14 & 2) != 0 ? gVar.f27824b : cVar;
        ej0.a headerDisplayState = (i14 & 4) != 0 ? gVar.f27825c : aVar;
        o82.a0 sectionDisplayState = (i14 & 8) != 0 ? gVar.f27826d : a0Var;
        zy.a0 pinalyticsState = (i14 & 16) != 0 ? gVar.f27827e : a0Var2;
        yk1.i iVar2 = (i14 & 32) != 0 ? gVar.f27828f : iVar;
        boolean z14 = (i14 & 64) != 0 ? gVar.f27829g : z13;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(toolbarDisplayState, "toolbarDisplayState");
        Intrinsics.checkNotNullParameter(headerDisplayState, "headerDisplayState");
        Intrinsics.checkNotNullParameter(sectionDisplayState, "sectionDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new g(i15, toolbarDisplayState, headerDisplayState, sectionDisplayState, pinalyticsState, iVar2, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f27823a == gVar.f27823a && Intrinsics.d(this.f27824b, gVar.f27824b) && Intrinsics.d(this.f27825c, gVar.f27825c) && Intrinsics.d(this.f27826d, gVar.f27826d) && Intrinsics.d(this.f27827e, gVar.f27827e) && this.f27828f == gVar.f27828f && this.f27829g == gVar.f27829g;
    }

    public final int hashCode() {
        int hashCode = (this.f27827e.hashCode() + ep.b.c(this.f27826d.f93524a, (this.f27825c.hashCode() + ((this.f27824b.hashCode() + (Integer.hashCode(this.f27823a) * 31)) * 31)) * 31, 31)) * 31;
        yk1.i iVar = this.f27828f;
        return Boolean.hashCode(this.f27829g) + ((hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AutomagicalBoardDisplayState(spanCount=");
        sb3.append(this.f27823a);
        sb3.append(", toolbarDisplayState=");
        sb3.append(this.f27824b);
        sb3.append(", headerDisplayState=");
        sb3.append(this.f27825c);
        sb3.append(", sectionDisplayState=");
        sb3.append(this.f27826d);
        sb3.append(", pinalyticsState=");
        sb3.append(this.f27827e);
        sb3.append(", boardLoadState=");
        sb3.append(this.f27828f);
        sb3.append(", shouldScrollToTop=");
        return a.a.r(sb3, this.f27829g, ")");
    }
}
