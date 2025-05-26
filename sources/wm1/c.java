package wm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f130267a;

    /* renamed from: b, reason: collision with root package name */
    public final z f130268b;

    /* renamed from: c, reason: collision with root package name */
    public final s f130269c;

    /* renamed from: d, reason: collision with root package name */
    public final n f130270d;

    /* renamed from: e, reason: collision with root package name */
    public final fm1.c f130271e;

    /* renamed from: f, reason: collision with root package name */
    public final u50.i0 f130272f;

    /* renamed from: g, reason: collision with root package name */
    public final int f130273g;

    public c(boolean z13, z startItem, s middleItem, n endItem, fm1.c visibility, u50.i0 i0Var, int i13) {
        Intrinsics.checkNotNullParameter(startItem, "startItem");
        Intrinsics.checkNotNullParameter(middleItem, "middleItem");
        Intrinsics.checkNotNullParameter(endItem, "endItem");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f130267a = z13;
        this.f130268b = startItem;
        this.f130269c = middleItem;
        this.f130270d = endItem;
        this.f130271e = visibility;
        this.f130272f = i0Var;
        this.f130273g = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f130267a == cVar.f130267a && Intrinsics.d(this.f130268b, cVar.f130268b) && Intrinsics.d(this.f130269c, cVar.f130269c) && Intrinsics.d(this.f130270d, cVar.f130270d) && this.f130271e == cVar.f130271e && Intrinsics.d(this.f130272f, cVar.f130272f) && this.f130273g == cVar.f130273g;
    }

    public final int hashCode() {
        int a13 = d7.g.a(this.f130271e, (this.f130270d.hashCode() + ((this.f130269c.hashCode() + ((this.f130268b.hashCode() + (Boolean.hashCode(this.f130267a) * 31)) * 31)) * 31)) * 31, 31);
        u50.i0 i0Var = this.f130272f;
        return Integer.hashCode(this.f130273g) + ((a13 + (i0Var == null ? 0 : i0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(showIndicator=");
        sb3.append(this.f130267a);
        sb3.append(", startItem=");
        sb3.append(this.f130268b);
        sb3.append(", middleItem=");
        sb3.append(this.f130269c);
        sb3.append(", endItem=");
        sb3.append(this.f130270d);
        sb3.append(", visibility=");
        sb3.append(this.f130271e);
        sb3.append(", contentDescription=");
        sb3.append(this.f130272f);
        sb3.append(", id=");
        return a.a.n(sb3, this.f130273g, ")");
    }
}
