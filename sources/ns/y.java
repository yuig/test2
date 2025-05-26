package ns;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f91971a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91972b;

    public y(String pinId, String deeplinkUrl) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(deeplinkUrl, "deeplinkUrl");
        this.f91971a = pinId;
        this.f91972b = deeplinkUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return Intrinsics.d(this.f91971a, yVar.f91971a) && Intrinsics.d(this.f91972b, yVar.f91972b);
    }

    public final int hashCode() {
        return this.f91972b.hashCode() + (this.f91971a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SearchLandingAdPreviewItemsFetcherArgs(pinId=");
        sb3.append(this.f91971a);
        sb3.append(", deeplinkUrl=");
        return a.a.p(sb3, this.f91972b, ")");
    }
}
