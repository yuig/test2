package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p5 implements t5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f111755a;

    /* renamed from: b, reason: collision with root package name */
    public final sa0.d0 f111756b;

    public p5(String localImageUrl, sa0.d0 localImageSource) {
        Intrinsics.checkNotNullParameter(localImageUrl, "localImageUrl");
        Intrinsics.checkNotNullParameter(localImageSource, "localImageSource");
        this.f111755a = localImageUrl;
        this.f111756b = localImageSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj;
        return Intrinsics.d(this.f111755a, p5Var.f111755a) && this.f111756b == p5Var.f111756b && Intrinsics.d(null, null);
    }

    public final int hashCode() {
        return (this.f111756b.hashCode() + (this.f111755a.hashCode() * 31)) * 31;
    }

    public final String toString() {
        return "NavigateToCutoutEditor(localImageUrl=" + this.f111755a + ", localImageSource=" + this.f111756b + ", mask=null)";
    }
}
