package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n0 implements s0 {

    /* renamed from: a, reason: collision with root package name */
    public final mr1.c f130982a;

    public n0(mr1.c activityProvider) {
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        this.f130982a = activityProvider;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n0) && Intrinsics.d(this.f130982a, ((n0) obj).f130982a);
    }

    public final int hashCode() {
        return this.f130982a.hashCode();
    }

    public final String toString() {
        return "GoogleAuthSideEffectRequest(activityProvider=" + this.f130982a + ")";
    }
}
