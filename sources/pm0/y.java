package pm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class y implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f100707a;

    public y(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f100707a = boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.d(this.f100707a, ((y) obj).f100707a);
    }

    public final int hashCode() {
        return this.f100707a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("GroupMessageRequestCompleted(boardId="), this.f100707a, ")");
    }
}
