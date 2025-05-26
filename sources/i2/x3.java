package i2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x3 implements z3 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f71360a;

    public x3(Object obj) {
        this.f71360a = obj;
    }

    @Override // i2.z3
    public final Object a(z1 z1Var) {
        return this.f71360a;
    }

    public final Object b() {
        return this.f71360a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x3) && Intrinsics.d(this.f71360a, ((x3) obj).f71360a);
    }

    public final int hashCode() {
        Object obj = this.f71360a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f71360a + ')';
    }
}
