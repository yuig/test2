package ca0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s0 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27162a;

    public s0(String boardId) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f27162a = boardId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && Intrinsics.d(this.f27162a, ((s0) obj).f27162a);
    }

    public final int hashCode() {
        return this.f27162a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SetPreselectedBoardEffectRequest(boardId="), this.f27162a, ")");
    }
}
