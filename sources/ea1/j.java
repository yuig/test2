package ea1;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.v7;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f58065a;

    /* renamed from: b, reason: collision with root package name */
    public final ba f58066b;

    public j(v7 board, ba baVar) {
        Intrinsics.checkNotNullParameter(board, "board");
        this.f58065a = board;
        this.f58066b = baVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.d(this.f58065a, jVar.f58065a) && Intrinsics.d(this.f58066b, jVar.f58066b);
    }

    public final int hashCode() {
        int hashCode = this.f58065a.hashCode() * 31;
        ba baVar = this.f58066b;
        return hashCode + (baVar == null ? 0 : baVar.hashCode());
    }

    public final String toString() {
        return "BoardLoaded(board=" + this.f58065a + ", section=" + this.f58066b + ")";
    }
}
