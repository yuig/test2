package br0;

import a.cb;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rm1.q;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f23738a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23739b;

    /* renamed from: c, reason: collision with root package name */
    public final q f23740c;

    /* renamed from: d, reason: collision with root package name */
    public final rm1.c f23741d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f23742e;

    public d(Integer num, String label, q qVar, Function0 tapAction, int i13) {
        num = (i13 & 1) != 0 ? null : num;
        rm1.c iconColor = rm1.c.DEFAULT;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(tapAction, "tapAction");
        this.f23738a = num;
        this.f23739b = label;
        this.f23740c = qVar;
        this.f23741d = iconColor;
        this.f23742e = tapAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f23738a, dVar.f23738a) && Intrinsics.d(this.f23739b, dVar.f23739b) && this.f23740c == dVar.f23740c && this.f23741d == dVar.f23741d && Intrinsics.d(this.f23742e, dVar.f23742e);
    }

    public final int hashCode() {
        Integer num = this.f23738a;
        int d2 = cb.d(this.f23739b, (num == null ? 0 : num.hashCode()) * 31, 31);
        q qVar = this.f23740c;
        return this.f23742e.hashCode() + ((this.f23741d.hashCode() + ((d2 + (qVar != null ? qVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActionButtonState(id=");
        sb3.append(this.f23738a);
        sb3.append(", label=");
        sb3.append(this.f23739b);
        sb3.append(", icon=");
        sb3.append(this.f23740c);
        sb3.append(", iconColor=");
        sb3.append(this.f23741d);
        sb3.append(", tapAction=");
        return pk2.f.i(sb3, this.f23742e, ")");
    }
}
