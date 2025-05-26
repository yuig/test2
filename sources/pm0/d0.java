package pm0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 implements p {

    /* renamed from: a, reason: collision with root package name */
    public final String f100646a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f100647b;

    public d0(String boardId, boolean z13) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f100646a = boardId;
        this.f100647b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.f100646a, d0Var.f100646a) && this.f100647b == d0Var.f100647b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f100647b) + (this.f100646a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LoadBoard(boardId=");
        sb3.append(this.f100646a);
        sb3.append(", loadFromRemote=");
        return a.a.r(sb3, this.f100647b, ")");
    }
}
