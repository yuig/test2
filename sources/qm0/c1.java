package qm0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c1 implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f104252a;

    public c1(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f104252a = board;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && Intrinsics.d(this.f104252a, ((c1) obj).f104252a);
    }

    public final int hashCode() {
        return this.f104252a.hashCode();
    }

    public final String toString() {
        return "ShowBoardOptions(board=" + this.f104252a + ")";
    }
}
