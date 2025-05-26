package g21;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f63398a;

    /* renamed from: b, reason: collision with root package name */
    public final String f63399b;

    /* renamed from: c, reason: collision with root package name */
    public final int f63400c;

    public f(String storyId, String trackingParams, int i13) {
        Intrinsics.checkNotNullParameter(storyId, "storyId");
        Intrinsics.checkNotNullParameter(trackingParams, "trackingParams");
        this.f63398a = storyId;
        this.f63399b = trackingParams;
        this.f63400c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f63398a, fVar.f63398a) && Intrinsics.d(this.f63399b, fVar.f63399b) && this.f63400c == fVar.f63400c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f63400c) + cb.d(this.f63399b, this.f63398a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinCarouselLoggingData(storyId=");
        sb3.append(this.f63398a);
        sb3.append(", trackingParams=");
        sb3.append(this.f63399b);
        sb3.append(", position=");
        return a.a.n(sb3, this.f63400c, ")");
    }
}
