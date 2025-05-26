package cj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 implements u {

    /* renamed from: a, reason: collision with root package name */
    public final String f27865a;

    public s0(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f27865a = boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && Intrinsics.d(this.f27865a, ((s0) obj).f27865a);
    }

    public final int hashCode() {
        return this.f27865a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("MarkFeedAsViewedRequest(boardId="), this.f27865a, ")");
    }
}
