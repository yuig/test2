package u52;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f120725a;

    /* renamed from: b, reason: collision with root package name */
    public final int f120726b;

    public p0(String boardId, int i13) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f120725a = boardId;
        this.f120726b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Intrinsics.d(this.f120725a, p0Var.f120725a) && this.f120726b == p0Var.f120726b;
    }

    public final int hashCode() {
        return Integer.hashCode(25) + ep.b.b(this.f120726b, this.f120725a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LoadPins(boardId=");
        sb3.append(this.f120725a);
        sb3.append(", boardPinsCount=");
        return a.a.n(sb3, this.f120726b, ", templatePinsCount=25)");
    }
}
