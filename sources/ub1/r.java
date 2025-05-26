package ub1;

import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public final wy0.a f121738a;

    public r(wy0.a autoTaggingStatus) {
        Intrinsics.checkNotNullParameter(autoTaggingStatus, "autoTaggingStatus");
        this.f121738a = autoTaggingStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f121738a == ((r) obj).f121738a;
    }

    public final int hashCode() {
        return this.f121738a.hashCode();
    }

    public final String toString() {
        return "ToggleAutoProductTagging(autoTaggingStatus=" + this.f121738a + ")";
    }
}
