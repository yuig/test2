package bx0;

import android.content.Context;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24085a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f24086b;

    public r(Context context, i0 pinalyticsContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        this.f24085a = context;
        this.f24086b = pinalyticsContext;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f24085a, rVar.f24085a) && Intrinsics.d(this.f24086b, rVar.f24086b);
    }

    public final int hashCode() {
        return this.f24086b.hashCode() + (this.f24085a.hashCode() * 31);
    }

    public final String toString() {
        return "TitleButtonClicked(context=" + this.f24085a + ", pinalyticsContext=" + this.f24086b + ")";
    }
}
