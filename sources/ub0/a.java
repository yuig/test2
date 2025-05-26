package ub0;

import a.c;
import android.content.Context;
import df.j1;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes.dex */
public final class a implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f121704a;

    /* renamed from: b, reason: collision with root package name */
    public final List f121705b;

    public a(String formatString, List formatArgs) {
        Intrinsics.checkNotNullParameter(formatString, "formatString");
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        this.f121704a = formatString;
        this.f121705b = formatArgs;
    }

    @Override // u50.a0
    public final CharSequence a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object[] array = this.f121705b.toArray(new Object[0]);
        return j1.Y(this.f121704a, Arrays.copyOf(array, array.length), null, 6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f121704a, aVar.f121704a) && Intrinsics.d(this.f121705b, aVar.f121705b);
    }

    public final int hashCode() {
        return this.f121705b.hashCode() + (this.f121704a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FormattedBidiText(formatString=");
        sb3.append(this.f121704a);
        sb3.append(", formatArgs=");
        return c.j(sb3, this.f121705b, ")");
    }
}
