package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s1 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f111789a;

    public s1(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f111789a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1) && Intrinsics.d(this.f111789a, ((s1) obj).f111789a);
    }

    public final int hashCode() {
        return this.f111789a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RemixPinSelected(pinId="), this.f111789a, ")");
    }
}
