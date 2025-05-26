package fk0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final String f62276a;

    public c(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f62276a = boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f62276a, ((c) obj).f62276a);
    }

    public final int hashCode() {
        return this.f62276a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("CreateBoardSuccess(boardId="), this.f62276a, ")");
    }
}
