package ra0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f106950a;

    public j0(String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f106950a = imageUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && Intrinsics.d(this.f106950a, ((j0) obj).f106950a);
    }

    public final int hashCode() {
        return this.f106950a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("CutoutDisplayState(imageUrl="), this.f106950a, ")");
    }
}
