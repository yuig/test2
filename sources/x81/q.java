package x81;

import android.graphics.Bitmap;
import kh2.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f134292b;

    public q(Bitmap photo) {
        Intrinsics.checkNotNullParameter(photo, "photo");
        this.f134292b = photo;
    }

    public final Bitmap e1() {
        return this.f134292b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f134292b, ((q) obj).f134292b);
    }

    public final int hashCode() {
        return this.f134292b.hashCode();
    }

    public final String toString() {
        return "PHOTO(photo=" + this.f134292b + ")";
    }
}
