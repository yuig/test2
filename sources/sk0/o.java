package sk0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f113073a;

    public o(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f113073a = boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f113073a, ((o) obj).f113073a);
    }

    public final int hashCode() {
        return this.f113073a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("NavigateToRoomRepaint(boardId="), this.f113073a, ")");
    }
}
