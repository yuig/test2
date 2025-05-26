package bx0;

import android.content.Context;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements s {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f24078a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f24079b;

    public m(Context context, i0 pinalyticsContext) {
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f24078a = pinalyticsContext;
        this.f24079b = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f24078a, mVar.f24078a) && Intrinsics.d(this.f24079b, mVar.f24079b);
    }

    public final int hashCode() {
        return this.f24079b.hashCode() + (this.f24078a.hashCode() * 31);
    }

    public final String toString() {
        return "ActionPressed(pinalyticsContext=" + this.f24078a + ", context=" + this.f24079b + ")";
    }
}
