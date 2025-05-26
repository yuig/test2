package sm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f113241a;

    public e(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f113241a = boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.d(this.f113241a, ((e) obj).f113241a);
    }

    public final int hashCode() {
        return this.f113241a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("BoardHeaderSectionRequestArgs(boardId="), this.f113241a, ")");
    }
}
