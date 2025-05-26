package nm1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f91414a;

    /* renamed from: b, reason: collision with root package name */
    public final u50.i0 f91415b;

    /* renamed from: c, reason: collision with root package name */
    public final l f91416c;

    /* renamed from: d, reason: collision with root package name */
    public final l f91417d;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f91418e;

    /* renamed from: f, reason: collision with root package name */
    public final int f91419f;

    public e0(u50.i0 title, u50.i0 subtitle, l startActions, l endActions, h0 variant, int i13) {
        int i14 = i13 & 1;
        u50.h0 h0Var = u50.h0.f120562a;
        title = i14 != 0 ? h0Var : title;
        subtitle = (i13 & 2) != 0 ? h0Var : subtitle;
        int i15 = i13 & 4;
        f fVar = f.f91423a;
        startActions = i15 != 0 ? fVar : startActions;
        endActions = (i13 & 8) != 0 ? fVar : endActions;
        variant = (i13 & 16) != 0 ? h0.NORMAL : variant;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(startActions, "startActions");
        Intrinsics.checkNotNullParameter(endActions, "endActions");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f91414a = title;
        this.f91415b = subtitle;
        this.f91416c = startActions;
        this.f91417d = endActions;
        this.f91418e = variant;
        this.f91419f = Integer.MIN_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return Intrinsics.d(this.f91414a, e0Var.f91414a) && Intrinsics.d(this.f91415b, e0Var.f91415b) && Intrinsics.d(this.f91416c, e0Var.f91416c) && Intrinsics.d(this.f91417d, e0Var.f91417d) && this.f91418e == e0Var.f91418e && this.f91419f == e0Var.f91419f;
    }

    @Override // nm1.m
    public final int getId() {
        throw null;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f91419f) + ((this.f91418e.hashCode() + ((this.f91417d.hashCode() + ((this.f91416c.hashCode() + ep.b.d(this.f91415b, this.f91414a.hashCode() * 31, 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TitleAndActions(title=");
        sb3.append(this.f91414a);
        sb3.append(", subtitle=");
        sb3.append(this.f91415b);
        sb3.append(", startActions=");
        sb3.append(this.f91416c);
        sb3.append(", endActions=");
        sb3.append(this.f91417d);
        sb3.append(", variant=");
        sb3.append(this.f91418e);
        sb3.append(", id=");
        return a.a.n(sb3, this.f91419f, ")");
    }
}
