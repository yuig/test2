package u50;

import android.content.Context;
import android.graphics.Color;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f120561a;

    public h(String colorString) {
        Intrinsics.checkNotNullParameter(colorString, "colorString");
        this.f120561a = colorString;
    }

    @Override // u50.a0
    public final Object a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Integer.valueOf(Color.parseColor(this.f120561a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && Intrinsics.d(this.f120561a, ((h) obj).f120561a);
    }

    public final int hashCode() {
        return this.f120561a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ColorString(colorString="), this.f120561a, ")");
    }
}
