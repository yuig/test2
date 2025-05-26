package yi1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final e f139071a;

    public b(e imageLoadingParams) {
        Intrinsics.checkNotNullParameter(imageLoadingParams, "imageLoadingParams");
        this.f139071a = imageLoadingParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f139071a, ((b) obj).f139071a);
    }

    public final int hashCode() {
        return this.f139071a.hashCode();
    }

    public final String toString() {
        return "LoadImage(imageLoadingParams=" + this.f139071a + ")";
    }
}
