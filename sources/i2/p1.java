package i2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final g1.c0 f71233a;

    public /* synthetic */ p1(g1.c0 c0Var) {
        this.f71233a = c0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p1) {
            return Intrinsics.d(this.f71233a, ((p1) obj).f71233a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f71233a.hashCode();
    }

    public final String toString() {
        return "MutableScatterMultiMap(map=" + this.f71233a + ')';
    }
}
