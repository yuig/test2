package r72;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o0 extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f106594a;

    /* renamed from: b, reason: collision with root package name */
    public final float f106595b;

    /* renamed from: c, reason: collision with root package name */
    public final float f106596c;

    /* renamed from: d, reason: collision with root package name */
    public final List f106597d;

    /* renamed from: e, reason: collision with root package name */
    public final int f106598e;

    public o0(String key, float f13, float f14, List options) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f106594a = key;
        this.f106595b = f13;
        this.f106596c = f14;
        this.f106597d = options;
        this.f106598e = options.indexOf(Float.valueOf(f13));
    }

    public static o0 d(o0 o0Var, float f13) {
        String key = o0Var.f106594a;
        float f14 = o0Var.f106596c;
        List options = o0Var.f106597d;
        o0Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(options, "options");
        return new o0(key, f13, f14, options);
    }

    @Override // r72.w0
    public final Object a() {
        return Float.valueOf(this.f106596c);
    }

    @Override // r72.w0
    public final String b() {
        return this.f106594a;
    }

    @Override // r72.w0
    public final Object c() {
        return Float.valueOf(this.f106595b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.d(this.f106594a, o0Var.f106594a) && Float.compare(this.f106595b, o0Var.f106595b) == 0 && Float.compare(this.f106596c, o0Var.f106596c) == 0 && Intrinsics.d(this.f106597d, o0Var.f106597d);
    }

    public final int hashCode() {
        return this.f106597d.hashCode() + a.a.a(this.f106596c, a.a.a(this.f106595b, this.f106594a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "FloatOptionsSetting(key=" + this.f106594a + ", value=" + this.f106595b + ", defaultValue=" + this.f106596c + ", options=" + this.f106597d + ")";
    }
}
