package r72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class m0 extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f106548a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f106549b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f106550c;

    public m0(String key, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f106548a = key;
        this.f106549b = z13;
        this.f106550c = z14;
    }

    public static m0 d(m0 m0Var, boolean z13) {
        String key = m0Var.f106548a;
        boolean z14 = m0Var.f106550c;
        m0Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        return new m0(key, z13, z14);
    }

    @Override // r72.w0
    public final Object a() {
        return Boolean.valueOf(this.f106550c);
    }

    @Override // r72.w0
    public final String b() {
        return this.f106548a;
    }

    @Override // r72.w0
    public final Object c() {
        return Boolean.valueOf(this.f106549b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return Intrinsics.d(this.f106548a, m0Var.f106548a) && this.f106549b == m0Var.f106549b && this.f106550c == m0Var.f106550c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f106550c) + ep.b.e(this.f106549b, this.f106548a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BooleanSetting(key=");
        sb3.append(this.f106548a);
        sb3.append(", value=");
        sb3.append(this.f106549b);
        sb3.append(", defaultValue=");
        return a.a.r(sb3, this.f106550c, ")");
    }
}
