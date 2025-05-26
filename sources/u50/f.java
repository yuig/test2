package u50;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f120558a;

    public f(int i13) {
        this.f120558a = i13;
    }

    @Override // u50.a0
    public final Object a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Integer.valueOf(this.f120558a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f120558a == ((f) obj).f120558a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120558a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ColorInteger(colorInt="), this.f120558a, ")");
    }
}
