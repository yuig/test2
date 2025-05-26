package h42;

import l82.i0;

/* loaded from: classes4.dex */
public final class f implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f67648a = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f67648a == ((f) obj).f67648a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f67648a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ScreenPagerVMState(dummyField="), this.f67648a, ")");
    }
}
