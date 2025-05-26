package m90;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f1 implements k1 {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f86649a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86650b;

    public f1(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f86649a = board;
        String id3 = board.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f86650b = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1) && Intrinsics.d(this.f86649a, ((f1) obj).f86649a);
    }

    @Override // m90.k1
    public final String getId() {
        return this.f86650b;
    }

    public final int hashCode() {
        return this.f86649a.hashCode();
    }

    public final String toString() {
        return "CollageContentBoardVMState(board=" + this.f86649a + ")";
    }
}
