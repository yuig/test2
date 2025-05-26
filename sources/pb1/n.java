package pb1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n implements s {

    /* renamed from: a, reason: collision with root package name */
    public final String f99472a;

    /* renamed from: b, reason: collision with root package name */
    public final com.pinterest.feature.settings.passcode.d f99473b;

    public n(com.pinterest.feature.settings.passcode.d mode, String passcode) {
        Intrinsics.checkNotNullParameter(passcode, "passcode");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f99472a = passcode;
        this.f99473b = mode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f99472a, nVar.f99472a) && this.f99473b == nVar.f99473b;
    }

    public final int hashCode() {
        return this.f99473b.hashCode() + (this.f99472a.hashCode() * 31);
    }

    public final String toString() {
        return "SubmitPasscodeSideEffectRequest(passcode=" + this.f99472a + ", mode=" + this.f99473b + ")";
    }
}
