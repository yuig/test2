package u50;

import android.content.Context;
import android.content.res.Resources;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f120564a;

    /* renamed from: b, reason: collision with root package name */
    public final int f120565b;

    /* renamed from: c, reason: collision with root package name */
    public final List f120566c;

    public j0(int i13, int i14, List formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        this.f120564a = i13;
        this.f120565b = i14;
        this.f120566c = formatArgs;
    }

    @Override // u50.a0
    public final CharSequence a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        String[] strArr = (String[]) this.f120566c.toArray(new String[0]);
        String quantityString = resources.getQuantityString(this.f120564a, this.f120565b, Arrays.copyOf(strArr, strArr.length));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f120564a == j0Var.f120564a && this.f120565b == j0Var.f120565b && Intrinsics.d(this.f120566c, j0Var.f120566c);
    }

    public final int hashCode() {
        return this.f120566c.hashCode() + ep.b.b(this.f120565b, Integer.hashCode(this.f120564a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StringQuantityResource(resId=");
        sb3.append(this.f120564a);
        sb3.append(", quantity=");
        sb3.append(this.f120565b);
        sb3.append(", formatArgs=");
        return a.c.j(sb3, this.f120566c, ")");
    }
}
