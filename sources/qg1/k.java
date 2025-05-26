package qg1;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public double f103847a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f103848b;

    public k() {
        HashMap pageIdToElapsedDurationOfVideoInMs = new HashMap();
        Intrinsics.checkNotNullParameter(pageIdToElapsedDurationOfVideoInMs, "pageIdToElapsedDurationOfVideoInMs");
        this.f103847a = 0.0d;
        this.f103848b = pageIdToElapsedDurationOfVideoInMs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Double.compare(this.f103847a, kVar.f103847a) == 0 && Intrinsics.d(this.f103848b, kVar.f103848b);
    }

    public final int hashCode() {
        return this.f103848b.hashCode() + (Double.hashCode(this.f103847a) * 31);
    }

    public final String toString() {
        return "StoryPinVideoLoggingData(totalVideoDurationInMs=" + this.f103847a + ", pageIdToElapsedDurationOfVideoInMs=" + this.f103848b + ")";
    }
}
