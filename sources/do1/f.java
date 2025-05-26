package do1;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f55677a;

    public f(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f55677a = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f55677a, ((f) obj).f55677a);
    }

    public final int hashCode() {
        return this.f55677a.hashCode();
    }

    public final String toString() {
        return "Drawable(drawable=" + this.f55677a + ")";
    }
}
