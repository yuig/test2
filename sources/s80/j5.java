package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j5 implements k5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f111630a;

    public j5(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f111630a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5) && Intrinsics.d(this.f111630a, ((j5) obj).f111630a);
    }

    public final int hashCode() {
        return this.f111630a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("FetchRemixPin(pinId="), this.f111630a, ")");
    }
}
