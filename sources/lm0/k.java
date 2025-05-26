package lm0;

import android.view.View;
import com.pinterest.api.model.ba;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k implements y {

    /* renamed from: a, reason: collision with root package name */
    public final View f83874a;

    /* renamed from: b, reason: collision with root package name */
    public final ba f83875b;

    public k(View view, ba section) {
        Intrinsics.checkNotNullParameter(section, "section");
        this.f83874a = view;
        this.f83875b = section;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f83874a, kVar.f83874a) && Intrinsics.d(this.f83875b, kVar.f83875b);
    }

    public final int hashCode() {
        View view = this.f83874a;
        return this.f83875b.hashCode() + ((view == null ? 0 : view.hashCode()) * 31);
    }

    public final String toString() {
        return "BoardSectionLongClicked(target=" + this.f83874a + ", section=" + this.f83875b + ")";
    }
}
