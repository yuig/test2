package u50;

import android.content.Context;
import android.net.Uri;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f120574a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f120575b;

    public n0(String uriString, l0 resolveMethod) {
        Intrinsics.checkNotNullParameter(uriString, "uriString");
        Intrinsics.checkNotNullParameter(resolveMethod, "resolveMethod");
        this.f120574a = uriString;
        this.f120575b = resolveMethod;
    }

    @Override // u50.a0
    public final CharSequence a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (m0.f120573a[this.f120575b.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        String host = Uri.parse(this.f120574a).getHost();
        return host == null ? "" : host;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.d(this.f120574a, n0Var.f120574a) && this.f120575b == n0Var.f120575b;
    }

    public final int hashCode() {
        return this.f120575b.hashCode() + (this.f120574a.hashCode() * 31);
    }

    public final String toString() {
        return "StringUri(uriString=" + this.f120574a + ", resolveMethod=" + this.f120575b + ")";
    }
}
