package s80;

import com.pinterest.api.model.fi0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a5 implements b5 {

    /* renamed from: a, reason: collision with root package name */
    public final fi0 f111466a;

    public a5(fi0 draft) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        this.f111466a = draft;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5) && Intrinsics.d(this.f111466a, ((a5) obj).f111466a);
    }

    public final int hashCode() {
        return this.f111466a.hashCode();
    }

    public final String toString() {
        return "UpdateWithDraft(draft=" + this.f111466a + ")";
    }
}
