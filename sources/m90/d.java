package m90;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f86642a;

    public d(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f86642a = board;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f86642a, ((d) obj).f86642a);
    }

    public final int hashCode() {
        return this.f86642a.hashCode();
    }

    public final String toString() {
        return "BoardClicked(board=" + this.f86642a + ")";
    }
}
