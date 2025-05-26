package r72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class t0 extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f106658a;

    /* renamed from: b, reason: collision with root package name */
    public final s0 f106659b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f106660c;

    /* renamed from: d, reason: collision with root package name */
    public final s0 f106661d;

    /* renamed from: e, reason: collision with root package name */
    public final s0 f106662e;

    public t0(String key, s0 value, s0 defaultValue, s0 rangeFrom, s0 rangeTo) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(rangeFrom, "rangeFrom");
        Intrinsics.checkNotNullParameter(rangeTo, "rangeTo");
        this.f106658a = key;
        this.f106659b = value;
        this.f106660c = defaultValue;
        this.f106661d = rangeFrom;
        this.f106662e = rangeTo;
    }

    public static t0 d(t0 t0Var, s0 value) {
        String key = t0Var.f106658a;
        s0 defaultValue = t0Var.f106660c;
        s0 rangeFrom = t0Var.f106661d;
        s0 rangeTo = t0Var.f106662e;
        t0Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(rangeFrom, "rangeFrom");
        Intrinsics.checkNotNullParameter(rangeTo, "rangeTo");
        return new t0(key, value, defaultValue, rangeFrom, rangeTo);
    }

    @Override // r72.w0
    public final Object a() {
        return this.f106660c;
    }

    @Override // r72.w0
    public final String b() {
        return this.f106658a;
    }

    @Override // r72.w0
    public final Object c() {
        return this.f106659b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.d(this.f106658a, t0Var.f106658a) && Intrinsics.d(this.f106659b, t0Var.f106659b) && Intrinsics.d(this.f106660c, t0Var.f106660c) && Intrinsics.d(this.f106661d, t0Var.f106661d) && Intrinsics.d(this.f106662e, t0Var.f106662e);
    }

    public final int hashCode() {
        return this.f106662e.hashCode() + ((this.f106661d.hashCode() + ((this.f106660c.hashCode() + ((this.f106659b.hashCode() + (this.f106658a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LineSetting(key=" + this.f106658a + ", value=" + this.f106659b + ", defaultValue=" + this.f106660c + ", rangeFrom=" + this.f106661d + ", rangeTo=" + this.f106662e + ")";
    }
}
