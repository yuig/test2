package qm0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f104354a;

    public x0(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f104354a = board;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x0) && Intrinsics.d(this.f104354a, ((x0) obj).f104354a);
    }

    public final int hashCode() {
        return this.f104354a.hashCode();
    }

    public final String toString() {
        return "UnarchiveBoard(board=" + this.f104354a + ")";
    }
}
