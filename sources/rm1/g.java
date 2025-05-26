package rm1;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class g {
    public final int a() {
        if (this instanceof f) {
            return ((f) this).f108703b.getDimenAttrRes();
        }
        if (this instanceof e) {
            return ((e) this).d().getDimenAttrRes();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this instanceof f) {
            return ((f) this).f108702a.drawableRes(context);
        }
        if (this instanceof e) {
            return ((e) this).c().drawableRes(context);
        }
        throw new NoWhenBranchMatchedException();
    }
}
