package hj1;

import kotlin.jvm.internal.Intrinsics;
import wa2.x;

/* loaded from: classes5.dex */
public final class b implements aj1.a {

    /* renamed from: a, reason: collision with root package name */
    public final x f69283a;

    public b(x pinReactionsDisplayState) {
        Intrinsics.checkNotNullParameter(pinReactionsDisplayState, "pinReactionsDisplayState");
        this.f69283a = pinReactionsDisplayState;
    }

    public static b e(x pinReactionsDisplayState) {
        Intrinsics.checkNotNullParameter(pinReactionsDisplayState, "pinReactionsDisplayState");
        return new b(pinReactionsDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f69283a, ((b) obj).f69283a);
    }

    public final x f() {
        return this.f69283a;
    }

    public final int hashCode() {
        return this.f69283a.hashCode();
    }

    public final String toString() {
        return "ReactionsDisplayState(pinReactionsDisplayState=" + this.f69283a + ")";
    }
}
