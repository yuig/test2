package gx;

import com.pinterest.api.model.h2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final h2 f66244a;

    public c(h2 category) {
        Intrinsics.checkNotNullParameter(category, "category");
        this.f66244a = category;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f66244a, ((c) obj).f66244a);
    }

    public final int hashCode() {
        return this.f66244a.hashCode();
    }

    public final String toString() {
        return "OnCategoryTap(category=" + this.f66244a + ")";
    }
}
