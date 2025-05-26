package um0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f122683a;

    public a0(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f122683a = boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f122683a, ((a0) obj).f122683a);
    }

    public final int hashCode() {
        return this.f122683a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("NotifyReorderCompleted(boardId="), this.f122683a, ")");
    }
}
