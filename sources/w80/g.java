package w80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.q f128288a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f128289b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f128290c;

    /* renamed from: d, reason: collision with root package name */
    public final int f128291d;

    /* renamed from: e, reason: collision with root package name */
    public final int f128292e;

    public g(rm1.q icon, u50.i0 label, boolean z13, int i13, int i14) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f128288a = icon;
        this.f128289b = label;
        this.f128290c = z13;
        this.f128291d = i13;
        this.f128292e = i14;
    }

    public static g e(g gVar, u50.i0 i0Var, boolean z13, int i13) {
        rm1.q icon = gVar.f128288a;
        if ((i13 & 2) != 0) {
            i0Var = gVar.f128289b;
        }
        u50.i0 label = i0Var;
        int i14 = gVar.f128291d;
        int i15 = gVar.f128292e;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(label, "label");
        return new g(icon, label, z13, i14, i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f128288a == gVar.f128288a && Intrinsics.d(this.f128289b, gVar.f128289b) && this.f128290c == gVar.f128290c && this.f128291d == gVar.f128291d && this.f128292e == gVar.f128292e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f128292e) + ep.b.b(this.f128291d, ep.b.e(this.f128290c, ep.b.d(this.f128289b, this.f128288a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CollageComposerTopBarActionState(icon=");
        sb3.append(this.f128288a);
        sb3.append(", label=");
        sb3.append(this.f128289b);
        sb3.append(", enabled=");
        sb3.append(this.f128290c);
        sb3.append(", id=");
        sb3.append(this.f128291d);
        sb3.append(", contentDescription=");
        return a.a.n(sb3, this.f128292e, ")");
    }

    public /* synthetic */ g(rm1.q qVar, int i13, int i14) {
        this(qVar, u50.h0.f120562a, true, i13, i14);
    }
}
