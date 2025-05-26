package pm0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c0 implements k {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f100641a;

    public c0(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f100641a = board;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && Intrinsics.d(this.f100641a, ((c0) obj).f100641a);
    }

    public final int hashCode() {
        return this.f100641a.hashCode();
    }

    public final String toString() {
        return "LaunchGroupMessageFlow(board=" + this.f100641a + ")";
    }
}
