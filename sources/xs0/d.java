package xs0;

import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f135782a;

    public d(v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f135782a = board;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && Intrinsics.d(this.f135782a, ((d) obj).f135782a);
    }

    public final int hashCode() {
        return this.f135782a.hashCode();
    }

    public final String toString() {
        return "ToggleBoardSetting(board=" + this.f135782a + ")";
    }
}
