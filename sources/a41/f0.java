package a41;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: f, reason: collision with root package name */
    public static final f0 f588f = new f0(null, om1.f.TRANSPARENT_DARK_GRAY, 0, null, o.f640m);

    /* renamed from: a, reason: collision with root package name */
    public final rm1.q f589a;

    /* renamed from: b, reason: collision with root package name */
    public final om1.f f590b;

    /* renamed from: c, reason: collision with root package name */
    public final int f591c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f592d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f593e;

    public f0(rm1.q qVar, om1.f style, int i13, Integer num, Function0 clickListener) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.f589a = qVar;
        this.f590b = style;
        this.f591c = i13;
        this.f592d = num;
        this.f593e = clickListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f589a == f0Var.f589a && this.f590b == f0Var.f590b && this.f591c == f0Var.f591c && Intrinsics.d(this.f592d, f0Var.f592d) && Intrinsics.d(this.f593e, f0Var.f593e);
    }

    public final int hashCode() {
        rm1.q qVar = this.f589a;
        int b13 = ep.b.b(this.f591c, (this.f590b.hashCode() + ((qVar == null ? 0 : qVar.hashCode()) * 31)) * 31, 31);
        Integer num = this.f592d;
        return this.f593e.hashCode() + ((b13 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActionIcon(gestaltIcon=");
        sb3.append(this.f589a);
        sb3.append(", style=");
        sb3.append(this.f590b);
        sb3.append(", topMargin=");
        sb3.append(this.f591c);
        sb3.append(", contentDescriptionResId=");
        sb3.append(this.f592d);
        sb3.append(", clickListener=");
        return pk2.f.i(sb3, this.f593e, ")");
    }
}
