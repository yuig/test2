package ew0;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f60338c = new a(500, new AccelerateDecelerateInterpolator());

    /* renamed from: a, reason: collision with root package name */
    public final long f60339a;

    /* renamed from: b, reason: collision with root package name */
    public final Interpolator f60340b;

    public a(long j13, Interpolator interpolator) {
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        this.f60339a = j13;
        this.f60340b = interpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f60339a == aVar.f60339a && Intrinsics.d(this.f60340b, aVar.f60340b);
    }

    public final int hashCode() {
        return this.f60340b.hashCode() + (Long.hashCode(this.f60339a) * 31);
    }

    public final String toString() {
        return "FocusChangeAnimation(durationMs=" + this.f60339a + ", interpolator=" + this.f60340b + ")";
    }
}
