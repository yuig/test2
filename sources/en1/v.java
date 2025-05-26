package en1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final rl2.g0 f59700a;

    public v(rl2.g0 image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f59700a = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f59700a, ((v) obj).f59700a);
    }

    public final int hashCode() {
        return this.f59700a.hashCode();
    }

    public final String toString() {
        return "Image(image=" + this.f59700a + ")";
    }
}
