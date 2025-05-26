package h80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public final String f68110a;

    public o(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f68110a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f68110a, ((o) obj).f68110a);
    }

    public final int hashCode() {
        return this.f68110a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadOutpaintStyles(pinId="), this.f68110a, ")");
    }
}
