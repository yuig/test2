package lt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h implements l82.h {

    /* renamed from: a, reason: collision with root package name */
    public final String f84749a;

    public h(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        this.f84749a = pinId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f84749a, ((h) obj).f84749a);
    }

    public final int hashCode() {
        return this.f84749a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadNativeAd(pinId="), this.f84749a, ")");
    }
}
