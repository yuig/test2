package z92;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f141423a;

    /* renamed from: b, reason: collision with root package name */
    public final int f141424b;

    /* renamed from: c, reason: collision with root package name */
    public final int f141425c;

    /* renamed from: d, reason: collision with root package name */
    public final int f141426d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f141427e;

    public d(int i13, int i14, int i15, int i16, Function0 onClickAction) {
        Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
        this.f141423a = i13;
        this.f141424b = i14;
        this.f141425c = i15;
        this.f141426d = i16;
        this.f141427e = onClickAction;
    }

    public final int a() {
        return this.f141423a;
    }

    public final int b() {
        return this.f141424b;
    }

    public final int c() {
        return this.f141425c;
    }

    public final int d() {
        return this.f141426d;
    }

    public final Function0 e() {
        return this.f141427e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f141423a == dVar.f141423a && this.f141424b == dVar.f141424b && this.f141425c == dVar.f141425c && this.f141426d == dVar.f141426d && Intrinsics.d(this.f141427e, dVar.f141427e);
    }

    public final int hashCode() {
        return this.f141427e.hashCode() + ep.b.b(this.f141426d, ep.b.b(this.f141425c, ep.b.b(this.f141424b, Integer.hashCode(this.f141423a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActionItem(backgroundColorResId=");
        sb3.append(this.f141423a);
        sb3.append(", textColorResId=");
        sb3.append(this.f141424b);
        sb3.append(", textResId=");
        sb3.append(this.f141425c);
        sb3.append(", viewId=");
        sb3.append(this.f141426d);
        sb3.append(", onClickAction=");
        return pk2.f.i(sb3, this.f141427e, ")");
    }
}
