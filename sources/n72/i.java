package n72;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends k {

    /* renamed from: a, reason: collision with root package name */
    public final String f89726a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f89727b;

    public i(String message, Throwable error) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f89726a = message;
        this.f89727b = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f89726a, iVar.f89726a) && Intrinsics.d(this.f89727b, iVar.f89727b);
    }

    public final int hashCode() {
        return this.f89727b.hashCode() + (this.f89726a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(message=" + this.f89726a + ", error=" + this.f89727b + ")";
    }
}
