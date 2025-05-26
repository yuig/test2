package wm1;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends z {

    /* renamed from: b, reason: collision with root package name */
    public final View f130338b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(View view) {
        super(a0.CUSTOM);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f130338b = view;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f130338b, ((v) obj).f130338b);
    }

    public final int hashCode() {
        return this.f130338b.hashCode();
    }

    public final String toString() {
        return "CustomDisplayState(view=" + this.f130338b + ")";
    }
}
