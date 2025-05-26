package nl0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f91238a;

    public a(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f91238a = boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f91238a, ((a) obj).f91238a);
    }

    public final int hashCode() {
        return this.f91238a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadingArgs(boardId="), this.f91238a, ")");
    }
}
