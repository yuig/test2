package ta0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final String f116846a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f116847b;

    public a(String error, Throwable th3) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f116846a = error;
        this.f116847b = th3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f116846a, aVar.f116846a) && Intrinsics.d(this.f116847b, aVar.f116847b);
    }

    public final int hashCode() {
        int hashCode = this.f116846a.hashCode() * 31;
        Throwable th3 = this.f116847b;
        return hashCode + (th3 == null ? 0 : th3.hashCode());
    }

    public final String toString() {
        return "AddToCollageFailed(error=" + this.f116846a + ", throwable=" + this.f116847b + ")";
    }
}
