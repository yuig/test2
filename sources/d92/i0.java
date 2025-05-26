package d92;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f54153a;

    public i0(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f54153a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f54153a, ((i0) obj).f54153a);
    }

    public final int hashCode() {
        return this.f54153a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadPin(pinId="), this.f54153a, ")");
    }
}
