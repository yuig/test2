package p90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final a f99169a;

    /* renamed from: b, reason: collision with root package name */
    public final sa0.a f99170b;

    /* renamed from: c, reason: collision with root package name */
    public final o82.a0 f99171c;

    /* renamed from: d, reason: collision with root package name */
    public final zy.a0 f99172d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f99173e;

    public b(a toolbarState, sa0.a cutoutEditorDisplayState, o82.a0 listDisplayState, zy.a0 pinalyticsState, boolean z13) {
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(cutoutEditorDisplayState, "cutoutEditorDisplayState");
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f99169a = toolbarState;
        this.f99170b = cutoutEditorDisplayState;
        this.f99171c = listDisplayState;
        this.f99172d = pinalyticsState;
        this.f99173e = z13;
    }

    public static b e(b bVar, a aVar, sa0.a aVar2, o82.a0 a0Var, zy.a0 a0Var2, int i13) {
        if ((i13 & 1) != 0) {
            aVar = bVar.f99169a;
        }
        a toolbarState = aVar;
        if ((i13 & 2) != 0) {
            aVar2 = bVar.f99170b;
        }
        sa0.a cutoutEditorDisplayState = aVar2;
        if ((i13 & 4) != 0) {
            a0Var = bVar.f99171c;
        }
        o82.a0 listDisplayState = a0Var;
        if ((i13 & 8) != 0) {
            a0Var2 = bVar.f99172d;
        }
        zy.a0 pinalyticsState = a0Var2;
        boolean z13 = bVar.f99173e;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(cutoutEditorDisplayState, "cutoutEditorDisplayState");
        Intrinsics.checkNotNullParameter(listDisplayState, "listDisplayState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new b(toolbarState, cutoutEditorDisplayState, listDisplayState, pinalyticsState, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f99169a, bVar.f99169a) && Intrinsics.d(this.f99170b, bVar.f99170b) && Intrinsics.d(this.f99171c, bVar.f99171c) && Intrinsics.d(this.f99172d, bVar.f99172d) && this.f99173e == bVar.f99173e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99173e) + ((this.f99172d.hashCode() + ep.b.c(this.f99171c.f93524a, (this.f99170b.hashCode() + (this.f99169a.hashCode() * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CollageContentCloseupDisplayState(toolbarState=");
        sb3.append(this.f99169a);
        sb3.append(", cutoutEditorDisplayState=");
        sb3.append(this.f99170b);
        sb3.append(", listDisplayState=");
        sb3.append(this.f99171c);
        sb3.append(", pinalyticsState=");
        sb3.append(this.f99172d);
        sb3.append(", showCloseButton=");
        return a.a.r(sb3, this.f99173e, ")");
    }
}
