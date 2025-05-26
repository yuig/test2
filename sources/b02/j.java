package b02;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j extends m {

    /* renamed from: a, reason: collision with root package name */
    public final View f20781a;

    public j(View page) {
        Intrinsics.checkNotNullParameter(page, "page");
        this.f20781a = page;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f20781a, ((j) obj).f20781a);
    }

    public final int hashCode() {
        return this.f20781a.hashCode();
    }

    public final String toString() {
        return "RequestRefreshHeight(page=" + this.f20781a + ")";
    }
}
