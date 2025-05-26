package ys0;

import h32.i0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f140119a;

    public j(i0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f140119a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f140119a, ((j) obj).f140119a);
    }

    public final int hashCode() {
        return this.f140119a.hashCode();
    }

    public final String toString() {
        return "NavigateToPrivacyAndData(context=" + this.f140119a + ")";
    }
}
