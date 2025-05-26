package qm0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f104274a;

    public g1(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f104274a = board;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && Intrinsics.d(this.f104274a, ((g1) obj).f104274a);
    }

    public final int hashCode() {
        return this.f104274a.hashCode();
    }

    public final String toString() {
        return "LoadBoardTools(board=" + this.f104274a + ")";
    }
}
