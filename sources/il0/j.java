package il0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final com.pinterest.feature.board.detail.b f72533a;

    public j(com.pinterest.feature.board.detail.b viewListener) {
        Intrinsics.checkNotNullParameter(viewListener, "viewListener");
        this.f72533a = viewListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f72533a, ((j) obj).f72533a);
    }

    public final int hashCode() {
        return this.f72533a.hashCode();
    }

    public final String toString() {
        return "SetListenterRequest(viewListener=" + this.f72533a + ")";
    }
}
