package qm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f104279a;

    public h1(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f104279a = boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1) && Intrinsics.d(this.f104279a, ((h1) obj).f104279a);
    }

    public final int hashCode() {
        return this.f104279a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("LoadPreviewTemplate(boardId="), this.f104279a, ")");
    }
}
