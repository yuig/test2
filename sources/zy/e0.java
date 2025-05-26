package zy;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f143071a;

    public e0(a payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f143071a = payload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && Intrinsics.d(this.f143071a, ((e0) obj).f143071a);
    }

    public final int hashCode() {
        return this.f143071a.hashCode();
    }

    public final a j() {
        return this.f143071a;
    }

    public final String toString() {
        return "LogEventSideEffectRequest(payload=" + this.f143071a + ")";
    }
}
