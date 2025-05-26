package x81;

import android.graphics.Bitmap;
import kh2.s0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f134291b;

    public p(Bitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f134291b = image;
    }

    public final Bitmap e1() {
        return this.f134291b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f134291b, ((p) obj).f134291b);
    }

    public final int hashCode() {
        return this.f134291b.hashCode();
    }

    public final String toString() {
        return "MODEL(image=" + this.f134291b + ")";
    }
}
