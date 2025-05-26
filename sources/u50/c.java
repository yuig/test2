package u50;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f120549a;

    public c(int i13) {
        this.f120549a = i13;
    }

    @Override // u50.a0
    public final Object a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Integer.valueOf(this.f120549a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f120549a == ((c) obj).f120549a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120549a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("AlphaInteger(alphaInt="), this.f120549a, ")");
    }
}
