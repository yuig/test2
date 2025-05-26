package sa0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t implements w {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f112193a;

    public t() {
        Intrinsics.checkNotNullParameter("Failed to create shuffle asset", "error");
        this.f112193a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        tVar.getClass();
        return Intrinsics.d("Failed to create shuffle asset", "Failed to create shuffle asset") && Intrinsics.d(this.f112193a, tVar.f112193a);
    }

    public final int hashCode() {
        Throwable th3 = this.f112193a;
        return 1367695417 + (th3 == null ? 0 : th3.hashCode());
    }

    public final String toString() {
        return "CutoutRepinPrepFailed(error=Failed to create shuffle asset, throwable=" + this.f112193a + ")";
    }
}
