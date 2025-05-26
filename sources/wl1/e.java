package wl1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final String f130188a;

    public e(String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f130188a = imageUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f130188a, ((e) obj).f130188a);
    }

    public final int hashCode() {
        return this.f130188a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Image(imageUrl="), this.f130188a, ")");
    }
}
