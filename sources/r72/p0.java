package r72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p0 extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f106609a;

    /* renamed from: b, reason: collision with root package name */
    public final float f106610b;

    /* renamed from: c, reason: collision with root package name */
    public final float f106611c;

    /* renamed from: d, reason: collision with root package name */
    public final ql2.h f106612d;

    public p0(String key, float f13, float f14, ql2.h range) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f106609a = key;
        this.f106610b = f13;
        this.f106611c = f14;
        this.f106612d = range;
    }

    public static p0 d(p0 p0Var, float f13) {
        String key = p0Var.f106609a;
        float f14 = p0Var.f106611c;
        ql2.h range = p0Var.f106612d;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(range, "range");
        return new p0(key, f13, f14, range);
    }

    @Override // r72.w0
    public final Object a() {
        return Float.valueOf(this.f106611c);
    }

    @Override // r72.w0
    public final String b() {
        return this.f106609a;
    }

    @Override // r72.w0
    public final Object c() {
        return Float.valueOf(this.f106610b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.d(this.f106609a, p0Var.f106609a) && Float.compare(this.f106610b, p0Var.f106610b) == 0 && Float.compare(this.f106611c, p0Var.f106611c) == 0 && Intrinsics.d(this.f106612d, p0Var.f106612d);
    }

    public final int hashCode() {
        return this.f106612d.hashCode() + a.a.a(this.f106611c, a.a.a(this.f106610b, this.f106609a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "FloatSetting(key=" + this.f106609a + ", value=" + this.f106610b + ", defaultValue=" + this.f106611c + ", range=" + this.f106612d + ")";
    }
}
