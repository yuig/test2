package cj0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i0 implements h {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f27834a;

    public i0(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f27834a = board;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && Intrinsics.d(this.f27834a, ((i0) obj).f27834a);
    }

    public final int hashCode() {
        return this.f27834a.hashCode();
    }

    public final String toString() {
        return "BoardLoaded(board=" + this.f27834a + ")";
    }
}
