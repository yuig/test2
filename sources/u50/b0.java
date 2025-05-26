package u50;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 implements n {

    /* renamed from: a, reason: collision with root package name */
    public final int f120548a;

    public b0(int i13) {
        this.f120548a = i13;
    }

    @Override // u50.a0
    public final Integer a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Integer.valueOf(context.getResources().getDimensionPixelSize(this.f120548a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && this.f120548a == ((b0) obj).f120548a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120548a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ResourceDimen(resId="), this.f120548a, ")");
    }
}
