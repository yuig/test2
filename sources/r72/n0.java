package r72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0 extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f106578a;

    /* renamed from: b, reason: collision with root package name */
    public final int f106579b;

    /* renamed from: c, reason: collision with root package name */
    public final int f106580c;

    public n0(String key, int i13, int i14) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f106578a = key;
        this.f106579b = i13;
        this.f106580c = i14;
    }

    public static n0 d(n0 n0Var, int i13) {
        String key = n0Var.f106578a;
        int i14 = n0Var.f106580c;
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        return new n0(key, i13, i14);
    }

    @Override // r72.w0
    public final Object a() {
        return Integer.valueOf(this.f106580c);
    }

    @Override // r72.w0
    public final String b() {
        return this.f106578a;
    }

    @Override // r72.w0
    public final Object c() {
        return Integer.valueOf(this.f106579b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.d(this.f106578a, n0Var.f106578a) && this.f106579b == n0Var.f106579b && this.f106580c == n0Var.f106580c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f106580c) + ep.b.b(this.f106579b, this.f106578a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ColorSetting(key=");
        sb3.append(this.f106578a);
        sb3.append(", value=");
        sb3.append(this.f106579b);
        sb3.append(", defaultValue=");
        return a.a.n(sb3, this.f106580c, ")");
    }
}
