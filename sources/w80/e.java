package w80;

import kotlin.jvm.internal.Intrinsics;
import s80.g7;

/* loaded from: classes5.dex */
public final class e implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final rm1.q f128274a;

    /* renamed from: b, reason: collision with root package name */
    public final int f128275b;

    /* renamed from: c, reason: collision with root package name */
    public final d f128276c;

    /* renamed from: d, reason: collision with root package name */
    public final int f128277d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f128278e;

    public e(rm1.q icon, d type, int i13, Integer num) {
        int i14 = g7.composer_action_bar_action_background;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f128274a = icon;
        this.f128275b = i14;
        this.f128276c = type;
        this.f128277d = i13;
        this.f128278e = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f128274a == eVar.f128274a && this.f128275b == eVar.f128275b && this.f128276c == eVar.f128276c && this.f128277d == eVar.f128277d && Intrinsics.d(this.f128278e, eVar.f128278e);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f128277d, (this.f128276c.hashCode() + ep.b.b(this.f128275b, this.f128274a.hashCode() * 31, 31)) * 31, 31);
        Integer num = this.f128278e;
        return b13 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CollageComposerBottomBarActionState(icon=");
        sb3.append(this.f128274a);
        sb3.append(", backgroundColorResId=");
        sb3.append(this.f128275b);
        sb3.append(", type=");
        sb3.append(this.f128276c);
        sb3.append(", id=");
        sb3.append(this.f128277d);
        sb3.append(", contentDescription=");
        return a.c.i(sb3, this.f128278e, ")");
    }
}
