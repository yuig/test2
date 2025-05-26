package bx0;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24087a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24088b;

    public t(Context context, String action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f24087a = context;
        this.f24088b = action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f24087a, tVar.f24087a) && Intrinsics.d(this.f24088b, tVar.f24088b);
    }

    public final int hashCode() {
        return this.f24088b.hashCode() + (this.f24087a.hashCode() * 31);
    }

    public final String toString() {
        return "NavigateToAction(context=" + this.f24087a + ", action=" + this.f24088b + ")";
    }
}
