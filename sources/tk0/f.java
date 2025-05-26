package tk0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements q {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f117961a;

    public f(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f117961a = board;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && Intrinsics.d(this.f117961a, ((f) obj).f117961a);
    }

    public final int hashCode() {
        return this.f117961a.hashCode();
    }

    public final String toString() {
        return "BoardLoaded(board=" + this.f117961a + ")";
    }
}
