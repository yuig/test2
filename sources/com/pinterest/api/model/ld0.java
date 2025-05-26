package com.pinterest.api.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ld0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f39721a;

    public ld0(@NotNull String boardUid) {
        Intrinsics.checkNotNullParameter(boardUid, "boardUid");
        this.f39721a = boardUid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ld0) && Intrinsics.d(this.f39721a, ((ld0) obj).f39721a);
    }

    public final int hashCode() {
        return this.f39721a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RequestBoardDetailUpdateEvent(boardUid="), this.f39721a, ")");
    }
}
