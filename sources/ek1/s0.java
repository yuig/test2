package ek1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f59366a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.c0 f59367b;

    public s0(String trackingDataProviderUid, q8.c0 perfEventTime) {
        Intrinsics.checkNotNullParameter(trackingDataProviderUid, "trackingDataProviderUid");
        Intrinsics.checkNotNullParameter(perfEventTime, "perfEventTime");
        this.f59366a = trackingDataProviderUid;
        this.f59367b = perfEventTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.d(this.f59366a, s0Var.f59366a) && Intrinsics.d(this.f59367b, s0Var.f59367b);
    }

    public final int hashCode() {
        return this.f59367b.hashCode() + (this.f59366a.hashCode() * 31);
    }

    public final String toString() {
        return "LogImgPlaceHolderImgLoadNetworkStopEvent(trackingDataProviderUid=" + this.f59366a + ", perfEventTime=" + this.f59367b + ")";
    }
}
