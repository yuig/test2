package pm0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f100689a;

    public q(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f100689a = board;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.d(this.f100689a, ((q) obj).f100689a);
    }

    public final int hashCode() {
        return this.f100689a.hashCode();
    }

    public final String toString() {
        return "BoardLoaded(board=" + this.f100689a + ")";
    }
}
