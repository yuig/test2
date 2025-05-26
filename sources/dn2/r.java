package dn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r extends s {

    /* renamed from: a, reason: collision with root package name */
    public final f f55636a;

    public r(f value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f55636a = value;
    }

    public final int a() {
        return this.f55636a.f55622b;
    }

    public final ym2.b b() {
        return this.f55636a.f55621a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f55636a, ((r) obj).f55636a);
    }

    public final int hashCode() {
        return this.f55636a.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.f55636a + ')';
    }
}
