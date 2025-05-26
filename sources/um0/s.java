package um0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements w {

    /* renamed from: a, reason: collision with root package name */
    public final String f122763a;

    public s(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f122763a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f122763a, ((s) obj).f122763a);
    }

    public final int hashCode() {
        return this.f122763a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("PinClicked(pinId="), this.f122763a, ")");
    }
}
