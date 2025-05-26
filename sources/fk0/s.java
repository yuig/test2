package fk0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s implements u {

    /* renamed from: a, reason: collision with root package name */
    public final String f62323a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f62324b;

    public s(String boardName, boolean z13) {
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        this.f62323a = boardName;
        this.f62324b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f62323a, sVar.f62323a) && this.f62324b == sVar.f62324b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62324b) + (this.f62323a.hashCode() * 31);
    }

    public final String toString() {
        return "CreateBoardRequest(boardName=" + this.f62323a + ", isSecretBoard=" + this.f62324b + ")";
    }
}
