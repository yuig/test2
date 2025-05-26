package lm0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f83882a;

    public m0(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f83882a = board;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && Intrinsics.d(this.f83882a, ((m0) obj).f83882a);
    }

    public final int hashCode() {
        return this.f83882a.hashCode();
    }

    public final String toString() {
        return "LoadBoardTools(board=" + this.f83882a + ")";
    }
}
