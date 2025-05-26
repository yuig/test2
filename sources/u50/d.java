package u50;

import android.content.Context;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements n {

    /* renamed from: a, reason: collision with root package name */
    public final int f120553a;

    public d(int i13) {
        this.f120553a = i13;
    }

    @Override // u50.a0
    public final Integer a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(this.f120553a, typedValue, true);
        return Integer.valueOf((int) typedValue.getDimension(context.getResources().getDisplayMetrics()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f120553a == ((d) obj).f120553a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120553a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("AttributeDimen(attrResId="), this.f120553a, ")");
    }
}
