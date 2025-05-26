package u50;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f120560a;

    public g(int i13) {
        this.f120560a = i13;
    }

    @Override // u50.a0
    public final Object a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Integer.valueOf(context.getColor(this.f120560a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f120560a == ((g) obj).f120560a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120560a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ColorResource(colorRes="), this.f120560a, ")");
    }
}
