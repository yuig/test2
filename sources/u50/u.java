package u50;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u extends rl2.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f120582a;

    public u(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f120582a = drawable;
    }

    @Override // u50.a0
    public final Object a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f120582a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f120582a, ((u) obj).f120582a);
    }

    public final int hashCode() {
        return this.f120582a.hashCode();
    }

    public final String toString() {
        return "ImageDrawable(drawable=" + this.f120582a + ")";
    }
}
