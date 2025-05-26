package k1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final float f78091a;

    /* renamed from: b, reason: collision with root package name */
    public final b3.s f78092b;

    public y(float f13, b3.z0 z0Var) {
        this.f78091a = f13;
        this.f78092b = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return n4.e.a(this.f78091a, yVar.f78091a) && Intrinsics.d(this.f78092b, yVar.f78092b);
    }

    public final int hashCode() {
        return this.f78092b.hashCode() + (Float.hashCode(this.f78091a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) n4.e.b(this.f78091a)) + ", brush=" + this.f78092b + ')';
    }
}
