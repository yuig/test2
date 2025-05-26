package hn1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final cm1.d f69650a;

    public e(cm1.d buttonGroupDisplayState) {
        Intrinsics.checkNotNullParameter(buttonGroupDisplayState, "buttonGroupDisplayState");
        this.f69650a = buttonGroupDisplayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f69650a, ((e) obj).f69650a);
    }

    public final int hashCode() {
        return this.f69650a.hashCode();
    }

    public final String toString() {
        return "ButtonGroup(buttonGroupDisplayState=" + this.f69650a + ")";
    }
}
