package u50;

import android.content.Context;
import android.util.TypedValue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f120554a;

    public e(int i13) {
        this.f120554a = i13;
    }

    @Override // u50.a0
    public final Object a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(this.f120554a, typedValue, true);
        return Integer.valueOf(typedValue.data);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f120554a == ((e) obj).f120554a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f120554a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("ColorAttribute(colorAttr="), this.f120554a, ")");
    }
}
