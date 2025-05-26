package r72;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes4.dex */
public final class r0 extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f106631a;

    /* renamed from: b, reason: collision with root package name */
    public final int f106632b;

    /* renamed from: c, reason: collision with root package name */
    public final int f106633c;

    /* renamed from: d, reason: collision with root package name */
    public final IntRange f106634d;

    public r0(String key, int i13, int i14, IntRange range) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f106631a = key;
        this.f106632b = i13;
        this.f106633c = i14;
        this.f106634d = range;
    }

    public static r0 d(r0 r0Var, int i13) {
        String key = r0Var.f106631a;
        int i14 = r0Var.f106633c;
        IntRange range = r0Var.f106634d;
        r0Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(range, "range");
        return new r0(key, i13, i14, range);
    }

    @Override // r72.w0
    public final Object a() {
        return Integer.valueOf(this.f106633c);
    }

    @Override // r72.w0
    public final String b() {
        return this.f106631a;
    }

    @Override // r72.w0
    public final Object c() {
        return Integer.valueOf(this.f106632b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return Intrinsics.d(this.f106631a, r0Var.f106631a) && this.f106632b == r0Var.f106632b && this.f106633c == r0Var.f106633c && Intrinsics.d(this.f106634d, r0Var.f106634d);
    }

    public final int hashCode() {
        return this.f106634d.hashCode() + ep.b.b(this.f106633c, ep.b.b(this.f106632b, this.f106631a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "IntSetting(key=" + this.f106631a + ", value=" + this.f106632b + ", defaultValue=" + this.f106633c + ", range=" + this.f106634d + ")";
    }
}
