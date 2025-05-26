package gj1;

import ej1.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements aj1.a {

    /* renamed from: a, reason: collision with root package name */
    public final d f65199a;

    public b(d pinTextDisplayState) {
        Intrinsics.checkNotNullParameter(pinTextDisplayState, "pinTextDisplayState");
        this.f65199a = pinTextDisplayState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f65199a, ((b) obj).f65199a);
    }

    public final int hashCode() {
        return this.f65199a.hashCode();
    }

    public final String toString() {
        return "PromoTextDisplayState(pinTextDisplayState=" + this.f65199a + ")";
    }
}
