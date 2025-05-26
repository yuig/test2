package od1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f94116a;

    public b0(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f94116a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.f94116a, ((b0) obj).f94116a);
    }

    public final int hashCode() {
        return this.f94116a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PinLoaderEffectRequest(pinId="), this.f94116a, ")");
    }
}
