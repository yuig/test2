package pm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f100708a;

    public z(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f100708a = boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.d(this.f100708a, ((z) obj).f100708a);
    }

    public final int hashCode() {
        return this.f100708a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("GroupMessageRequestInProgress(boardId="), this.f100708a, ")");
    }
}
