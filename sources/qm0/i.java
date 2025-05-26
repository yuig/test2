package qm0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f104280a;

    public i(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f104280a = board;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f104280a, ((i) obj).f104280a);
    }

    public final int hashCode() {
        return this.f104280a.hashCode();
    }

    public final String toString() {
        return "BoardArchived(board=" + this.f104280a + ")";
    }
}
