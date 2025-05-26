package z92;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import rm1.q;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final g f141440d = new g(null, f.f141438m, null);

    /* renamed from: a, reason: collision with root package name */
    public final q f141441a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f141442b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f141443c;

    public g(q qVar, Function0 onClickAction, Integer num) {
        Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
        this.f141441a = qVar;
        this.f141442b = onClickAction;
        this.f141443c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f141441a == gVar.f141441a && Intrinsics.d(this.f141442b, gVar.f141442b) && Intrinsics.d(this.f141443c, gVar.f141443c);
    }

    public final int hashCode() {
        q qVar = this.f141441a;
        int b13 = d7.g.b(this.f141442b, (qVar == null ? 0 : qVar.hashCode()) * 31, 31);
        Integer num = this.f141443c;
        return b13 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SideActionItem(icon=");
        sb3.append(this.f141441a);
        sb3.append(", onClickAction=");
        sb3.append(this.f141442b);
        sb3.append(", contentDescriptionResId=");
        return a.c.i(sb3, this.f141443c, ")");
    }
}
