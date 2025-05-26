package ca0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements u {

    /* renamed from: a, reason: collision with root package name */
    public final c f27113a;

    public g(c board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f27113a = board;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f27113a, ((g) obj).f27113a);
    }

    public final int hashCode() {
        return this.f27113a.hashCode();
    }

    public final String toString() {
        return "BoardPicked(board=" + this.f27113a + ")";
    }
}
