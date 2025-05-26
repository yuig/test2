package pm0;

import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f100690a;

    /* renamed from: b, reason: collision with root package name */
    public final String f100691b;

    /* renamed from: c, reason: collision with root package name */
    public final String f100692c;

    /* renamed from: d, reason: collision with root package name */
    public final wy0 f100693d;

    /* renamed from: e, reason: collision with root package name */
    public final String f100694e;

    public r(String activeUserId, v7 board) {
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(activeUserId, "activeUserId");
        this.f100690a = board;
        this.f100691b = activeUserId;
        String id3 = board.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f100692c = id3;
        wy0 k13 = board.k1();
        this.f100693d = k13;
        String id4 = k13 != null ? k13.getId() : null;
        this.f100694e = id4 == null ? "" : id4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f100690a, rVar.f100690a) && Intrinsics.d(this.f100691b, rVar.f100691b);
    }

    public final int hashCode() {
        return this.f100691b.hashCode() + (this.f100690a.hashCode() * 31);
    }

    public final String toString() {
        return "CollaboratorContext(board=" + this.f100690a + ", activeUserId=" + this.f100691b + ")";
    }
}
