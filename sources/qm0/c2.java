package qm0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c2 implements a {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f104253a;

    /* renamed from: b, reason: collision with root package name */
    public final om0.n f104254b;

    /* renamed from: c, reason: collision with root package name */
    public final String f104255c;

    public c2(v7 board, om0.n collaboratorState) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(collaboratorState, "collaboratorState");
        this.f104253a = board;
        this.f104254b = collaboratorState;
        String id3 = board.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f104255c = id3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return Intrinsics.d(this.f104253a, c2Var.f104253a) && Intrinsics.d(this.f104254b, c2Var.f104254b);
    }

    @Override // qm0.a
    public final String getId() {
        return this.f104255c;
    }

    public final int hashCode() {
        return this.f104254b.hashCode() + (this.f104253a.hashCode() * 31);
    }

    public final String toString() {
        return "FullBoardHeader(board=" + this.f104253a + ", collaboratorState=" + this.f104254b + ")";
    }
}
