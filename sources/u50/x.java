package u50;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x implements n {

    /* renamed from: a, reason: collision with root package name */
    public final int f120588a;

    public x(int i13) {
        this.f120588a = i13;
    }

    @Override // u50.a0
    public final Integer a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Integer.valueOf(this.f120588a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && this.f120588a == ((x) obj).f120588a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120588a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("LiteralDimen(fullyResolvedDimension="), this.f120588a, ")");
    }
}
