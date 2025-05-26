package tk0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements y {

    /* renamed from: a, reason: collision with root package name */
    public final String f118001a;

    public v(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f118001a = boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f118001a, ((v) obj).f118001a);
    }

    public final int hashCode() {
        return this.f118001a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadBoard(boardId="), this.f118001a, ")");
    }
}
