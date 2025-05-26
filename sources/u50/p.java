package u50;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p implements n {
    @Override // u50.a0
    public final Integer a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Integer.valueOf((int) (200 * context.getResources().getDisplayMetrics().density));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        ((p) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(200);
    }

    public final String toString() {
        return "DpLiteralDimen(dpLiteral=200)";
    }
}
