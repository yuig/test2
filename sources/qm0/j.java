package qm0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f104284a;

    public j(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f104284a = board;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f104284a, ((j) obj).f104284a);
    }

    public final int hashCode() {
        return this.f104284a.hashCode();
    }

    public final String toString() {
        return "BoardUnarchived(board=" + this.f104284a + ")";
    }
}
