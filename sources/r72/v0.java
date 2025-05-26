package r72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v0 extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f106694a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f106695b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f106696c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f106697d;

    /* renamed from: e, reason: collision with root package name */
    public final u0 f106698e;

    public v0(String key, u0 value, u0 defaultValue, u0 rangeFrom, u0 rangeTo) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(rangeFrom, "rangeFrom");
        Intrinsics.checkNotNullParameter(rangeTo, "rangeTo");
        this.f106694a = key;
        this.f106695b = value;
        this.f106696c = defaultValue;
        this.f106697d = rangeFrom;
        this.f106698e = rangeTo;
    }

    public static v0 d(v0 v0Var, u0 value) {
        String key = v0Var.f106694a;
        u0 defaultValue = v0Var.f106696c;
        u0 rangeFrom = v0Var.f106697d;
        u0 rangeTo = v0Var.f106698e;
        v0Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        Intrinsics.checkNotNullParameter(rangeFrom, "rangeFrom");
        Intrinsics.checkNotNullParameter(rangeTo, "rangeTo");
        return new v0(key, value, defaultValue, rangeFrom, rangeTo);
    }

    @Override // r72.w0
    public final Object a() {
        return this.f106696c;
    }

    @Override // r72.w0
    public final String b() {
        return this.f106694a;
    }

    @Override // r72.w0
    public final Object c() {
        return this.f106695b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Intrinsics.d(this.f106694a, v0Var.f106694a) && Intrinsics.d(this.f106695b, v0Var.f106695b) && Intrinsics.d(this.f106696c, v0Var.f106696c) && Intrinsics.d(this.f106697d, v0Var.f106697d) && Intrinsics.d(this.f106698e, v0Var.f106698e);
    }

    public final int hashCode() {
        return this.f106698e.hashCode() + ((this.f106697d.hashCode() + ((this.f106696c.hashCode() + ((this.f106695b.hashCode() + (this.f106694a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Point2dSetting(key=" + this.f106694a + ", value=" + this.f106695b + ", defaultValue=" + this.f106696c + ", rangeFrom=" + this.f106697d + ", rangeTo=" + this.f106698e + ")";
    }
}
