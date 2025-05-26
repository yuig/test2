package cn1;

import com.pinterest.gestalt.searchField.GestaltSearchField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.q f28144a;

    /* renamed from: b, reason: collision with root package name */
    public final om1.f f28145b;

    /* renamed from: c, reason: collision with root package name */
    public final u50.i0 f28146c;

    /* renamed from: d, reason: collision with root package name */
    public final dn1.a f28147d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28148e;

    public c(rm1.q qVar, om1.f fVar, u50.i0 i0Var, dn1.a aVar, int i13) {
        this(qVar, (i13 & 2) != 0 ? GestaltSearchField.f49504y : fVar, (i13 & 4) != 0 ? u50.h0.f120562a : i0Var, aVar, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f28144a == cVar.f28144a && this.f28145b == cVar.f28145b && Intrinsics.d(this.f28146c, cVar.f28146c) && this.f28147d == cVar.f28147d && this.f28148e == cVar.f28148e;
    }

    public final int hashCode() {
        int hashCode = (this.f28145b.hashCode() + (this.f28144a.hashCode() * 31)) * 31;
        u50.i0 i0Var = this.f28146c;
        return Boolean.hashCode(this.f28148e) + ((this.f28147d.hashCode() + ((hashCode + (i0Var == null ? 0 : i0Var.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActionIconButtonDisplayState(icon=");
        sb3.append(this.f28144a);
        sb3.append(", style=");
        sb3.append(this.f28145b);
        sb3.append(", contentDescription=");
        sb3.append(this.f28146c);
        sb3.append(", actionIconType=");
        sb3.append(this.f28147d);
        sb3.append(", enabled=");
        return a.a.r(sb3, this.f28148e, ")");
    }

    public c(rm1.q icon, om1.f style, u50.i0 i0Var, dn1.a actionIconType, boolean z13) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(actionIconType, "actionIconType");
        this.f28144a = icon;
        this.f28145b = style;
        this.f28146c = i0Var;
        this.f28147d = actionIconType;
        this.f28148e = z13;
    }
}
