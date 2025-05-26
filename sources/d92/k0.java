package d92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final do1.d f54158a;

    public k0(do1.d displayState) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        this.f54158a = displayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && Intrinsics.d(this.f54158a, ((k0) obj).f54158a);
    }

    public final int hashCode() {
        return this.f54158a.hashCode();
    }

    public final String toString() {
        return "ShowToast(displayState=" + this.f54158a + ")";
    }
}
