package y01;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements w {

    /* renamed from: a, reason: collision with root package name */
    public final String f136488a;

    public r(String currentPinUid) {
        Intrinsics.checkNotNullParameter(currentPinUid, "currentPinUid");
        this.f136488a = currentPinUid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Intrinsics.d(this.f136488a, ((r) obj).f136488a);
    }

    public final int hashCode() {
        return this.f136488a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ScreenshotPin(currentPinUid="), this.f136488a, ")");
    }
}
