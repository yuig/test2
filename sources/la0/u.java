package la0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    public final String f82468a;

    public u(String draftId) {
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        this.f82468a = draftId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f82468a, ((u) obj).f82468a);
    }

    public final int hashCode() {
        return this.f82468a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("DownloadImageTapped(draftId="), this.f82468a, ")");
    }
}
