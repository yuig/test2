package mw1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f88428a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f88429b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88430c;

    /* renamed from: d, reason: collision with root package name */
    public final Double f88431d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f88432e;

    public e(int i13, Double d2, int i14, Double d13, Integer num) {
        this.f88428a = i13;
        this.f88429b = d2;
        this.f88430c = i14;
        this.f88431d = d13;
        this.f88432e = num;
    }

    public static e a(e eVar, int i13) {
        return new e(eVar.f88428a, eVar.f88429b, i13, eVar.f88431d, eVar.f88432e);
    }

    public final int b() {
        return this.f88430c;
    }

    public final Double c() {
        return this.f88431d;
    }

    public final Integer d() {
        return this.f88432e;
    }

    public final Double e() {
        return this.f88429b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f88428a == eVar.f88428a && Intrinsics.d(this.f88429b, eVar.f88429b) && this.f88430c == eVar.f88430c && Intrinsics.d(this.f88431d, eVar.f88431d) && Intrinsics.d(this.f88432e, eVar.f88432e);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f88428a) * 31;
        Double d2 = this.f88429b;
        int b13 = ep.b.b(this.f88430c, (hashCode + (d2 == null ? 0 : d2.hashCode())) * 31, 31);
        Double d13 = this.f88431d;
        int hashCode2 = (b13 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Integer num = this.f88432e;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LegendEntry(name=");
        sb3.append(this.f88428a);
        sb3.append(", value=");
        sb3.append(this.f88429b);
        sb3.append(", color=");
        sb3.append(this.f88430c);
        sb3.append(", delta=");
        sb3.append(this.f88431d);
        sb3.append(", numberOfDays=");
        return a.c.i(sb3, this.f88432e, ")");
    }
}
