package y01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f136388a;

    /* renamed from: b, reason: collision with root package name */
    public final int f136389b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f136390c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f136391d;

    /* renamed from: e, reason: collision with root package name */
    public final int f136392e;

    /* renamed from: f, reason: collision with root package name */
    public final float f136393f;

    /* renamed from: g, reason: collision with root package name */
    public final int f136394g;

    public c0(int i13, int i14, Integer num, Integer num2, int i15, float f13, int i16) {
        this.f136388a = i13;
        this.f136389b = i14;
        this.f136390c = num;
        this.f136391d = num2;
        this.f136392e = i15;
        this.f136393f = f13;
        this.f136394g = i16;
    }

    public final Integer a() {
        return this.f136391d;
    }

    public final int b() {
        return this.f136389b;
    }

    public final int c() {
        return this.f136392e;
    }

    public final float d() {
        return this.f136393f;
    }

    public final int e() {
        return this.f136394g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f136388a == c0Var.f136388a && this.f136389b == c0Var.f136389b && Intrinsics.d(this.f136390c, c0Var.f136390c) && Intrinsics.d(this.f136391d, c0Var.f136391d) && this.f136392e == c0Var.f136392e && Float.compare(this.f136393f, c0Var.f136393f) == 0 && this.f136394g == c0Var.f136394g;
    }

    public final Integer f() {
        return this.f136390c;
    }

    public final int g() {
        return this.f136388a;
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f136389b, Integer.hashCode(this.f136388a) * 31, 31);
        Integer num = this.f136390c;
        int hashCode = (b13 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f136391d;
        return Integer.hashCode(this.f136394g) + a.a.a(this.f136393f, ep.b.b(this.f136392e, (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PageScrolled(updateViewabilityAtPosition=");
        sb3.append(this.f136388a);
        sb3.append(", notifyPageScrolledAtPosition=");
        sb3.append(this.f136389b);
        sb3.append(", selectFragmentAtPosition=");
        sb3.append(this.f136390c);
        sb3.append(", deselectFragmentAtPosition=");
        sb3.append(this.f136391d);
        sb3.append(", position=");
        sb3.append(this.f136392e);
        sb3.append(", positionOffset=");
        sb3.append(this.f136393f);
        sb3.append(", positionOffsetPixels=");
        return a.a.n(sb3, this.f136394g, ")");
    }
}
