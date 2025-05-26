package sk0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f113072a;

    public n(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f113072a = boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.d(this.f113072a, ((n) obj).f113072a);
    }

    public final int hashCode() {
        return this.f113072a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("NavigateToMoreIdeas(boardId="), this.f113072a, ")");
    }
}
