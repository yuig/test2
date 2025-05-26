package qm1;

import kotlin.jvm.internal.Intrinsics;
import rm1.q;
import u50.o;

/* loaded from: classes5.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final q f104382a;

    /* renamed from: b, reason: collision with root package name */
    public final d f104383b;

    /* renamed from: c, reason: collision with root package name */
    public final fm1.c f104384c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f104385d;

    /* renamed from: e, reason: collision with root package name */
    public final int f104386e;

    public b(q icon, d selected, fm1.c visibility, boolean z13, int i13) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(selected, "selected");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        this.f104382a = icon;
        this.f104383b = selected;
        this.f104384c = visibility;
        this.f104385d = z13;
        this.f104386e = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f104382a == bVar.f104382a && this.f104383b == bVar.f104383b && this.f104384c == bVar.f104384c && this.f104385d == bVar.f104385d && this.f104386e == bVar.f104386e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f104386e) + ep.b.e(this.f104385d, d7.g.a(this.f104384c, (this.f104383b.hashCode() + (this.f104382a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(icon=");
        sb3.append(this.f104382a);
        sb3.append(", selected=");
        sb3.append(this.f104383b);
        sb3.append(", visibility=");
        sb3.append(this.f104384c);
        sb3.append(", enabled=");
        sb3.append(this.f104385d);
        sb3.append(", id=");
        return a.a.n(sb3, this.f104386e, ")");
    }
}
