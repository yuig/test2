package zy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f143073a;

    public f0(a payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f143073a = payload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.d(this.f143073a, ((f0) obj).f143073a);
    }

    public final int hashCode() {
        return this.f143073a.hashCode();
    }

    public final a j() {
        return this.f143073a;
    }

    public final String toString() {
        return "LogUserActionSideEffectRequest(payload=" + this.f143073a + ")";
    }
}
