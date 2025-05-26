package xs;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s implements y {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f135756a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f135757b;

    public s(Throwable th3, Integer num) {
        this.f135756a = th3;
        this.f135757b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.d(this.f135756a, sVar.f135756a) && Intrinsics.d(this.f135757b, sVar.f135757b);
    }

    public final int hashCode() {
        Throwable th3 = this.f135756a;
        int hashCode = (th3 == null ? 0 : th3.hashCode()) * 31;
        Integer num = this.f135757b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "LaunchRetailerErrorScreen(error=" + this.f135756a + ", errorCode=" + this.f135757b + ")";
    }
}
