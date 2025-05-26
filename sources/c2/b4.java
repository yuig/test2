package c2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    public final v1.a f24564a;

    /* renamed from: b, reason: collision with root package name */
    public final v1.a f24565b;

    /* renamed from: c, reason: collision with root package name */
    public final v1.a f24566c;

    public b4() {
        v1.h a13 = v1.i.a(4);
        v1.h a14 = v1.i.a(4);
        v1.h a15 = v1.i.a(0);
        this.f24564a = a13;
        this.f24565b = a14;
        this.f24566c = a15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        return Intrinsics.d(this.f24564a, b4Var.f24564a) && Intrinsics.d(this.f24565b, b4Var.f24565b) && Intrinsics.d(this.f24566c, b4Var.f24566c);
    }

    public final int hashCode() {
        return this.f24566c.hashCode() + ((this.f24565b.hashCode() + (this.f24564a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(small=" + this.f24564a + ", medium=" + this.f24565b + ", large=" + this.f24566c + ')';
    }
}
