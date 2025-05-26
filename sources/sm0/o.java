package sm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f113272a;

    public o(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f113272a = boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f113272a, ((o) obj).f113272a);
    }

    public final int hashCode() {
        return this.f113272a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SavedContentSectionRequestArgs(boardId="), this.f113272a, ")");
    }
}
