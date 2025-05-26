package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e1 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f111507a;

    /* renamed from: b, reason: collision with root package name */
    public final sa0.d0 f111508b;

    public e1(String imageUrl, sa0.d0 imageSource) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageSource, "imageSource");
        this.f111507a = imageUrl;
        this.f111508b = imageSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return Intrinsics.d(this.f111507a, e1Var.f111507a) && this.f111508b == e1Var.f111508b;
    }

    public final int hashCode() {
        return this.f111508b.hashCode() + (this.f111507a.hashCode() * 31);
    }

    public final String toString() {
        return "LocalImageSelected(imageUrl=" + this.f111507a + ", imageSource=" + this.f111508b + ")";
    }
}
