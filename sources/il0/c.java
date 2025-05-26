package il0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final com.pinterest.feature.board.detail.b f72527a;

    public c(com.pinterest.feature.board.detail.b viewListener) {
        Intrinsics.checkNotNullParameter(viewListener, "viewListener");
        this.f72527a = viewListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f72527a, ((c) obj).f72527a);
    }

    public final int hashCode() {
        return this.f72527a.hashCode();
    }

    public final String toString() {
        return "ViewListenerCreated(viewListener=" + this.f72527a + ")";
    }
}
