package pb1;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class p implements s {

    /* renamed from: a, reason: collision with root package name */
    public final com.pinterest.feature.settings.passcode.d f99475a;

    /* renamed from: b, reason: collision with root package name */
    public final String f99476b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f99477c;

    public p(com.pinterest.feature.settings.passcode.d mode, String passcode, i0 message) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(passcode, "passcode");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f99475a = mode;
        this.f99476b = passcode;
        this.f99477c = message;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f99475a == pVar.f99475a && Intrinsics.d(this.f99476b, pVar.f99476b) && Intrinsics.d(this.f99477c, pVar.f99477c);
    }

    public final int hashCode() {
        return this.f99477c.hashCode() + cb.d(this.f99476b, this.f99475a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VerifyPasscodeSuccessSideEffectRequest(mode=");
        sb3.append(this.f99475a);
        sb3.append(", passcode=");
        sb3.append(this.f99476b);
        sb3.append(", message=");
        return jq.b.k(sb3, this.f99477c, ")");
    }
}
