package n70;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements m {

    /* renamed from: a, reason: collision with root package name */
    public final String f89611a;

    /* renamed from: b, reason: collision with root package name */
    public final String f89612b;

    public g(String pinUid, String imageSignature) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(imageSignature, "imageSignature");
        this.f89611a = pinUid;
        this.f89612b = imageSignature;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f89611a, gVar.f89611a) && Intrinsics.d(this.f89612b, gVar.f89612b);
    }

    public final int hashCode() {
        return this.f89612b.hashCode() + (this.f89611a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("OneTapSaveButtonStateChange(pinUid=");
        sb3.append(this.f89611a);
        sb3.append(", imageSignature=");
        return a.a.p(sb3, this.f89612b, ")");
    }
}
