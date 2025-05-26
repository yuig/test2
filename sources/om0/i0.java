package om0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f96505a;

    /* renamed from: b, reason: collision with root package name */
    public final String f96506b;

    public i0(String startImageUrl, String endImageUrl) {
        Intrinsics.checkNotNullParameter(startImageUrl, "startImageUrl");
        Intrinsics.checkNotNullParameter(endImageUrl, "endImageUrl");
        this.f96505a = startImageUrl;
        this.f96506b = endImageUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.d(this.f96505a, i0Var.f96505a) && Intrinsics.d(this.f96506b, i0Var.f96506b);
    }

    public final int hashCode() {
        return this.f96506b.hashCode() + (this.f96505a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PreviewImagePairState(startImageUrl=");
        sb3.append(this.f96505a);
        sb3.append(", endImageUrl=");
        return a.a.p(sb3, this.f96506b, ")");
    }
}
