package s80;

import com.pinterest.api.model.fi0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final fi0 f111477a;

    public c1(fi0 draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        this.f111477a = draft;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && Intrinsics.d(this.f111477a, ((c1) obj).f111477a);
    }

    public final int hashCode() {
        return this.f111477a.hashCode();
    }

    public final String toString() {
        return "InitialDraftLoaded(draft=" + this.f111477a + ")";
    }
}
