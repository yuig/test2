package fk0;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes5.dex */
public final class w implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f62328a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f62329b;

    public w(String boardName, boolean z13) {
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        this.f62328a = boardName;
        this.f62329b = z13;
    }

    public static w b(w wVar, String boardName, boolean z13, int i13) {
        if ((i13 & 1) != 0) {
            boardName = wVar.f62328a;
        }
        if ((i13 & 2) != 0) {
            z13 = wVar.f62329b;
        }
        wVar.getClass();
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        return new w(boardName, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.d(this.f62328a, wVar.f62328a) && this.f62329b == wVar.f62329b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62329b) + (this.f62328a.hashCode() * 31);
    }

    public final String toString() {
        return "BoardCreateVMState(boardName=" + this.f62328a + ", isSecretBoard=" + this.f62329b + ")";
    }
}
