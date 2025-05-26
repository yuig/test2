package ml0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f87438a;

    public a0(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f87438a = boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && Intrinsics.d(this.f87438a, ((a0) obj).f87438a);
    }

    public final int hashCode() {
        return this.f87438a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadPreviousHeaderImage(boardId="), this.f87438a, ")");
    }
}
