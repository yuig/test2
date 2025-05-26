package pm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f0 implements k {

    /* renamed from: a, reason: collision with root package name */
    public final String f100658a;

    public f0(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f100658a = boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && Intrinsics.d(this.f100658a, ((f0) obj).f100658a);
    }

    public final int hashCode() {
        return this.f100658a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadCollaborators(boardId="), this.f100658a, ")");
    }
}
