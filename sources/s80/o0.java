package s80;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f111733a;

    public o0(String draftId) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f111733a = draftId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && Intrinsics.d(this.f111733a, ((o0) obj).f111733a);
    }

    public final int hashCode() {
        return this.f111733a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DraftSelected(draftId="), this.f111733a, ")");
    }
}
