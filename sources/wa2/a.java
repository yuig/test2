package wa2;

import android.app.Activity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a extends l {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Activity context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public abstract boolean h();

    public abstract void i(int i13);
}
