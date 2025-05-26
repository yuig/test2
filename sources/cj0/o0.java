package cj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 implements u {

    /* renamed from: a, reason: collision with root package name */
    public final String f27854a;

    public o0(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f27854a = boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && Intrinsics.d(this.f27854a, ((o0) obj).f27854a);
    }

    public final int hashCode() {
        return this.f27854a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadBoardRequest(boardId="), this.f27854a, ")");
    }
}
