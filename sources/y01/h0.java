package y01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h0 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final h42.a f136412a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f136413b;

    public h0(h42.a screenPagerDisplayState, g0 action) {
        Intrinsics.checkNotNullParameter(screenPagerDisplayState, "screenPagerDisplayState");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f136412a = screenPagerDisplayState;
        this.f136413b = action;
    }

    public static h0 e(h0 h0Var, h42.a screenPagerDisplayState, g0 action, int i13) {
        if ((i13 & 1) != 0) {
            screenPagerDisplayState = h0Var.f136412a;
        }
        if ((i13 & 2) != 0) {
            action = h0Var.f136413b;
        }
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(screenPagerDisplayState, "screenPagerDisplayState");
        Intrinsics.checkNotNullParameter(action, "action");
        return new h0(screenPagerDisplayState, action);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return Intrinsics.d(this.f136412a, h0Var.f136412a) && Intrinsics.d(this.f136413b, h0Var.f136413b);
    }

    public final g0 f() {
        return this.f136413b;
    }

    public final h42.a g() {
        return this.f136412a;
    }

    public final int hashCode() {
        return this.f136413b.hashCode() + (this.f136412a.hashCode() * 31);
    }

    public final String toString() {
        return "PinSwipeFragmentDisplayState(screenPagerDisplayState=" + this.f136412a + ", action=" + this.f136413b + ")";
    }
}
