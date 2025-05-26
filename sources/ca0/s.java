package ca0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements u {

    /* renamed from: a, reason: collision with root package name */
    public final String f27161a;

    public s(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f27161a = boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && Intrinsics.d(this.f27161a, ((s) obj).f27161a);
    }

    public final int hashCode() {
        return this.f27161a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SetPreselectedBoard(boardId="), this.f27161a, ")");
    }
}
