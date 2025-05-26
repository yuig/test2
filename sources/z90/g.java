package z90;

import kotlin.jvm.internal.Intrinsics;
import rm1.q;
import u50.h0;
import u50.i0;
import u50.o;

/* loaded from: classes5.dex */
public final class g implements o {

    /* renamed from: a, reason: collision with root package name */
    public final q f141352a;

    /* renamed from: b, reason: collision with root package name */
    public final rm1.c f141353b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f141354c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f141355d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f141356e;

    public g(q icon, rm1.c iconColor, i0 label, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f141352a = icon;
        this.f141353b = iconColor;
        this.f141354c = label;
        this.f141355d = z13;
        this.f141356e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f141352a == gVar.f141352a && this.f141353b == gVar.f141353b && Intrinsics.d(this.f141354c, gVar.f141354c) && this.f141355d == gVar.f141355d && this.f141356e == gVar.f141356e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f141356e) + ep.b.e(this.f141355d, ep.b.d(this.f141354c, (this.f141353b.hashCode() + (this.f141352a.hashCode() * 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EffectToolState(icon=");
        sb3.append(this.f141352a);
        sb3.append(", iconColor=");
        sb3.append(this.f141353b);
        sb3.append(", label=");
        sb3.append(this.f141354c);
        sb3.append(", selected=");
        sb3.append(this.f141355d);
        sb3.append(", highlighted=");
        return a.a.r(sb3, this.f141356e, ")");
    }

    public /* synthetic */ g(q qVar, rm1.c cVar, i0 i0Var, boolean z13, boolean z14, int i13) {
        this(qVar, (i13 & 2) != 0 ? rm1.c.DEFAULT : cVar, (i13 & 4) != 0 ? h0.f120562a : i0Var, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? false : z14);
    }
}
