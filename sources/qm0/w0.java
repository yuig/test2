package qm0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f104351a;

    public w0(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f104351a = board;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && Intrinsics.d(this.f104351a, ((w0) obj).f104351a);
    }

    public final int hashCode() {
        return this.f104351a.hashCode();
    }

    public final String toString() {
        return "ArchiveBoard(board=" + this.f104351a + ")";
    }
}
