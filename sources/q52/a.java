package q52;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f102575a;

    public a(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f102575a = boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f102575a, ((a) obj).f102575a);
    }

    public final int hashCode() {
        return this.f102575a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadingArgs(boardId="), this.f102575a, ")");
    }
}
