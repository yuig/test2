package lm0;

import android.view.View;
import com.pinterest.api.model.ba;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final View f83899a;

    /* renamed from: b, reason: collision with root package name */
    public final ba f83900b;

    public t0(View view, ba section) {
        Intrinsics.checkNotNullParameter(section, "section");
        this.f83899a = view;
        this.f83900b = section;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.d(this.f83899a, t0Var.f83899a) && Intrinsics.d(this.f83900b, t0Var.f83900b);
    }

    public final int hashCode() {
        View view = this.f83899a;
        return this.f83900b.hashCode() + ((view == null ? 0 : view.hashCode()) * 31);
    }

    public final String toString() {
        return "ShowSectionContextualMenu(target=" + this.f83899a + ", section=" + this.f83900b + ")";
    }
}
